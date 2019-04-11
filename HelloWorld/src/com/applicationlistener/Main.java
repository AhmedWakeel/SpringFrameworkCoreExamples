package com.applicationlistener;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotech.model.Message;

public class Main  {
	
	public static void main(String[] args)
	{
		ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("Beans.xml");
		ctx.start();
		
		Employee employee=ctx.getBean("emp",Employee.class);
		System.out.println(employee.getEmp()+"\t"+employee.getEmpID());
		
		ctx.stop();
		ctx.close();
	}

}
