package com.bstek.microService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bstek.dorado.web.boot.DoradoApplicationInitlizalizer;

@SpringBootApplication
public class DoradoMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(DoradoMicroServiceApplication.class);
		DoradoApplicationInitlizalizer initlizalizer = new DoradoApplicationInitlizalizer();
		try {
			app.addInitializers(initlizalizer.getContextInitializer());
			initlizalizer.initSpringApplication(app);
		} catch (Exception e) {
			e.printStackTrace();
		}
		app.run(args);

	}

}
