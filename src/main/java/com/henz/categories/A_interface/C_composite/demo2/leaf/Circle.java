package com.henz.categories.A_interface.C_composite.demo2.leaf;

import com.henz.categories.A_interface.C_composite.demo2.component.Shape;

public class Circle implements Shape{

	@Override
	public void draw(String fillColor) {
		System.out.println("Drawing Circle with color "+fillColor);
	}

}
