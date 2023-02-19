package com.henz.categories.A_interface.A_adapter.demo1.clients.client_mobile_charger;

import com.henz.categories.A_interface.A_adapter.demo1.adapter.SocketAdapter;

public class MobileCharger12Volt {
	
private SocketAdapter adapter;
	
	public MobileCharger12Volt(SocketAdapter adapter) {
		this.adapter = adapter;
	}
	
	public void runCharger() {
		System.out.println("run MobileCharger12Volt: "+this.adapter.get12Volt().getVolts());
	}
}
