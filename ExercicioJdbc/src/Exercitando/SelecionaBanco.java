package Exercitando;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class SelecionaBanco {

	public static void main(String[] args) throws SQLException {

	
		Connection conexao = ModoConexao.getConexao();
		String sql = "Select * From mercadoria ";
		Statement stmt = conexao.createStatement();
		ResultSet resultado = stmt.executeQuery(sql);

		List<Mercadoria> mercadorias = new ArrayList<>();
		while (resultado.next()) {
			int id = resultado.getInt("Id");
			String produto = resultado.getString("Produto");
			String quantidade = resultado.getString("Quantidade");
			String entrada = resultado.getString("Entrada");
			mercadorias.add(new Mercadoria(produto, quantidade, entrada, id));
		}
		for (Mercadoria m : mercadorias) {
			System.out.println(m.getId() + " - " + m.getProduto() + " - " + m.getQuantidade() + " - " + m.getEntrada());
		}

		stmt.close();
		conexao.close();
	}

}
