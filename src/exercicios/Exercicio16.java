/*

Exercício 16

Faça um programa em JAVA que solicite 1 número inteiro, verificar se o mesmo é múltiplo de 2 e mostrar a resposta mesmo que negativa:

*/

import javax.swing.JOptionPane;

public class Exercicio16 {
	
	public static void main(String[] args) {
		
		int numero, resultado;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));		
	
		if((numero % 2) == 0){
			JOptionPane.showMessageDialog(null,"O número informado é múltiplo de 2 !");
		}else{
			JOptionPane.showMessageDialog(null,"O número informado NÃO é múltiplo de 2 !");
		}

		
	
	}

}

