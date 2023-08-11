package com.digit.SetterInjuction1;

import org.springframework.beans.factory.xml.XmlBeanFactory;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainApp {
	public static void main(String[] args) {
		Resource cxml = new ClassPathResource("applicationContext.xml");
		XmlBeanFactory beanFactory = new XmlBeanFactory(cxml);
		Employee emp1 = (Employee)beanFactory.getBean("bean1");
		emp1.getData();
		
//		ClassPathXmlApplicationContext cxml = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Employee emp1 = (Employee)cxml.getBean("bean1");
//		emp1.getData();
	}

}
