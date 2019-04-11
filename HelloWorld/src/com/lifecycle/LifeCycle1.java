
package com.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycle1 implements InitializingBean,DisposableBean{
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("inside the setName method in1 ");
		this.name = name;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("initializing method is called 1");
	}

	@Override
	public void destroy() throws Exception {
    System.out.println("disposable bean is called 1");		
	}
	

}
