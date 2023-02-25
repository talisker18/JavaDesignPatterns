package com.henz.categories.A_interface.A_adapter.demo2.adapter;

import com.henz.categories.A_interface.A_adapter.demo2.Movable;

public class MovableAdapterImpl implements MovableAdapter{
	
	private Movable movable;
	
	public MovableAdapterImpl(Movable movable) {
		this.movable = movable;
	}

	public double getSpeed() {
		double speedInMph = this.movable.getSpeed();
		return this.convertToKmh(speedInMph);
	}

	private double convertToKmh(double speedInMph) {
		return speedInMph * 1.60934;
	}
}
