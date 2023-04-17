package com.BikkadIT.clientadd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.BikkadIT.Addition.calculator.sum;

@SpringBootApplication
public class ClientAdditionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientAdditionApplication.class, args);
		
		sum s=new sum();
		int sum = s.sum(10, 20);
		System.out.println("AT client side:"+sum);
	}

}
