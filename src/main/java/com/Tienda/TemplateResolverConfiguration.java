package com.Tienda;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.templatemode.TemplateMode;

@Configuration
public class TemplateResolverConfiguration {

    @Bean
    public SpringResourceTemplateResolver templetaResolver_0() {
        SpringResourceTemplateResolver templetaResolver = new SpringResourceTemplateResolver();
        templetaResolver.setPrefix("classpath:/templates");
        templetaResolver.setSuffix(".html");
        templetaResolver.setTemplateMode(TemplateMode.HTML);
        templetaResolver.setCharacterEncoding("UTF-8");
        templetaResolver.setOrder(0);
        templetaResolver.setCheckExistence(true);
        return templetaResolver;
    }
    
    @Bean
    public SpringResourceTemplateResolver templetaResolver_1() {
        SpringResourceTemplateResolver templetaResolver = new SpringResourceTemplateResolver();
        templetaResolver.setPrefix("templates/categoria");
        templetaResolver.setSuffix(".html");
        templetaResolver.setTemplateMode(TemplateMode.HTML);
        templetaResolver.setCharacterEncoding("UTF-8");
        templetaResolver.setOrder(1);
        templetaResolver.setCheckExistence(true);
        return templetaResolver;
    }
    
    @Bean
    public SpringResourceTemplateResolver templetaResolver_2() {
        SpringResourceTemplateResolver templetaResolver = new SpringResourceTemplateResolver();
        templetaResolver.setPrefix("templates/articulo");
        templetaResolver.setSuffix(".html");
        templetaResolver.setTemplateMode(TemplateMode.HTML);
        templetaResolver.setCharacterEncoding("UTF-8");
        templetaResolver.setOrder(2);
        templetaResolver.setCheckExistence(true);
        return templetaResolver;
    }
    
    @Bean
    public SpringResourceTemplateResolver templetaResolver_3() {
        SpringResourceTemplateResolver templetaResolver = new SpringResourceTemplateResolver();
        templetaResolver.setPrefix("templates/cliente");
        templetaResolver.setSuffix(".html");
        templetaResolver.setTemplateMode(TemplateMode.HTML);
        templetaResolver.setCharacterEncoding("UTF-8");
        templetaResolver.setOrder(3);
        templetaResolver.setCheckExistence(true);
        return templetaResolver;
    }
}
