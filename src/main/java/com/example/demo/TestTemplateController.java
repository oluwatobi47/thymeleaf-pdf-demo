package com.example.demo;

import com.example.demo.models.EducationalHistory;
import com.example.demo.models.Resume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.stream.Collectors;

@Controller
public class TestTemplateController {

    private String message = "Hello there";


    @Autowired
    private TemplateParser templateParser;

    @Autowired
    private HTMLToPDFService htmlToPDFService;

    @GetMapping("/")
    public String main(Model modal) {
        Resume resume = new Resume();
        resume.setAddress("Lagos");
        resume.setName("John Doe");
        resume.setPhoneNumber("08000000000");
        EducationalHistory educationalHistory1 = new EducationalHistory("Unilag", "Tertiary", "2010", "2014");
        EducationalHistory educationalHistory2 = new EducationalHistory("Covenant University", "Tertiary", "2016", "2017");
        EducationalHistory educationalHistory3 = new EducationalHistory("MIT", "Tertiary", "2017", "2020");
        resume.setEducationalHistoryList(Arrays.asList(educationalHistory1, educationalHistory2, educationalHistory3));

        String templateString = null;
        try {
            templateString = templateParser.parseThymeleafTemplate("test","resume", resume);
            htmlToPDFService.generatePdfFromHtml(templateString, "test-html");
        } catch (Exception e) {
            e.printStackTrace();
        }
        //create file that can be converted to pdf with template string
        System.out.println(templateString);

        modal.addAttribute("resume", resume);
        //more than one attribute can be added
        return "test"; //view, located in the resources folder
    }

}
