package com.infotech.client; 

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lifecycle.BeanLifeCycle;
import com.collection.ArrayListCollection;
import com.lifecycle.*;

public class ClientTest {
	
	public static void main(String[] args)
	{
//		Resource resource=new ClassPathResource("Beans.xml");
//		BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("Beans.xml"));
		ApplicationContext beanFactory=new ClassPathXmlApplicationContext("Beans.xml");
		
/*		Message object=beanFactory.getBean("message",Message.class);
		
		object.setMessage("hello1");
		object.setMessageid(1001);
		
		System.out.println(object.getMessage()+" "+object.getMessageid());
		
		
		
		Message message1=beanFactory.getBean("message",Message.class);
		System.out.println(message1.getMessage()+" in the second Bean call "+message1.getMessageid());
		*/
		/*String[] st=beanFactory.getAliases("message");
		
		for(String msg:st)
		{
			System.out.println(msg);
		}
		
		Message message1=beanFactory.getBean(Message.class);
		System.out.println(message1.getMessage()+" "+message1.getMessageid());
		
		Class<?> cls=beanFactory.getType("message"); 
		System.out.println(cls.getName());
		
		
		System.out.println(beanFactory.isSingleton("message"));*/
		
		
		
		
		
		
		
	/*	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Beans.xml");
		
		Interf interf=applicationContext.getBean("message",Message.class);
         interf.calling();
		*/
		
		
		
/*	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Beans.xml");
		
		Child child=applicationContext.getBean("child",Child.class);
//	Parent child=applicationContext.getBean("parent",Parent.class);
     	System.out.println(child.getName()+" "+child.getNo()+" "+child.getAddress());
     	
		*/
		
		/*
		AbstractApplicationContext applicationContext=new ClassPathXmlApplicationContext("Beans.xml");
        BeanLifeCycle beanLifeCycle=applicationContext.getBean("lifecycle",BeanLifeCycle.class);
        System.out.println(beanLifeCycle.getName()+" "+beanLifeCycle.getNo());
        applicationContext.registerShutdownHook();
        		*/

		
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Beans.xml");
        ArrayListCollection arrayListCollection=applicationContext.getBean("collection",ArrayListCollection.class);
        
        for(String str:arrayListCollection.getName())
        {
        	System.out.println(str+" ");
        }
       
        for(String str:arrayListCollection.getLs())
        {
        	System.out.println(str+" ");
        }
		
        for(int str:arrayListCollection.getSt())
        {
        	System.out.println(str+" ");
        }
		
		
		
		
	}

}
