package Exercitando;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirRegistro {

	public static void main(String[] args) throws SQLException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Selecione o Id para exclusão: ");
		int Deletar = scan.nextInt();
		
		Connection conexao = ModoConexao.getConexao();
		String Sql = "Delete From Mercadoria Where Id = ?";
		PreparedStatement stmt = conexao.prepareStatement(Sql);
		stmt.setInt(1, Deletar);
		if(stmt.executeUpdate()>0) {
			System.out.println("Deletado com Sucesso!");
		}else {
			System.out.println("Nada Aconteceu!");
		}
		stmt.close();
		scan.close();
		conexao.close();

	}

}
