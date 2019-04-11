package com.beanpost;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostprocess1 implements BeanPostProcessor {
	
	public Object postProcessBeforeInitialization()
	{
		return null;
	}
}
