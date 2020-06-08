package Dao;

public class Pessoa {
	private int Id;
	private String Nome;
	
	public Pessoa(int id, String nome) {
		super();
		Id = id;
		Nome = nome;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}
	
	

}
