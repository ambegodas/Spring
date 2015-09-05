/**
 * @autor pathmasri
 * May 16, 2015 12:48:39 PM
 */
package com.sample.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.aop.service.FactoryService;
import com.sample.aop.service.ShapeService;

public class AspectMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		testWildCardandPointCuts();
		//testJoinPoint();
		//testArgsAdvice();
		//testAfterType();
		//testAroundType();
		//testCustomAnnotations();
		//testXMLconfigs();
		//testAOPproxy();
		

	}

	/**
	 * 
	 */
	private static void testAOPproxy() {
		FactoryService factoryService = new FactoryService();
		ShapeService shapeService = (ShapeService)factoryService.getBean("ShapeService");
		shapeService.getCircle();
		
	}

	/**
	 * 
	 */
	private static void testXMLconfigs() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_aop_xmlconfig.xml");
        ShapeService shapeService = (ShapeService)context.getBean("shapeService");
        System.out.println(shapeService.getTraingle());	
		
	}

	/**
	 * 
	 */
	private static void testCustomAnnotations() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_aop.xml");
        ShapeService shapeService = (ShapeService)context.getBean("shapeService");
        System.out.println(shapeService.getTraingle());	
		
	}

	/**
	 * 
	 */
	private static void testAroundType() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_aop.xml");
        ShapeService shapeService = (ShapeService)context.getBean("shapeService");
        System.out.println(shapeService.getTraingle());	
		
	}

	/**
	 * 
	 */
	private static void testAfterType() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_aop.xml");
        ShapeService shapeService = (ShapeService)context.getBean("shapeService");
        shapeService.getCircle().setName("Pathmasri");
	
	}

	/**
	 * 
	 */
	private static void testArgsAdvice() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_aop.xml");
        ShapeService shapeService = (ShapeService)context.getBean("shapeService");
        shapeService.getCircle().setName("Wathsala");		
	}

	/**
	 * 
	 */
	private static void testJoinPoint() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_aop.xml");
        ShapeService shapeService = (ShapeService)context.getBean("shapeService");
        System.out.println(shapeService.getCircle().getName());	
	}

	/**
	 * 
	 */
	private static void testWildCardandPointCuts() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_aop.xml");
        ShapeService shapeService = (ShapeService)context.getBean("shapeService");
        System.out.println(shapeService.getTraingle());
        System.out.println(shapeService.getCircle().getName());
		
	}

}
