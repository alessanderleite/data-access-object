package br.com.alessanderleite.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static final String DRIVER = "com.mysql.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/db_dao?useSSL=false";
	public static final String USER = "root";
	public static final String PASSWORD = "root";
	
	public ConnectionFactory() {}
	
	public Connection createConnection() {
		Connection connection;
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			return connection;
			
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;	
		}
	}
}
