package Exercitando;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {

	public static void main(String[] args) throws SQLException {
		
		Connection conexao = ModoConexao.getConexao();
		Statement stmt = conexao.createStatement();
		stmt.execute("Create database Loja");
		
		System.out.println("Banco criado com Sucesso!");
		conexao.close();
        stmt.close();
	}

}
