package com.infy.bean;

import org.springframework.stereotype.Component;

//This is bacis information about creating bean
//this class is provide bean 
//Here Bean is independent it has no other depedenceies
@Component
public class WelcomeBean {
	public String printWelcome() {
		return "Welcome to Spring JJ";
	}
}
