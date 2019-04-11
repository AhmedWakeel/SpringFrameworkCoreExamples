package com.applicationlistener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.support.ApplicationObjectSupport;

public class Application1 implements ApplicationListener<ContextStartedEvent> {

	@Override
	public void onApplicationEvent(ContextStartedEvent event) {
   
		 System.out.println("context started method is called in applicatoin1");
        System.out.println(event.getSource());		 
	}

}
