package com.henz.categories.A_interface.B_facade.demo3;

import com.henz.categories.A_interface.B_facade.demo3.shapes.Circle;
import com.henz.categories.A_interface.B_facade.demo3.shapes.Shape;

public class ClientProgram {
	public static void main(String[] args) {
		
		
		//draw a circle without face
		Shape circle = new Circle();
		circle.draw();
		
		//draw a square and circle with facade
		ShapeMakerFacade facade = new ShapeMakerFacade();
		facade.drawSquare();
		facade.drawCircle();
	}

}
