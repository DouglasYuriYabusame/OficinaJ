package application;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import entities.Funcionario;
import entities.Mecanico;
import entities.Vendedor;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		DecimalFormat df = new DecimalFormat("0.00");
		String opcao;
		char repetir = 's';
		
		List<Funcionario> listaFuncionario = new ArrayList<>();
				
		do {
			opcao = JOptionPane.showInputDialog("CADASTRO DE FUNCIONÁRIO\n"
												+ "1 - Mecanico;\n"
												+ "2 - Vendedor.");
			switch (Integer.parseInt(opcao)){
		
			case 1:
				Funcionario mecanico = new Mecanico(
				Integer.parseInt(JOptionPane.showInputDialog("Número de identificador de cadastro: ")),
				JOptionPane.showInputDialog("Nome do funcionário: "),
				JOptionPane.showInputDialog("Telefone: "));
				listaFuncionario.add(mecanico);
				repetir = desejaRepetir();

			break;
		
			case 2:
				Funcionario vendedor = new Vendedor(
				Integer.parseInt(JOptionPane.showInputDialog("Número de identificador de cadastro: ")),
				JOptionPane.showInputDialog("Nome do funcionário: "),
				JOptionPane.showInputDialog("Telefone: "));				
				listaFuncionario.add(vendedor);
				repetir = desejaRepetir();
			break;
		
			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida");
				
			break;
		
		}}while(repetir == 's');
		
		for(Funcionario x : listaFuncionario) {
			JOptionPane.showMessageDialog(null, "Id: " + x.getId() + "\nNome: " + x.getNome() + "\nTelefone: " + x.getTelefone() + "\nSalario: R$ " + df.format(x.getSalario()) );
		}
	}
	
	public static char desejaRepetir() {
		String opcao;
		opcao = (JOptionPane.showInputDialog("Deseja cadastrar outro funcionário? (s/n)"));
		char repetir = opcao.charAt(0);
		System.out.println(opcao);
		if (repetir != 's' && repetir != 'n') {
			System.out.println("Opção Inválida");
			opcao = JOptionPane.showInputDialog("Deseja cadastrar outro funcionário? (s/n)");
		}
		return repetir;
	}
}	
	
		
		
		
		
		
		
		
		
	


