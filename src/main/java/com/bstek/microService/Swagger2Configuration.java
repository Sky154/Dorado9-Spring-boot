package com.bstek.microService;

import org.springframework.beans.factory.annotation.Value;
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
	@Value("${swagger.base-package}")
	private String swagger_scan_base_package;
	// 版本号
	@Value("${swagger.version}")
	private String version;
	// 设置文档的标题
	@Value("${swagger.title}")
	private String title;
	// 设置文档的描述
	@Value("${swagger.description}")
	private String description;
	//许可证
	@Value("${swagger.license}")
	private String license;
	//许可证URL
	@Value("${swagger.licenseUrl}")
	private String licenseUrl;
	// 服务条款网址
	@Value("${swagger.termsOfServiceUrl}")
	private String termsOfServiceUrl;
	// 服务条款网址
	@Value("${swagger.contact.name}")
	private String contact_name;
	// 服务条款网址
	@Value("${swagger.contact.url}")
	private String contact_url;
	// 服务条款网址
	@Value("${swagger.contact.email}")
	private String contact_email;

	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
				.apis(RequestHandlerSelectors.basePackage(swagger_scan_base_package)).paths(PathSelectors.any()) // 可以根据url路径设置哪些请求加入文档，忽略哪些请求
				.build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title(title) // 设置文档的标题
				.description(description) // 设置文档的描述
				.version(version) // 设置文档的版本信息-> 1.0.0 Version information
				.license(license) //许可证
				.licenseUrl(licenseUrl) //许可证URL
				.termsOfServiceUrl(termsOfServiceUrl) // 服务条款网址
				.contact(new Contact(contact_name, contact_url, contact_email))// 联系人信息
				.build();
	}

}
