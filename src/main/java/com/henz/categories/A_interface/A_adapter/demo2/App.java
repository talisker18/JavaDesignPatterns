package com.henz.categories.A_interface.A_adapter.demo2;

import com.henz.categories.A_interface.A_adapter.demo2.adapter.MovableAdapterImpl;

public class App {
	
	public static void main(String[] args) {
		Movable bugatti = new BugattiVeyron();
		
		System.out.println("bugatti speed in mph: "+bugatti.getSpeed());
		
		final MovableAdapterImpl adapter = new MovableAdapterImpl(bugatti);
		
		System.out.println("bugatti speed in kmh: "+adapter.getSpeed());
	}

}
