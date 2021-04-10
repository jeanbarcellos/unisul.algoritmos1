/*
Exercício 8

Escreva um programa em JAVA que solicite ao usuário 2 números inteiros (um de cada vez), armazene os valores em variáveis e depois mostre a soma dos dois em uma mensagem.

*/

import javax.swing.JOptionPane;

public class Exercicio8 {
	
	public static void main(String[] args) {
		
		int numero1, numero2, soma;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para numero1:"));
		
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para numero2:"));
		
		soma = numero1 + numero2;
		
		JOptionPane.showMessageDialog(null, "A soma das variáveis numero1 e numero2 é: " + soma);
	
	}

}