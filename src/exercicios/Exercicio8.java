/*
Exerc�cio 8

Escreva um programa em JAVA que solicite ao usu�rio 2 n�meros inteiros (um de cada vez), armazene os valores em vari�veis e depois mostre a soma dos dois em uma mensagem.

*/

import javax.swing.JOptionPane;

public class Exercicio8 {
	
	public static void main(String[] args) {
		
		int numero1, numero2, soma;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero para numero1:"));
		
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero para numero2:"));
		
		soma = numero1 + numero2;
		
		JOptionPane.showMessageDialog(null, "A soma das vari�veis numero1 e numero2 �: " + soma);
	
	}

}