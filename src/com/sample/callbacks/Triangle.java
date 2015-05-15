/**
 * @autor pathmasri
 * May 11, 2015 7:38:39 PM
 */
package com.sample.callbacks;


import javax.xml.ws.Dispatch;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


public class Triangle implements InitializingBean, DisposableBean{

	private Point pointA;
	private Point pointB;
	private Point pointC;

	
	
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
 * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
 */
@Override
public void afterPropertiesSet() throws Exception {
	System.out.println("Beans are initialized");
	
}



/* (non-Javadoc)
 * @see org.springframework.beans.factory.DisposableBean#destroy()
 */
@Override
public void destroy() throws Exception {
	System.out.println("Beans are getting desctroyed");
	
}






}
