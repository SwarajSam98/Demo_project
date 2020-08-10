package com.myapp.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.CalculatorService;

public class SpringcoreApplication {

	public static void main(String[] args) {
		//it initialize the resources and load it eageraly.
		ApplicationContext ctx= new ClassPathXmlApplicationContext("beans.xml");
		
		CalculatorService cs= (CalculatorService) ctx.getBean("service");
		//CalculatorService cs2= (CalculatorService) ctx.getBean("service");
		System.out.println(cs.service(12345));
		//System.out.println(cs.hashCode());
		//System.out.println(cs2.hashCode());
		
		 
	}

}
