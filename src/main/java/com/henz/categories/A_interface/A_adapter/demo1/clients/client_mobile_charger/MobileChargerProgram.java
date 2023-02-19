package com.henz.categories.A_interface.A_adapter.demo1.clients.client_mobile_charger;

import com.henz.categories.A_interface.A_adapter.demo1.adapter.SocketAdapter;
import com.henz.categories.A_interface.A_adapter.demo1.adapter.SocketAdapterImpl;

public class MobileChargerProgram {
	
	public static void main(String[] args) {
		
		SocketAdapter adapter = new SocketAdapterImpl();
		
		MobileCharger3Volt volt3 = new MobileCharger3Volt(adapter);
		volt3.runCharger();
		
		MobileCharger12Volt volt12 = new MobileCharger12Volt(adapter);
		volt12.runCharger();
	}

}
