package com.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;

/*public class BeanLifeCycle implements InitializingBean,DisposableBean*/
public class BeanLifeCycle 
{

	public int no;
	public String name;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*@Override
	public void afterPropertiesSet() throws Exception {
     System.out.println("BeanLifeCycle class bean is initialize");
		
	}

	@Override
	public void destroy() throws Exception {
     System.out.println("BeanLifeCycle class bean is destroyed");		
	}*/
	
    /* public void init()	
     {
    	 System.out.println("inside the init method ");
     }
	
     public void destroy()
     {
    	 System.out.println("inside the destroy method");
     }*/

	 @PreDestroy
	 public void init()	
    {
   	 System.out.println("inside the init method ");
    }
	@PostConstruct
    public void destroy()
    {
   	 System.out.println("inside the destroy method");
    }

}



