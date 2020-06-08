package Exercitando;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BuscarProduto {

	public static void main(String[] args) throws SQLException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a Busca Aqui: ");
		int b = scan.nextInt();
		
		Connection conexao = ModoConexao.getConexao();
		String sql = "Select * From Mercadoria Where Id like ?";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, b );

		ResultSet resultado = stmt.executeQuery();
		
		List<Mercadoria> Mercadorias = new ArrayList<>();
		
		while (resultado.next()) {
			int Id = resultado.getInt("Id");
			String Produto = resultado.getString("Produto");
			String Quantidade = resultado.getString("Quantidade");
			String Entrada = resultado.getString("Entrada");
			Mercadorias.add(new Mercadoria(Produto, Quantidade, Entrada, Id));
		}
		for (Mercadoria m : Mercadorias) {
			System.out.println(m.getId() + " - " + m.getProduto() + " - " + m.getQuantidade() + " - " + m.getEntrada());
		}
		scan.close();
		conexao.close();
		stmt.close();
	}

}
