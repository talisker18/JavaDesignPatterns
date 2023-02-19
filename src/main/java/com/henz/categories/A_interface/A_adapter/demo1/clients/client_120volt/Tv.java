package com.henz.categories.A_interface.A_adapter.demo1.clients.client_120volt;

import com.henz.categories.A_interface.A_adapter.demo1.model.Socket;

public class Tv {
	
	Socket socket;
	
	public Tv(Socket socket) {
		this.socket = socket;
	}
	
	public void runTv() {
		System.out.println("getting volt from socket: "+this.socket.getVolt().getVolts());
	}

}
