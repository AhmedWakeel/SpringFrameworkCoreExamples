package com.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycle implements InitializingBean,DisposableBean{
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("inside the setName method ");
		this.name = name;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("initializing method is called");
	}

	@Override
	public void destroy() throws Exception {
    System.out.println("disposable bean is called");		
	}
	

}
