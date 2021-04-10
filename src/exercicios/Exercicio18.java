/*

Exercício 18

A prefeitura de Florianópolis abriu uma linha de crédito para os funcionários estatutários. 
O valor máximo da prestação não poderá ultrapassar 30% do salário bruto. 
Faça um algoritmo que permita entrar com o salário bruto e o valor da prestação 
e informar se o empréstimo pode ou não ser concedido.

100 = 1200
 30 = X

*/

import javax.swing.JOptionPane;

public class Exercicio18 {
	
	public static void main(String[] args) {
		
		double salario_bruto, valor_prestacao, valor_permitido;
		
		salario_bruto   = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu Salário Bruto:"));		
		
		valor_prestacao = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da prestação:"));
		
		valor_permitido = (30 * salario_bruto) / 100 ;  // 30% | Regra de três
		
		if(valor_prestacao <= valor_permitido){
			JOptionPane.showMessageDialog(null,"O emprestimo pode ser concedido!");
		}else{
			JOptionPane.showMessageDialog(null,"O emprestimo NÃO pode ser concedido!");
		}				

	}

}

