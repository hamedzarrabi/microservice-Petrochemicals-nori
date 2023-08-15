package com.hami.organizationservice;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Organization Service REST API",
				description = "Organization service REST APIs Documentation",
				version = "v1.0",
				contact = @Contact(
						name = "Hamed",
						email = "hamed.zarrabi87@gmail.com",
						url = "https://www.github.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.github.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Organization-Service Doc",
				url = "https://www.github.com"
		)
)
//@EnableEurekaClient
public class OrganizationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrganizationServiceApplication.class, args);
	}

}
