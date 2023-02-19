package com.henz.categories.A_interface.A_adapter.demo1.adapter;

import com.henz.categories.A_interface.A_adapter.demo1.model.Socket;
import com.henz.categories.A_interface.A_adapter.demo1.model.Volt;

public class SocketAdapterImpl extends Socket implements SocketAdapter{

	//@Override method from interface. But somehow the compiler gives error in eclipse...
	public Volt get120Volt() {
		return super.getVolt();
	}

	//@Override method from interface. But somehow the compiler gives error in eclipse...
	public Volt get12Volt() {
		Volt defaultVolt = super.getVolt();
		return convertVoltDivisor(defaultVolt,10);
	}

	//@Override method from interface. But somehow the compiler gives error in eclipse...
	public Volt get3Volt() {
		Volt defaultVolt = super.getVolt();
		return convertVoltDivisor(defaultVolt,40);
	}
	
	public Volt get240Volt() {
		Volt defaultVolt = super.getVolt();
		return convertVoltMultiplier(defaultVolt,2);
	}

	private Volt convertVoltDivisor(Volt defaultVolt, int divisor) {
		return new Volt(defaultVolt.getVolts() / divisor) ;
	}
	
	private Volt convertVoltMultiplier(Volt defaultVolt, int multiplier) {
		return new Volt(defaultVolt.getVolts() * multiplier) ;
	}
}
