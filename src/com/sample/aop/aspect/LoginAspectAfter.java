/**
 * @autor pathmasri
 * May 16, 2015 5:46:50 PM
 */
package com.sample.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoginAspectAfter {
	
	@After("args(name)")
	public void allSetters(String name){
	  System.out.println(name+"return");
	}
	
	@AfterReturning("args(name)")
	public void allSetters1(String name){
	  System.out.println(name+"return success");
	}
	
	@AfterThrowing("args(name)")
	public void execeptionAdvice(String name){
	  System.out.println(name+"return exeception");
	}
	
	@AfterReturning(pointcut="args(name)",returning="returnString")
	public void allSetters2(String name,String returnString){
	  System.out.println("Initial Values : "+name + "Changed values : " + returnString);
	}
	
	@AfterThrowing(pointcut="args(name)",throwing = "ex")
	public void execeptionAdvice1(String name, RuntimeException ex){
	  System.out.println(name+"return exeception");
	}
	

	
	
	
	

}
