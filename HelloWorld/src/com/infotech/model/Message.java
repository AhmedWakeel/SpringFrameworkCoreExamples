package com.infotech.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.infotech.call.Call;
import com.infotech.interf.Interf;

@Component
@Scope("prototype")
public class Message implements Interf {

	Call call;
	
	@Override
	public void mk() {
		System.out.println("into the mk method of Message class");		
	}
	
	public Message(Call call) {
		super();
		System.out.println("in the Message class");
		this.call = call;
	}
	
	public void calling()
	{
		System.out.println("into the calling method  of Message class");
		call.sk();
	}



	private String message;
	private int messageid;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getMessageid() {
		return messageid;
	}
	public void setMessageid(int messageid) {
		this.messageid = messageid;
	}

}
