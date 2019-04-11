package com.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lifecycle.LifeCycle;
import com.methodinjection.BeanName;

public class Main {

	public static void main(String[] args)
	{
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("Beans.xml");
//	    ctx.registerShutdownHook();
	    
	    Employee beanLifeCycle=ctx.getBean("emp",Employee.class);
        System.out.println(beanLifeCycle.getName());		
		
		
	}
}
