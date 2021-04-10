/*
Exercício 10

Escreva um programa em JAVA que solicite ao usuário 2 números inteiros (um de cada vez), armazene os valores em variáveis e depois mostre a subtração dos dois em uma mensagem. 

*/

import javax.swing.JOptionPane;

public class Exercicio10 {
	
	public static void main(String[] args) {
		
		int numero1, numero2, subtracao;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um primeiro número:"));
		
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo número:"));
		
		subtracao = numero1 - numero2;
		
		JOptionPane.showMessageDialog(null, "O resultado da subração é: " + subtracao);
		
		/*JOptionPane.showMessageDialog(null, 
			 " Variáveis: \n"
			+" numero1 = "+ numero1 +" \n"
			+" numero2 = "+ numero2 +" \n\n"
			+" Subtração: \n"
			+" numero1 - numero2 = " + subtracao
		);*/
	
	}

}

