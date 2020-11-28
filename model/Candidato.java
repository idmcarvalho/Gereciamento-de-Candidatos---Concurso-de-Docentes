package model;

public class Candidato {
	private String cpf;
	private String nome;
	private String endereco;
	private String telefone;
	private String cargo;
	
	/**construtores**/
	
	public Candidato(String cpf, String nome, String endereco, String telefone, String cargo) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.cargo = cargo;
	}

	/**gerando getters and setters **/
	
		public String getCpf() {
			return cpf;
		}
	
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
	
		public String getNome() {
			return nome;
		}
	
		public void setNome(String nome) {
			this.nome = nome;
		}
	
		public String getEndereco() {
			return endereco;
		}
	
		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
	
		public String getTelefone() {
			return telefone;
		}
	
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
	
		public String getCargo() {
			return cargo;
		}
	
		public void setCargo(String cargo) {
			this.cargo = cargo;
		}
}
		 
		 
		 
		 
		 
		 
		 
		 