package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class TesteDao {

	public static void main(String[] args) {
	ExercicioDAO dao = new ExercicioDAO();
	  dao.atualizarCadastro();
	 //  dao.inserirDados();
    //   dao.excluirDados();
	}

}
