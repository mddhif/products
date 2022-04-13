package com.springdata.products;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;


@SpringBootApplication
public class ProductsApplication extends SpringBootServletInitializer  {

	public static void main(String[] args) {
		SpringApplication.run(ProductsApplication.class, args);
	}
	
	 @Override
        protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
            return builder.sources(ProductsApplication.class);
  }

}
