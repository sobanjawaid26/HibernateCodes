package org.jspiders;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("org/jspiders/context.xml");
		ComputerUtils keyboard = new Keyboard();
		Computer computer = (Computer)context.getBean("comp");
		System.out.println(computer);
//		Computer computer1 =(Computer)context.getBean("comp");
//		Computer computer2 =(Computer)context.getBean("comp");
//		Computer computer3 =(Computer)context.getBean("comp");
		
		context.close();
	}
}