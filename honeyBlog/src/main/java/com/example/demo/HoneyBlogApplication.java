package com.example.demo;

import com.example.demo.common.BeanContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@EnableScheduling
@SpringBootApplication
public class HoneyBlogApplication {
	
	private final ApplicationContext context;

	public static void main(String[] args) {
		SpringApplication.run(HoneyBlogApplication.class, args);
	}
	
	@PostConstruct
    public void init(){
        BeanContext.init(context);
    }

}
