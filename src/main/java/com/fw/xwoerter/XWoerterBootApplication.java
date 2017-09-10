package com.fw.xwoerter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class XWoerterBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(XWoerterBootApplication.class, args);
	}
}

@RestController
class GreetingController{
	@RequestMapping("/")
	Greet greet(){
		return new Greet("Hello World!");
	}
	
}
class Greet {
	private String message;
	public Greet(){}
	public Greet(String greet){
		this.message = greet;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}