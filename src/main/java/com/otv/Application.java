package com.otv;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author onlinetechvision.com
 * @since 16 Sept 2011
 * @version 1.0.0
 *
 */
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		TestBean testBean = (TestBean) context.getBean("testBean");
		System.out.println("Result : "+testBean.getMessage());;

	}
}
