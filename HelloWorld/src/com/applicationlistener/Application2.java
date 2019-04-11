package com.applicationlistener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class Application2 implements ApplicationListener<ContextStartedEvent> {

	@Override
	public void onApplicationEvent(ContextStartedEvent event) {
		
		System.out.println("contextStarted method of Application2 is called");
		System.out.println(event.getSource());
	}

}
