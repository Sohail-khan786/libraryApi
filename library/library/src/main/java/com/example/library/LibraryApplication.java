package com.example.library;

import java.util.Collections;

import javax.servlet.ServletContext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.paths.RelativePathProvider;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class LibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}
    
	@Bean
	public Docket swaggerConfiguration(ServletContext servletContext) {
		return new Docket(DocumentationType.SWAGGER_2)
				.pathProvider(new RelativePathProvider(servletContext) {
                    @Override
                    public String getApplicationBasePath() {
                        return "/library";
                    }
                })
				.select()
				.paths(PathSelectors.ant("/library/*"))
				.apis(RequestHandlerSelectors.basePackage("com.example.library"))
				.build()
				.apiInfo(apiDetail());
	}

	private ApiInfo apiDetail() {
		return new ApiInfo(
				"Library Api",
				"API to perform CRUD operations on different Entities of Library Databse",
				"1.0", 
				"", 
				new springfox.documentation.service.Contact("Sohail Khan","https://www.linkedin.com/in/sohail-khan-b04378155", "khansohail0540@gmail.com"),
				"Api License", 
				"http://localhost:9002/library/", 
				Collections.emptyList()
				);
	}
}
