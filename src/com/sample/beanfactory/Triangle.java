/**
 * @autor pathmasri
 * May 11, 2015 7:38:39 PM
 */
package com.sample.beanfactory;

public class Triangle {

	private String type;
	private int height;
	
  /**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}

/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	

/**
	 * @param type
	 */
	public Triangle(String type,int height) {
	
		this.type = type;
		this.height = height;
	}
	
	public Triangle(String type) {
		
		this.type = type;
	}
	
	public Triangle(int height) {
		
		this.height = height;
	}
	
	public Triangle() {

	}

public void draw(){
	  System.out.print("Drawing Traingle...");
  }

}
