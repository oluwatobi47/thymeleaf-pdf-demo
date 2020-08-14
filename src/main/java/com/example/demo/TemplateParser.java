package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.context.IExpressionContext;
import org.thymeleaf.linkbuilder.StandardLinkBuilder;
import org.thymeleaf.spring5.SpringTemplateEngine;

import java.util.Map;


@Service
public class TemplateParser {

    private final SpringTemplateEngine thymeleafTemplateEngine;

    public TemplateParser(SpringTemplateEngine thymeleafTemplateEngine) {
        this.thymeleafTemplateEngine = thymeleafTemplateEngine;
        this.thymeleafTemplateEngine.setLinkBuilder(new StandardLinkBuilder() {
            @Override
            protected String computeContextPath(
                    final IExpressionContext context, final String base, final Map<String, Object> parameters) {
                return "/";
            }
        });

    }

    String parseThymeleafTemplate(String templateName, String objectKey, Object data) throws Exception {
        Context context = new Context();
        context.setVariable(objectKey, data);
        return thymeleafTemplateEngine.process(templateName, context);
    }
}
