package entities;

public class Vendedor extends Funcionario {

	public Vendedor(int id, String nome, String telefone) {
		super(id, nome, telefone);		
	}	
	@Override		
	public void calcsalario() {		
		
		  salario += 900;
	}

}
