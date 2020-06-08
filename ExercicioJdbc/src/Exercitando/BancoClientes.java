package Exercitando;

public class BancoClientes {

        private String nome = "";
		private int ID = 0 ;
		private String cpf = "";
			
		public BancoClientes(String nome, int iD, String cpf) {
			super();
			this.nome = nome;
			ID = iD;
			this.cpf = cpf;
		}


		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public int getID() {
			return ID;
		}


		public void setID(int iD) {
			ID = iD;
		}


		public String getCpf() {
			return cpf;
		}


		public void setCpf(String cpf) {
			this.cpf = cpf;
		}


		

}
