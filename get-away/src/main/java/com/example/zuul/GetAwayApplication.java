package com.example.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy//开启zuul
@SpringCloudApplication
public class GetAwayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetAwayApplication.class, args);
	}
}
