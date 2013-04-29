package org.os;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBConnectionService {

	private static DBConnectionService sInstance;
	
	private Statement statement;
	
	private DBConnectionService() {
		String url = "jdbc:h2:tcp://localhost/operations";

		try {
			Class.forName("org.h2.Driver");
		} catch (Exception e) {
			System.out.println("Failed to load mSQL driver.");
			return;
		}
		
		try {
			Connection con = DriverManager.getConnection(url, "sa", "");
			statement = con.createStatement();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		    
	}
	
	public static DBConnectionService getInstance() {
		if (sInstance == null) {
			sInstance = new DBConnectionService();
		}
		
		return sInstance;
	}

	public Statement getStatement() {
		return statement;
	}

	public void setStatement(Statement statement) {
		this.statement = statement;
	}
	
	
	


}
