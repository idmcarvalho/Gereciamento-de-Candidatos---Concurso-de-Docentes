package model;

public class Candidato {
	private String cpf;
	private String nome;
	private String cargo;
	
	/**construtores**/
	
	public Candidato(String cpf, String nome, String cargo) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.cargo = cargo;
	}
	
	public Candidato() {
		
	} /**Construtor vazio**/
	
	/**gerando getters and setters**/
	
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
	
		public String getCargo() {
			return cargo;
		}
	
		public void setCargo(String cargo) {
			this.cargo = cargo;
		}
}
		 
		 
		 
		 
		 
		 
		 
		 