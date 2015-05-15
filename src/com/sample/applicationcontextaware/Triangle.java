/**
 * @autor pathmasri
 * May 11, 2015 7:38:39 PM
 */
package com.sample.applicationcontextaware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware , BeanNameAware{

	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context;
	
	
	
/**
	 * @return the context
	 */
	public ApplicationContext getContext() {
		return context;
	}



	/**
	 * @param context the context to set
	 */
	public void setContext(ApplicationContext context) {
		this.context = context;
	}



/**
	 * @return the pointA
	 */
	public Point getPointA() {
		return pointA;
	}



	/**
	 * @param pointA the pointA to set
	 */
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}



	/**
	 * @return the pointB
	 */
	public Point getPointB() {
		return pointB;
	}



	/**
	 * @param pointB the pointB to set
	 */
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}



	/**
	 * @return the pointC
	 */
	public Point getPointC() {
		return pointC;
	}



	/**
	 * @param pointC the pointC to set
	 */
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}



public void draw(){
	  System.out.print(this.pointA.getX());
	  System.out.println(this.pointA.getY());
	  
	  System.out.print(this.pointB.getX());
	  System.out.println(this.pointB.getY());
	  
	  System.out.print(this.pointC.getX());
	  System.out.print(this.pointC.getY());
	  
  }



/* (non-Javadoc)
 * @see org.springframework.context.ApplicationContextAware#setApplicationContext(org.springframework.context.ApplicationContext)
 */
@Override
public void setApplicationContext(ApplicationContext arg0)
		throws BeansException {
	this.context = arg0;
	
}



/* (non-Javadoc)
 * @see org.springframework.beans.factory.BeanNameAware#setBeanName(java.lang.String)
 */
@Override
public void setBeanName(String arg0) {
	System.out.print("Setting Bean Names");
	
}

}
