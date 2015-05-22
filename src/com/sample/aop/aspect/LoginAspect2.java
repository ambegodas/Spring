/**
 * @autor pathmasri
 * May 16, 2015 3:34:55 PM
 */
package com.sample.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoginAspect2 {
	
	@Before("allGetters()")
	public void loginAdvice1(JoinPoint joinPoint){
		System.out.println(joinPoint.toString());
		System.out.println(joinPoint.getTarget());
	}
	
	@Pointcut("execution( * get*())")
	public void allGetters(){}
	
//	@Before("args(String)")
//	public void stringArgs(){
//		System.out.println("Method with String argument got called");
//	}
	
	@Before("args(name)")
	public void stringArgs( String name){
		System.out.println("Method with String argument got called:" + name);
	}

}
