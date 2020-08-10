package com.myapp.springcore;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.CalculatorService;

public class SpringcoreApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		CalculatorService cs = (CalculatorService) ctx.getBean("service");
		System.out.println(cs.service(12345));
	}

}
