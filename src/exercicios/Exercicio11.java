/*

Exercício 11

Escreva um programa em JAVA que solicite ao usuário 2 números REAIS (double) (um de cada vez), armazene os valores em variáveis e depois mostre a divisão dos dois em uma mensagem.

*/

import javax.swing.JOptionPane;

public class Exercicio11 {
	
	public static void main(String[] args) {
		
		double numero1, numero2, resultado;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um primeiro número:"));
		
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo número:"));
		
		resultado = numero1 / numero2;
		
		JOptionPane.showMessageDialog(null, "O resultado da divisão é: " + resultado);
	
	}

}

