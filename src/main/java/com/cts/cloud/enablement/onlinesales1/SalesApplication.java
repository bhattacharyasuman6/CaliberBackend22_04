package com.cts.cloud.enablement.onlinesales1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.cts.cloud.enablement.onlinesales1.filter.JwtFilter;

@SpringBootApplication
public class SalesApplication {

	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Bean
	public FilterRegistrationBean jwtFilter() {
		final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		registrationBean.setFilter(new JwtFilter());
		registrationBean.addUrlPatterns("/api/online-sales-service1/*"); 
		return registrationBean; 
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SalesApplication.class, args);
	}
}