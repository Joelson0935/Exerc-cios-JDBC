package Exercitando;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class ModoConexao {
	public static Connection getConexao() {
	
     try {
		final String url = "jdbc:mysql://localhost:3306/Loja?verifyServerCertificate=False&useSSL=true";
		 final String usuario = "root";
		 final String senha = "Joe#88236643"; 
		 
		 return DriverManager.getConnection(url, usuario, senha);
	} catch (SQLException e) {
		throw new RuntimeException(e);
	  }			
   }
}
