package com.listene;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;

public class ListenerEvent2 implements ApplicationListener<ContextStoppedEvent> {

	@Override
	public void onApplicationEvent(ContextStoppedEvent var2) {
		
		System.out.println("in to the contextStopEvent");
		
		System.out.println("in the listener2 contextStopEvent "+var2.getSource());
	}

}
