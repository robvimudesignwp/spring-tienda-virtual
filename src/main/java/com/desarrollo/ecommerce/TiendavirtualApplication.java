package com.desarrollo.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class TiendavirtualApplication {

	public static void main(String[] args) {
		SpringApplication.run(TiendavirtualApplication.class, args);
	}

}
