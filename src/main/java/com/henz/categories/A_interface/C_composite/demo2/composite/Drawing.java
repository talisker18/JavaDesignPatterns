package com.henz.categories.A_interface.C_composite.demo2.composite;

import java.util.ArrayList;
import java.util.List;

import com.henz.categories.A_interface.C_composite.demo2.component.Shape;

public class Drawing implements Shape{
	
	private List<Shape> shapeList = new ArrayList<>();

	@Override
	public void draw(String fillColor) {
		shapeList.forEach(shape -> shape.draw(fillColor));
	}

	//adding shape to drawing
	public void add(Shape s){
		this.shapeList.add(s);
	}
	
	//removing shape from drawing
	public void remove(Shape s){
		this.shapeList.remove(s);
	}
	
	//removing all the shapes
	public void clear(){
		System.out.println("Clearing all the shapes from drawing");
		this.shapeList.clear();
	}
}
