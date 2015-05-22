/**
 * @autor pathmasri
 * May 19, 2015 8:08:18 AM
 */
package com.sample.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.jdbc.model.*;
import com.sample.jdbc.dao.*;

public class JDBCDemo {
	
	public static void main(String[] args){
		
		//usePlainJdbc();
		//useSpring();
		//useJdbcTemplate();
		
		//testJdbcTemplateOtherMethods();
		//testRowMapper();
		//testWriteData();
		//testCreateData();
		//testNamedParameters();
		//testDaoSupportClasses();
		testSpringWithHibernate();
	
		
	}

	/**
	 * 
	 */
	private static void testSpringWithHibernate() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_jdbc.xml");
		HibernateDaoImple dao = context.getBean("hibernateDaoImple",HibernateDaoImple.class);
		System.out.println(dao.getCircleCount());
		
	}

	/**
	 * 
	 */
	private static void testDaoSupportClasses() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_jdbc.xml");
		SimpleJdbcDaoImpl dao = context.getBean("simpleJdbcDaoImple",SimpleJdbcDaoImpl.class);
		System.out.println(dao.getCircleCount());
		
	}

	/**
	 *
	 */
	private static void testNamedParameters() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_jdbc.xml");
		JdbcDaoImpl dao = context.getBean("jdbcDaoImpl",JdbcDaoImpl.class);
		dao.insertCircleUsingNamedParameters(new Circle(4,"Fourth Circle"));
		
	}

	/**
	 * 
	 */
	private static void testCreateData() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_jdbc.xml");
		JdbcDaoImpl dao = context.getBean("jdbcDaoImpl",JdbcDaoImpl.class);
		dao.createTable();
		
	}

	/**
	 * 
	 */
	private static void testWriteData() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_jdbc.xml");
		JdbcDaoImpl dao = context.getBean("jdbcDaoImpl",JdbcDaoImpl.class);
		dao.insertCircle(new Circle(2,"Second Circle"));
	}

	/**
	 * 
	 */
	private static void testRowMapper() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_jdbc.xml");
		JdbcDaoImpl dao = context.getBean("jdbcDaoImpl",JdbcDaoImpl.class);
		Circle circle = dao.getCircle1(1);
		//System.out.println(circle.getName());
		
		List<Circle> circles = dao.getCircles(1);
		System.out.println(circles.get(0).getName());
	}

	/**
	 * 
	 */
	private static void testJdbcTemplateOtherMethods() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_jdbc.xml");
		JdbcDaoImpl dao = context.getBean("jdbcDaoImpl",JdbcDaoImpl.class);
		String name  = dao.getCircleName(1);
		System.out.println(name);
		
	}

	/**
	 * 
	 */
	private static void useJdbcTemplate() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_jdbc.xml");
		JdbcDaoImpl dao = context.getBean("jdbcDaoImpl",JdbcDaoImpl.class);
		//Circle c = dao.getCircle(1);
		int count  = dao.getCircleCount();
		System.out.println(count);
		
	}

	/**
	 * 
	 */
	private static void usePlainJdbc() {
		Circle circle = new JdbcDaoImpl().getCircle(1);
		System.out.println(circle.getName());
		
	}

	/**
	 * 
	 */
	private static void useSpring() {
		
	ApplicationContext context = new ClassPathXmlApplicationContext("spring_jdbc.xml");
	JdbcDaoImpl dao = context.getBean("jdbcDaoImpl",JdbcDaoImpl.class);
	//Circle c = dao.getCircle(1);
	Circle c1 = dao.getCircleSpring(1);
	
	System.out.println(c1.getName());
		
	}

}
