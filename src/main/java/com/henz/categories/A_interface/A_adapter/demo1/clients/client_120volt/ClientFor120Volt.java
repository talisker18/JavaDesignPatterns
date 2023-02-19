package com.henz.categories.A_interface.A_adapter.demo1.clients.client_120volt;

import com.henz.categories.A_interface.A_adapter.demo1.model.Socket;

/*
 * the client is, for example, a tv plugged into a socket that delivers 120volt
 * 
 * */

public class ClientFor120Volt {
	
	public static void main(String[] args) {
		Socket socketWith120Volt = new Socket();
		
		Tv tv = new Tv(socketWith120Volt);
		tv.runTv();
	}

}
