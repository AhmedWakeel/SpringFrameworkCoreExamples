package com.infotech.model;

import com.infotech.call.Call;
import com.infotech.interf.Interf;

public class Message1 implements Interf {

	Call call;
	
	@Override
	public void mk() {
  System.out.println("into the mk method  of Message1 class");
	}
	
	
	
	public Message1(Call call) {
		super();
		System.out.println("in the Message1 class");
		this.call = call;
	}
	
	public void calling()
	{
		System.out.println("into the calling method  of Message1 class");
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
