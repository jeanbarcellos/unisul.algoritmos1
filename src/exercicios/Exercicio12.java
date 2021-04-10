/*

Exercício 12

Escreva um programa em JAVA que solicite ao usuário 2 números inteiros (um de cada vez), armazene os valores em variáveis e depois mostre a multiplicação dos dois em uma mensagem.

*/

import javax.swing.JOptionPane;

public class Exercicio12 {
	
	public static void main(String[] args) {
		
		int numero1, numero2, resultado;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um primeiro número:"));
		
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo número:"));
		
		resultado = numero1 * numero2;
		
		JOptionPane.showMessageDialog(null, "O resultado da multiplação é: " + resultado);
	
	}

}

