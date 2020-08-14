package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.thymeleaf.TemplateEngine;
//import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;
import org.thymeleaf.templateresolver.FileTemplateResolver;

import javax.annotation.PostConstruct;

@Configuration
public class ThymeleafConfig {


/*    @Qualifier("templateEngine")
    @Autowired
    private SpringTemplateEngine springTemplateEngine;

    @PostConstruct
    public void extension() {
        FileTemplateResolver templateResolver = new FileTemplateResolver();
        templateResolver.setPrefix("templates/");
        templateResolver.setSuffix(".html");
        templateResolver.setCacheable(false);
        templateResolver.setTemplateMode("HTML5");
        springTemplateEngine.addTemplateResolver(templateResolver);
    }*/
/*
    @Bean
    public SpringTemplateEngine thymeleafTemplateEngine() {
        return new SpringTemplateEngine();
    }*/
/*    @Bean
    public TemplateEngine thymeLeafTemplateEngine() {
        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(thymeleafTemplateResolver());
        return templateEngine;
    }

    @Bean
    public ClassLoaderTemplateResolver thymeleafTemplateResolver() {
        ClassLoaderTemplateResolver templateResolver = new ClassLoaderTemplateResolver();
        templateResolver.setPrefix("templates/");
        templateResolver.setSuffix(".html");
        templateResolver.setCacheable(false);
        templateResolver.setTemplateMode("HTML5");
        return templateResolver;
    }*/

/*    @Bean
    public ThymeleafViewResolver thymeleafViewResolver() {
        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
        viewResolver.setTemplateEngine(templateEngine());
        return viewResolver;
    }*/
}