package com.bstek.microService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Configuration {

	// API接口包扫描路径
	public static final String SWAGGER_SCAN_BASE_PACKAGE = "com.bstek.microService";
	// 版本号
	public static final String VERSION = "0.0.1";
	// 设置文档的标题
	public static final String TITLE = "Doardo9 微服务示例";
	// 设置文档的描述
	public static final String DESCRIPTION = "Doardo9 微服务示例 API 接口文档";
	// 服务条款网址
	public static final String termsOfServiceUrl = "http://www.bstek.com";

	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
				.apis(RequestHandlerSelectors.basePackage(SWAGGER_SCAN_BASE_PACKAGE))
				.paths(PathSelectors.any()) // 可以根据url路径设置哪些请求加入文档，忽略哪些请求
				.build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title(TITLE) // 设置文档的标题
				.description(DESCRIPTION) // 设置文档的描述
				.version(VERSION) // 设置文档的版本信息-> 1.0.0 Version information
				.termsOfServiceUrl(termsOfServiceUrl) // 服务条款网址
				.contact(new Contact("Sky", "http://wwww.bstek.com", "sky.zhang@bstek.com"))//联系人信息
				.build();
	}

}
