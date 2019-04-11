package com.methodinjection;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org. springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.http.codec.multipart.SynchronossPartHttpMessageReader;

public class BeanName implements ApplicationContextAware,BeanNameAware,ApplicationEventPublisher,ApplicationListener<ContextStartedEvent>,ApplicationEventPublisherAware{

	private String name;
	ApplicationContext applicationContext;

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public void setBeanName(String str) {
		System.out.println("Bean class name is "+str);
	}


	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext=applicationContext;
	}


	@Override
	public void onApplicationEvent(ContextStartedEvent contextStartedEvent) {
		
		System.out.println("into the onApplicationStartedEvent in the BeanName class");
		System.out.println("getResource method is called "+contextStartedEvent.getSource());
		
	}


	@Override
	public void publishEvent(Object arg0) {
		
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher arg0) {
		// TODO Auto-generated method stub
		
	}

}
