package Exercitando;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {

	public static void main(String []args) throws SQLException {
		
	 final String url = "jdbc:mysql://localhost:3306?verifyServerCertificate=False&useSSL=true";
		 final String usuario = "root";
         final String senha = "Joe#88236643"; 
        
        Connection conexao = DriverManager.getConnection(url, usuario, senha); 
		
         System.out.println("Conexão criada.");
         
         conexao.close();
	}

}
