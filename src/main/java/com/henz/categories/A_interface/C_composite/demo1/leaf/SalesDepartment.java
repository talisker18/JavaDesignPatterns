package com.henz.categories.A_interface.C_composite.demo1.leaf;

import com.henz.categories.A_interface.C_composite.demo1.component.Department;

public class SalesDepartment implements Department {

    private Integer id;
    private String name;

    public SalesDepartment(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

    public void printDepartment() {
        System.out.println("Type: "+getClass().getSimpleName()+"; id: "+this.getId()+"; name: "+this.getName());
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
