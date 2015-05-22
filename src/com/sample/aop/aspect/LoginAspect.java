/**
 * @autor pathmasri
 * May 16, 2015 1:36:22 PM
 */
package com.sample.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoginAspect {
	
	
//	@Before("execution(public String com.sample.aop.model.Traingle.getName())")
//	public void loginAdvice1(){
//		System.out.println("Advice Run. Get method called");
//	}
//	
//	//Using wild cards
//	@Before("execution(public String get*())")
//	public void loginAdvice2(){
//		System.out.println("Advice Run. Get method called");
//	}
//	
//	//Using wild cards
//	@Before("execution(public * get*())")
//	public void loginAdvice3(){
//		System.out.println("Advice Run. Get method called");
//	}
//	
//	//Using wild cards ## any method with argument
//	@Before("execution(public * get*(*))")
//	public void loginAdvice4(){
//		System.out.println("Advice Run. Get method called");
//	}
//	
//	//Using wild cards ## any method with argument
//	@Before("allGetters() && allCircleMethods()")
//	public void loginAdvice5(){
//		System.out.println("Advice Run. Get method called");
//	}
//	
////Using point cuts
//	@Before("allCircleMethods()")
//	public void loginAdvice6(){
//		System.out.println("Advice Run. Get method called");
//	}
//	
	//Using point cuts
	@Before("allGetters()")
	public void loginAdvice7(JoinPoint jp){
		System.out.println(jp.toString());
	}
	
	@Before("allGetters()")
	public void loginAdvice8(){
		System.out.println("Advice runs form proxy object");
	}
	
	@Pointcut("execution(* *get*())")
	public void allGetters(){		
	}
	
	@Pointcut("within(com.sample.aop.model.*)")
	public void allCircleMethods(){
	}
	
}
