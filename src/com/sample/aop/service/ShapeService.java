/**
 * @autor pathmasri
 * May 16, 2015 1:16:02 PM
 */
package com.sample.aop.service;


import com.sample.aop.aspect.Loggable;
import com.sample.aop.model.Circle;
import com.sample.aop.model.Traingle;

public class ShapeService {
	
	private Circle circle;
	private Traingle traingle;
	/**
	 * @return the circle
	 */
	public Circle getCircle() {
		System.out.print("Getter called");
		return circle;
	}
	/**
	 * @param circle the circle to set
	 */
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	/**
	 * @return the traingle
	 */
	@Loggable
	public Traingle getTraingle() {
		return traingle;
	}
	/**
	 * @param traingle the traingle to set
	 */
	public void setTraingle(Traingle traingle) {
		this.traingle = traingle;
	}
	
	

}
