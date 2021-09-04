package entities;

public abstract class Funcionario {
	
	protected int id;
	protected String nome;
	protected String telefone;
	static double salario = 1455.90;
	
	public Funcionario(int id, String nome, String telefone) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public double getSalario() {
	    calcsalario();
		return salario;
	}

	public void setSalario(double salario) {
		Funcionario.salario = salario;
	}
	
	public void calcsalario() {}

	
	
	
	

}
