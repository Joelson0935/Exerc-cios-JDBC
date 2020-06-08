package Exercitando;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExcluirTabela {

	public static void main(String[] args) throws SQLException {
		 
		Connection conexao = ModoConexao.getConexao();
		String Sql = "Drop Table Camisas_Polo";
		PreparedStatement stmt = conexao.prepareStatement(Sql);
                       
        stmt.executeUpdate();
        
        System.out.println("Exclusão Concluída com Sucesso !!!");
      
        
        stmt.close();
        conexao.close();
	}

}
