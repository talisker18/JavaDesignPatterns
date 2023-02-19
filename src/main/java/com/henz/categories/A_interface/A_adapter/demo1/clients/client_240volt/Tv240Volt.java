package com.henz.categories.A_interface.A_adapter.demo1.clients.client_240volt;

import com.henz.categories.A_interface.A_adapter.demo1.adapter.SocketAdapter;

public class Tv240Volt {
	
	SocketAdapter socket;
	
	public Tv240Volt(SocketAdapter socket) {
		this.socket = socket;
	}

	public void run240VoltTv() {
		System.out.println("run 240 volt tv: "+this.socket.get240Volt().getVolts());
	}
}
