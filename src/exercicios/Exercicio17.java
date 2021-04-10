/*

Exercício 17

Faça um programa em JAVA que solicite 2 números inteiros, 
verificar qual é o número maior  e mostrar na tela, 
ou se forem iguais, mostrar uma mensagem indicando esta informação:

*/

import javax.swing.JOptionPane;

public class Exercicio17 {
	
	public static void main(String[] args) {
		
		int numero1, numero2, resultado;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));		
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo número:"));
	
		if(numero1 > numero2){
			JOptionPane.showMessageDialog(null,"O primeiro número informado é maior que o segundo!");
		}else{
			if(numero1 < numero2){
				JOptionPane.showMessageDialog(null,"O segundo número informado é maior que o primeiro!");
			}else{
				JOptionPane.showMessageDialog(null,"Os dois números informados são iguais");
			}
		}

		
	
	}

}

