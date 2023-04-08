package com.henz.categories.A_interface.C_composite.demo1;

import com.henz.categories.A_interface.C_composite.demo1.component.Department;
import com.henz.categories.A_interface.C_composite.demo1.composite.HeadDepartment;
import com.henz.categories.A_interface.C_composite.demo1.leaf.FinancialDepartment;
import com.henz.categories.A_interface.C_composite.demo1.leaf.SalesDepartment;

public class ClientProgram {
	
	public static void main(String[] args) {
		Department salesDepartment = new SalesDepartment(1, "Sales department");
		Department financialDepartment = new FinancialDepartment(2, "Financial department");

		HeadDepartment headDepartment = new HeadDepartment(3, "Head department");
		
		headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(financialDepartment);

        headDepartment.printDepartment();
	}

}
