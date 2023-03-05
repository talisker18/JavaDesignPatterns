package com.henz.categories.A_interface.B_facade.demo3;

import com.henz.categories.A_interface.B_facade.demo3.shapes.Circle;
import com.henz.categories.A_interface.B_facade.demo3.shapes.Rectangle;
import com.henz.categories.A_interface.B_facade.demo3.shapes.Shape;
import com.henz.categories.A_interface.B_facade.demo3.shapes.Square;

public class ShapeMakerFacade {
	private Shape circle;
	private Shape rectangle;
	private Shape square;

	public ShapeMakerFacade() {
      circle = new Circle();
      rectangle = new Rectangle();
      square = new Square();
   }

   public void drawCircle(){
      circle.draw();
   }
   public void drawRectangle(){
      rectangle.draw();
   }
   public void drawSquare(){
      square.draw();
   }
}
