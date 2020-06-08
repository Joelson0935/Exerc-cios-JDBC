package Exercitando;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabela {

  public static void main(String[] args) throws SQLException {
		Connection conexao = ModoConexao.getConexao();
        String sql= "Create Table if not exists Cliente ("
        		+ "Id_Cliente int auto_increment primary key,"
		        +"Nome varchar(80) not null,"
		        + "Valor_Total int not null,"
		        + "Data date not null"		        
        		+ ")";		
		 Statement stmt = conexao.createStatement();
		 stmt.execute(sql);
        System.out.println("Tabela Criada!");

        conexao.close();
        stmt.close();
	}

}
