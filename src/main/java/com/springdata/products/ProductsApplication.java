package com.springdata.products;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
