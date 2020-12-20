package com.org.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={
"com.org.data", "com.org.data.services"})
public class Data1Application {

	public static void main(String[] args) {
		SpringApplication.run(Data1Application.class, args);
	}

}
