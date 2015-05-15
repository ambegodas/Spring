/**
 * @autor pathmasri
 * May 11, 2015 7:38:39 PM
 */
package com.sample.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Triangle implements Shape {

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
    @Autowired
    @Qualifier("traingelRelated")
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
	@Resource(name="pointBB")
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
	 @Autowired
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
 
@PostConstruct
  public void initialize(){
	  System.out.println("post construct");
  }
  
@PreDestroy
  public void destroy(){
	  System.out.println("pre destroy");
  }

}
