package com.admiral.rest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

import java.util.Collections;

@Configuration
public class SwaggerConfig {
    private Contact swaggerContact(){
        Contact admiralRest = new Contact();
        admiralRest.setName("Carlos Villanueva");
        admiralRest.setEmail("cevabarcvilla@gmail.com");
        admiralRest.setUrl("https://github.com/ceveloper7/admiralrest");
        return admiralRest;
    }

    private License swaggerLicense(){
        License admiralRestLicense = new License();
        admiralRestLicense.setName("Apache 2.0");
        admiralRestLicense.setUrl("http://www.apache.org/licenses/LICENSE-2.0");
        admiralRestLicense.setExtensions(Collections.emptyMap());
        return admiralRestLicense;
    }

    @Bean
    OpenAPI customOpenApi(){
        return new OpenAPI().components(new Components()).info(new Info()
                .title("REST ADmiral ERP backend Api Documentation").version("1.0")
                .termsOfService("REST ADmiral backend terms of services")
                .description("This the REST API documentation of the ADmiral backend")
                .license(swaggerLicense()).contact(swaggerContact()));
    }
}
