package com.login.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"com.login.controllers","com.login.service"})
public class LoginMvcConfig {

	@Bean
		public InternalResourceViewResolver viewResolver(){
			InternalResourceViewResolver vr = new InternalResourceViewResolver();
			vr.setSuffix(".jsp");
			return vr;
			
		}
}
