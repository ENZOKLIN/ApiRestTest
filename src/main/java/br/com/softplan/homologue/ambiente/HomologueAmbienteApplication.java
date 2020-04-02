package br.com.softplan.homologue.ambiente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class HomologueAmbienteApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(HomologueAmbienteApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(HomologueAmbienteApplication.class, args);
    }

}
