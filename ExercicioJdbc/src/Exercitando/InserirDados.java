package Exercitando;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InserirDados {

	public static void main(String[] args) throws SQLException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o Produto: ");
		String num1 = scan.nextLine();
		System.out.println("Digite a Quantidade: ");
		String num2 = scan.nextLine();
		System.out.println("Digite a data de Entrada: ");
		String num3 = scan.nextLine();
		

		Connection conexao = ModoConexao.getConexao();
		String sql = "insert into mercadoria(Produto, Quantidade, Entrada)"
				+"values(?, ?, ?)";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, num1);
		stmt.setString(2, num2);
		stmt.setString(3, num3);
		stmt.execute();
		
		System.out.println("Tudo Certo!");
		stmt.close();
        scan.close();
		conexao.close();

	}

}
