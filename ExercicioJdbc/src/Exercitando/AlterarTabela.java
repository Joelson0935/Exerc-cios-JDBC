package Exercitando;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class AlterarTabela {

	public static void main(String[] args) throws SQLException {
  
		Connection conexao = ModoConexao.getConexao();
		String sql = "Alter Table Cliente "
				+ "Add Constraint fk_Id_Calca "
				+ "Foreign Key (Id_Calca) "
				+ "References Calcas (Id_Calca) ";
		PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.execute();
        System.out.println("Alterado Com Sucesso !!!");
        
 //       scan.close();
        stmt.close();
        conexao.close();
	}

}
