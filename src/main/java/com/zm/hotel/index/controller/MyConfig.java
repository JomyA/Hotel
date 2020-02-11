package com.zm.hotel.index.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SuppressWarnings("deprecation")
@Configuration
public class MyConfig extends WebMvcConfigurerAdapter{

		@Bean
		public WebMvcConfigurerAdapter webMvcConfigurerAdapter(){
			WebMvcConfigurerAdapter adapter=new WebMvcConfigurerAdapter() {
				@Override
				public void addInterceptors(InterceptorRegistry registry){
					registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**").excludePathPatterns("/","/index","/login");
				}
			};
			return adapter;
		}
}
