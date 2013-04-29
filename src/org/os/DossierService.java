package org.os;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DossierService {
	
	private DBConnectionService connectionService;
	
	public DossierService() {
	}
	
	public void findDossiers(Statement statement){
		try {
			ResultSet result = statement.executeQuery("SELECT id, name, description created_by FROM OA_GROUP ");

			System.out.println("Got results:");
			while (result.next()) { // process results one row at a time
				int id = result.getInt(1);
				String name = result.getString(2);
				String description = result.getString(3);

				System.out.println("id = " + id);
				System.out.println("name = " + name);
				System.out.println("description= " + description);
				
				System.out.println("===========================");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}


	public void setConnectionService(DBConnectionService connectionService) {
		this.connectionService = connectionService;
	}
	

	public void findDossiersSpring(){
		findDossiers(connectionService.getStatement());
	}

}
