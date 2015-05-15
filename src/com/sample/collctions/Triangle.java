/**
 * @autor pathmasri
 * May 11, 2015 7:38:39 PM
 */
package com.sample.collctions;

import java.util.Collection;
import java.util.List;

public class Triangle {

	private List<Point> points ;

	/**
	 * @return the points
	 */
	public List<Point> getPoints() {
		return points;
	}

	/**
	 * @param points the points to set
	 */
	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	public void draw(){
		
		for (Point p:points){
			System.out.println(p.getX()+","+p.getY());
		}
	}

	




}
