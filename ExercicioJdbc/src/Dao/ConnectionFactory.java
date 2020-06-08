package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public static Connection getConexao() {
		
		try{
	final String url = "jdbc:Mysql://localhost:3306/Pub?verifyServerCertificate=False&useSSL=true";
	final String usuario = " ";
	final String senha = " ";
	
	return DriverManager.getConnection(url, usuario, senha);
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
		
}
