/**
 * @autor pathmasri
 * May 11, 2015 7:34:31 PM
 */
package com.sample.dependancyinjection;

public class Drawing {
	
  private Shape shape;
  
  public void setShape(Shape shape){
	  this.shape = shape;
	  
  }
  
  public void drawShape(){
	  this.shape.draw();
  }

}
