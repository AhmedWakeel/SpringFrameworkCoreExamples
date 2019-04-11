package com.listener;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class Employee implements ApplicationEventPublisherAware {
	
	private String name;
	
	ApplicationEventPublisher publisher;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("in the setter method of Employee class");
		this.name = name;
	}

	public void draw()
	{
		System.out.println("in the draw method of Employee class");
		DrawEvent  event=new DrawEvent(this);
		publisher.publishEvent(event);
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher=publisher;
		
		
		
		
	}
}
