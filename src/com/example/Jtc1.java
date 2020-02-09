package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Jtc1 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("jtcIndia.xml");
		System.out.println("Nothing Print By User");
		System.out.println("*********************");
		Hello h1 = (Hello) ctx.getBean("hello");
		h1.Show();
	}
}
