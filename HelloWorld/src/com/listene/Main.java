package com.listene;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args)
	{
		ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext("Beans.xml");
		applicationContext.start();
		Employee employee=applicationContext.getBean("emp",Employee.class);
		
		applicationContext.stop();
		applicationContext.close();
	}
}
