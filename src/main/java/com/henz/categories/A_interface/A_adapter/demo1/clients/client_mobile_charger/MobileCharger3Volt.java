package com.henz.categories.A_interface.A_adapter.demo1.clients.client_mobile_charger;

import com.henz.categories.A_interface.A_adapter.demo1.adapter.SocketAdapter;

public class MobileCharger3Volt {
	
	private SocketAdapter adapter;
	
	public MobileCharger3Volt(SocketAdapter adapter) {
		this.adapter = adapter;
	}
	
	public void runCharger() {
		System.out.println("run MobileCharger3Volt: "+this.adapter.get3Volt().getVolts());
	}
}
