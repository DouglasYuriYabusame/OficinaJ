package entities;

public class Mecanico extends Funcionario {
			
	public Mecanico(int id, String nome, String telefone) {
		super(id, nome, telefone);		
	}	
	@Override
	public void calcsalario() {
		
		   salario += 850;
	}

}
