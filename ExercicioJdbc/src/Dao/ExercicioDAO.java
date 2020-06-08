package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ExercicioDAO {

	public void criarTabela() {
		Connection conexao = ConnectionFactory.getConexao();
		String sql = "Create Table Pessoa("
				+ "Id int Primary Key Auto_Increment,"
				+ "Nome Varchar(30) not null"
				+ ")";
				
		try {
			PreparedStatement stmt =  conexao.prepareStatement(sql);
			stmt.execute();
			System.out.println("Tabela Criada com Sucesso !!");
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void inserirDados() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o Id: ");
		int num = scan.nextInt();
		scan.nextLine();
		System.out.println("Informe o nome: ");
		String nome = scan.nextLine();
		scan.close();
		Connection conexao = ConnectionFactory.getConexao();
		try {
		String sql = "Insert Into Pessoa(Id, Nome) values(?, ?) ";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, num);
		stmt.setString(2, nome);
		
		if(stmt.executeUpdate() > 0) {
		
		System.out.println("Dados inseridos com Sucesso !!!");
		}else {
			System.out.println("Nada Acontece !!!! ");
		}
		
		conexao.close();
		stmt.close();
		
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
		
	}
	
	
	public void atualizarCadastro() {
		
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Informe o Id desejado: ");
			int num = scan.nextInt();
			Connection conexao = ConnectionFactory.getConexao();
			String sql1 = "Select * From Pessoa Where Id = ?";
			PreparedStatement stmt = conexao.prepareStatement(sql1);
			stmt.setInt(1, num);
			ResultSet res = stmt.executeQuery();
			if(res.next()) {
				Pessoa  p = new Pessoa(res.getInt(1), res.getString(2));
				System.out.println("ID: "+p.getId()+" Nome: "+p.getNome());
				
				stmt.close();
				String sql2 = "Update Pessoa Set Nome = ? Where Id = ?";
				stmt = conexao.prepareStatement(sql2);
				scan.nextLine();
				System.out.println("Digite o novo Nome: ");
				String num2 = scan.nextLine();
				
				stmt.setString(1, num2);
				stmt.setInt(2, num);
				
				stmt.execute();
				
				System.out.println("Deu Tudo Certo !!!!");
						
			}	else {
				System.out.println("Fudeu !!!!");
			}
			scan.close();
			stmt.close();
			conexao.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);						
		}		
	}
	      
	       public void excluirDados() {
	    	   try {
	    		   
	        System.out.println("Insira um Id Para Exclusao: ");
	    	Scanner scan = new Scanner(System.in);  
	    	int num = scan.nextInt();
	    	Connection conexao = ConnectionFactory.getConexao();
	    	String sql = "Delete From Pessoa Where Id = ?";
	    	PreparedStatement stmt = conexao.prepareStatement(sql);
	    	stmt.setInt(1, num);
	    	
	    	if(stmt.executeUpdate() > 0) {
	    	System.out.println("Deu Tudo Certo !!!");
	    	}else {
	    		System.out.println("Deu Merda !!!");
	    	}
	    	
	    		scan.close();
	    		stmt.close();
	    		conexao.close(); 	 	
	    	   }catch (SQLException e) {
	    		   throw new RuntimeException(e);
	    	   }
	    	
	    	   
	    	   
	    	   
  }
}
