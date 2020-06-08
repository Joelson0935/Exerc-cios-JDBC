package Exercitando;

public class Mercadoria {

	private String Produto;
	private String Quantidade;
	private String Entrada;
	private int Id;
	
	public Mercadoria() {
		
	}
	
	public Mercadoria(String produto, String quantidade, String entrada, int id) {
		super();
		Produto = produto;
		Quantidade = quantidade;
		Entrada = entrada;
		Id = id;
	}
	public String getProduto() {
		return Produto;
	}
	public void setProduto(String produto) {
		Produto = produto;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getQuantidade() {
		return Quantidade;
	}
	public void setQuantidade(String quantidade) {
		Quantidade = quantidade;
	}
	public String getEntrada() {
		return Entrada;
	}
	public void setEntrada(String entrada) {
		Entrada = entrada;
	}	
}
