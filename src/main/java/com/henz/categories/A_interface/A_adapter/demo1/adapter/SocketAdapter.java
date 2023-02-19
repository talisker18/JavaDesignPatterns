package com.henz.categories.A_interface.A_adapter.demo1.adapter;

import com.henz.categories.A_interface.A_adapter.demo1.model.Volt;

public interface SocketAdapter {
	
	public Volt get120Volt();
		
	public Volt get12Volt();
	
	public Volt get3Volt();
	
	public Volt get240Volt();
}
