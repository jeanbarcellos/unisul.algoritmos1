/*

Exerc�cio 11

Escreva um programa em JAVA que solicite ao usu�rio 2 n�meros REAIS (double) (um de cada vez), armazene os valores em vari�veis e depois mostre a divis�o dos dois em uma mensagem.

*/

import javax.swing.JOptionPane;

public class Exercicio11 {
	
	public static void main(String[] args) {
		
		double numero1, numero2, resultado;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um primeiro n�mero:"));
		
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo n�mero:"));
		
		resultado = numero1 / numero2;
		
		JOptionPane.showMessageDialog(null, "O resultado da divis�o �: " + resultado);
	
	}

}

