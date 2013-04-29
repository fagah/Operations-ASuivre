package org.os;

import java.sql.Statement;

public class OSMain {

	public OSMain() {

	}

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("\n----- OS Appplication STARTING... ----\n ");
		
		DBConnectionService instance = DBConnectionService.getInstance();
		Statement statement =  instance.getStatement();
		
		DossierService service = new DossierService();
		service.findDossiers(statement);
	}

}
