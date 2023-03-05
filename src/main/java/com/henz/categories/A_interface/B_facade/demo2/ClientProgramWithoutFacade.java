package com.henz.categories.A_interface.B_facade.demo2;

import java.sql.Connection;

import com.henz.categories.A_interface.B_facade.demo2.interfaces.MySqlHelper;
import com.henz.categories.A_interface.B_facade.demo2.interfaces.OracleHelper;

public class ClientProgramWithoutFacade {
	public static void main(String[] args) {
		//generate a pdf report for MySQL
		Connection con = MySqlHelper.getMySqlDBConnection();
		MySqlHelper mySqlHelper = new MySqlHelper();
		mySqlHelper.generateMySqlPDFReport("student_table", con);
		
		//generate a html report for oracle
		Connection con2 = OracleHelper.getOracleDBConnection();
		OracleHelper oracleHelper = new OracleHelper();
		oracleHelper.generateOracleHTMLReport("person_table", con2);
	}
}
