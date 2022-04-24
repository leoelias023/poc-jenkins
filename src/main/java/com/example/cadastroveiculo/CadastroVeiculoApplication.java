package com.example.cadastroveiculo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.thymeleaf.messageresolver.IMessageResolver;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.templatemode.TemplateMode;

@SpringBootApplication
public class CadastroVeiculoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CadastroVeiculoApplication.class, args);
    }
}
