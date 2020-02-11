package com.zm.hotel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@ComponentScan(basePackages={"com.zm.hotel.customer","com.zm.hotel.room"})
@ServletComponentScan
@Configuration
@MapperScan("com.zm.hotel.**.dao")//��֪��Ϊʲô�Ҳ���customerDAO���������
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
