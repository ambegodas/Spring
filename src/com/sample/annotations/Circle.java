/**
 * @autor pathmasri
 * May 15, 2015 12:54:32 PM
 */
package com.sample.annotations;

import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape {
	
	private Point center;
	
	/**
	 * @return the center
	 */
	public Point getCenter() {
		return center;
	}

	/**
	 * @param center the center to set
	 */
	@Required
	public void setCenter(Point center) {
		this.center = center;
	}

	public void draw(){	
	System.out.println("The center is : " + center.getX()+ ","+ center.getY());	
	}

}
