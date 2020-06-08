package Exercitando;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizaBanco {

	public static void main(String[] args) throws SQLException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o Id: ");
		int valor = scan.nextInt();
		Connection conexao = ModoConexao.getConexao();
		String sql = "Select * From Mercadoria Where Id = ? ";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, valor);
		ResultSet resultado = stmt.executeQuery();
		
		if(resultado.next()) {
			Mercadoria m = new Mercadoria(resultado.getString(2), resultado.getString(3), resultado.getString(4), resultado.getInt(1));
			System.out.println(" "+m.getProduto()+" - "+ m.getQuantidade()+" - "+ m.getEntrada());
			stmt.close();
		
			String Updatesql = "Update Mercadoria Set Produto = ?, Quantidade = ?, Entrada = ? Where Id = ?";
			stmt = conexao.prepareStatement(Updatesql);
			scan.nextLine();
			System.out.println("Informe o novo Produto: ");
			String novoProduto = scan.nextLine();
			System.out.println("Informe a nova Quantidade: ");
			String novaQtd = scan.nextLine();
			System.out.println("Informe a novaEntrada: ");
			String novaEntrada = scan.nextLine();						
			stmt.setString(1, novoProduto);
			stmt.setString(2, novaQtd);
			stmt.setString(3, novaEntrada);
			stmt.setInt(4, valor);
			stmt.executeUpdate();
			
			System.out.println("Código Executado com Sucesso !!!");
		}else {
			System.out.println("Nada Acontece !!!");
		}
		
		scan.close();
		stmt.close();
		conexao.close();
	}
}
	
