package com.listene;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class ListenerEvent implements ApplicationListener<ContextStartedEvent> {

	@Override
	public void onApplicationEvent(ContextStartedEvent var1) {
		
		System.out.println("in to the contextStartedEvent");
		
		System.out.println("in listener 1 contextStartedEvent "+var1.getSource());
	}

}
