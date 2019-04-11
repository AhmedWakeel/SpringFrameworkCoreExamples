package com.customevent;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {

	private static final long serialVersionUID = 1L;

	public CustomEvent(Object source) {
		super(source);
	}

	public String toString()
	{
		System.out.println("default toString method of CustomEvent class is called ");
		return null;
	}
}
