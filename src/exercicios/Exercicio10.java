/*
Exerc�cio 10

Escreva um programa em JAVA que solicite ao usu�rio 2 n�meros inteiros (um de cada vez), armazene os valores em vari�veis e depois mostre a subtra��o dos dois em uma mensagem. 

*/

import javax.swing.JOptionPane;

public class Exercicio10 {
	
	public static void main(String[] args) {
		
		int numero1, numero2, subtracao;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um primeiro n�mero:"));
		
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo n�mero:"));
		
		subtracao = numero1 - numero2;
		
		JOptionPane.showMessageDialog(null, "O resultado da subra��o �: " + subtracao);
		
		/*JOptionPane.showMessageDialog(null, 
			 " Vari�veis: \n"
			+" numero1 = "+ numero1 +" \n"
			+" numero2 = "+ numero2 +" \n\n"
			+" Subtra��o: \n"
			+" numero1 - numero2 = " + subtracao
		);*/
	
	}

}

