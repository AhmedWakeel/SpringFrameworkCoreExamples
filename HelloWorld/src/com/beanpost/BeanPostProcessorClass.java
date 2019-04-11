package com.beanpost;

public class BeanPostProcessorClass {

	  private String message;
	  private String messageId;
	  
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		System.out.println("setting message");
		this.message = message;
	}
	public String getMessageId() {
		return messageId;
	}
	public void setMessageId(String messageId) {
		System.out.println("setting messageid");
		this.messageId = messageId;
	}
	
	public void init()
	{
		System.out.println("bean is going through init method");
	}
	
	public void destroy()
	{
		System.out.println("bean is going through destroy method");
	}
	  
}
