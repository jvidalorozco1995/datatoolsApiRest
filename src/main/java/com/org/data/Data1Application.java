package com.org.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.CorsRegistration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication(scanBasePackages={
"com.org.data", "com.org.data.services"})
public class Data1Application extends SpringBootServletInitializer {

	@Autowired
    private Environment env;
	
	public static void main(String[] args) {
		SpringApplication.run(Data1Application.class, args);
	}
	
	@Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                String urls = env.getProperty("cors.urls");
                CorsRegistration reg = registry.addMapping("/api/**");
                for(String url: urls.split(",")) {
                    reg.allowedOrigins(url);
                }
            }
        };
    }  

}
