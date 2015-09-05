/**
 * @autor pathmasri
 * May 19, 2015 8:17:49 AM
 */
package com.sample.jdbc.model;

import javax.persistence.Entity;
import javax.persistence.Id;






@Entity
public class Circle {
	
@Id
	private int circleId;
	
	private String name;
	
	

	/**
	 * @param circleId
	 * @param name
	 */
	public Circle(int circleId, String name) {
		super();
		this.circleId = circleId;
		this.name = name;
	}

	/**
	 * 
	 */
	public Circle() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the circleId
	 */
	public int getCircleId() {
		return circleId;
	}

	/**
	 * @param circleId the circleId to set
	 */
	public void setCircleId(int circleId) {
		this.circleId = circleId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
