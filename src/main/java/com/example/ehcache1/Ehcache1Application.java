package com.example.ehcache1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class Ehcache1Application {

	public static void main(String[] args) {
		SpringApplication.run(Ehcache1Application.class, args);
		System.out.println("启动成功！");
	}

}
