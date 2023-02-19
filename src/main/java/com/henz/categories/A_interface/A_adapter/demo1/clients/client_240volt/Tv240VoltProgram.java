package com.henz.categories.A_interface.A_adapter.demo1.clients.client_240volt;

import com.henz.categories.A_interface.A_adapter.demo1.adapter.SocketAdapter;
import com.henz.categories.A_interface.A_adapter.demo1.adapter.SocketAdapterImpl;

public class Tv240VoltProgram {
	
	public static void main(String[] args) {
		SocketAdapter adapter = new SocketAdapterImpl();
		
		Tv240Volt tv = new Tv240Volt(adapter);
		tv.run240VoltTv();
	}

}
