/*
Exerc�cio Extra

Fa�a um programa em JAVA, declarando duas vari�veis do tipo inteiro (int), atribua um valor qualquer a estas duas, declare uma terceira vari�vel e armazene a soma das duas primeiras.
Depois mostre o valor desta vari�vel com o resultado em uma mensagem.

*/

import javax.swing.JOptionPane;

public class Exercicio6_Extra {

	public static void main(String[] args) {

		int numero1, numero2, soma;
		
		numero1 = 1000;
		numero2 = 2000;
		soma = numero1 + numero2;
		
		JOptionPane.showMessageDialog(null, "A soma das variaveis �: " + soma);

	}

}