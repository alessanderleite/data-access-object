package br.com.alessanderleite.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public String driver = "com.mysql.jdbc.Driver";
	public String url = "jdbc:mysql://localhost:3306/db_dao?useSSL=false";
	public String user = "root";
	public String password = "root";
	
	public ConnectionFactory() {}
	
	public Connection createConnection() {
		try {
			Class.forName(driver);
			Connection connection = DriverManager.getConnection(url, user, password);
			return connection;
			
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;	
		}
	}
}
