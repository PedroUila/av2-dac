package com.projeto.av2_dac.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
public class SwaggerConfig {

	@Bean
	public Docket customAPI() {
		return new Docket(DocumentationType.SWAGGER_2)
			.select()
			.apis(RequestHandlerSelectors.basePackage("com.projeto.av2_adc"))
			.paths(PathSelectors.any())
			.build()
			.pathMapping("/api")
			.apiInfo(metaInfo());
	}
	
	private ApiInfo metaInfo() {
		@SuppressWarnings("rawtypes")
		ApiInfo apiInfo = new ApiInfo(
				"Av2 Aplicações Corporativas", 
				null,
				"1.0", 
				"código simples", 
				new Contact("Pedro Uila\nFrancisco Thalles", null, null),null, null, new ArrayList<VendorExtension>()
		);
		
		return apiInfo;
	}
		
}
