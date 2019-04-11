package com.listene;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class Employee implements ApplicationListener<ApplicationEvent>{

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("in the setter method");
		this.name = name;
	}

	@Override
	public void onApplicationEvent(ApplicationEvent var1) {
		
		System.out.println("into the Employee onApplicationEvent class");
		
	}
}
