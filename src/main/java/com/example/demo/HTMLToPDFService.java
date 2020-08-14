package com.example.demo;

import org.springframework.stereotype.Service;
import org.xhtmlrenderer.pdf.ITextRenderer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * Created by Oluwatobi on 8/14/2020.
 */
@Service
public class HTMLToPDFService {


    public void generatePdfFromHtml(String html, String fileName) throws Exception {
        String outputFolder = System.getProperty("user.home") + File.separator + fileName +".pdf";
        OutputStream outputStream = new FileOutputStream(outputFolder);

        ITextRenderer renderer = new ITextRenderer();
        renderer.setDocumentFromString(html);
        renderer.layout();
        renderer.createPDF(outputStream);

        outputStream.close();
    }

}
