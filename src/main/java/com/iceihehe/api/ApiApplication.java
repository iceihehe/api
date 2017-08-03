package com.iceihehe.api;

import com.iceihehe.api.web.controller.filter.LoginFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.Ordered;


@SpringBootApplication
public class ApiApplication {

    @Bean
    public FilterRegistrationBean LoginFilterBean(){
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new LoginFilter());
        registration.addUrlPatterns("/demo/sub");
        registration.setOrder(Ordered.HIGHEST_PRECEDENCE);
        return registration;
    }

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}
}
