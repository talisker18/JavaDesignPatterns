package com.henz.categories.A_interface.B_facade.demo2;

public class ClientProgramWithFacade {
	
	public static void main(String[] args) {
		HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTML, "student_table");
		HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.PDF, "person_table");
	}

}
