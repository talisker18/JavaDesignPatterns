package com.henz.categories.A_interface.C_composite.demo2;

import com.henz.categories.A_interface.C_composite.demo2.component.Shape;
import com.henz.categories.A_interface.C_composite.demo2.composite.Drawing;
import com.henz.categories.A_interface.C_composite.demo2.leaf.Circle;
import com.henz.categories.A_interface.C_composite.demo2.leaf.Triangle;

public class ClientProgram {
	public static void main(String[] args) {
		Shape tri = new Triangle();
		Shape tri1 = new Triangle();
		Shape cir = new Circle();
		
		Drawing drawing = new Drawing();
		drawing.add(tri1);
		drawing.add(tri1);
		drawing.add(cir);
		
		//use arg "Red" for all added shapes
		drawing.draw("Red");
		
		drawing.clear();
		
		System.out.println("---------------------");
		
		drawing.add(tri);
		drawing.add(cir);
		
		//use arg "Green" for all added shapes
		drawing.draw("Green");
	}
}
