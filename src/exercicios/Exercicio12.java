/*

Exerc�cio 12

Escreva um programa em JAVA que solicite ao usu�rio 2 n�meros inteiros (um de cada vez), armazene os valores em vari�veis e depois mostre a multiplica��o dos dois em uma mensagem.

*/

import javax.swing.JOptionPane;

public class Exercicio12 {
	
	public static void main(String[] args) {
		
		int numero1, numero2, resultado;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um primeiro n�mero:"));
		
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo n�mero:"));
		
		resultado = numero1 * numero2;
		
		JOptionPane.showMessageDialog(null, "O resultado da multipla��o �: " + resultado);
	
	}

}

