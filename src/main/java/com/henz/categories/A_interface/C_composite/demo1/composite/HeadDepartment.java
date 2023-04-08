package com.henz.categories.A_interface.C_composite.demo1.composite;

import java.util.ArrayList;
import java.util.List;

import com.henz.categories.A_interface.C_composite.demo1.component.Department;

public class HeadDepartment implements Department {
    private Integer id;
    private String name;

    private List<Department> childDepartments;

    public HeadDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.childDepartments = new ArrayList<>();
    }

    public void printDepartment() {
    	System.out.println("-----print leaf departments-----");
        this.childDepartments.forEach(Department::printDepartment);
        System.out.println("-----print head department-----");
        System.out.println("Type: "+getClass().getSimpleName()+"; id: "+this.getId()+"; name: "+this.getName());
    }

    public void addDepartment(Department department) {
    	this.childDepartments.add(department);
    }

    public void removeDepartment(Department department) {
    	this.childDepartments.remove(department);
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
