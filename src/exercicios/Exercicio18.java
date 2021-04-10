/*

Exerc�cio 18

A prefeitura de Florian�polis abriu uma linha de cr�dito para os funcion�rios estatut�rios. 
O valor m�ximo da presta��o n�o poder� ultrapassar 30% do sal�rio bruto. 
Fa�a um algoritmo que permita entrar com o sal�rio bruto e o valor da presta��o 
e informar se o empr�stimo pode ou n�o ser concedido.

100 = 1200
 30 = X

*/

import javax.swing.JOptionPane;

public class Exercicio18 {
	
	public static void main(String[] args) {
		
		double salario_bruto, valor_prestacao, valor_permitido;
		
		salario_bruto   = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu Sal�rio Bruto:"));		
		
		valor_prestacao = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da presta��o:"));
		
		valor_permitido = (30 * salario_bruto) / 100 ;  // 30% | Regra de tr�s
		
		if(valor_prestacao <= valor_permitido){
			JOptionPane.showMessageDialog(null,"O emprestimo pode ser concedido!");
		}else{
			JOptionPane.showMessageDialog(null,"O emprestimo N�O pode ser concedido!");
		}				

	}

}

