package com.customevent;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CustomEventPublisher implements ApplicationEventPublisherAware{

	private ApplicationEventPublisher eventPublisher;
	
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
         
	   this.eventPublisher=applicationEventPublisher;
	}
	
	public void publishEvent()
	{
		CustomEvent  customEvent=new CustomEvent(this);
		eventPublisher.publishEvent(customEvent);
	}

}
