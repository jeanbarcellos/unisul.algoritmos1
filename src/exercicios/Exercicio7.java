/*
Exerc�cio 7

Escreva um programa em JAVA que solicite ao usu�rio um nome, armazene em uma vari�vel e depois mostre o nome digitado em uma mensagem.

*/

import javax.swing.JOptionPane;

public class Exercicio7 {
	
	public static void main(String[] args) {
		
		String nome;
		
		nome = JOptionPane.showInputDialog("Digite seu nome:");
		
		JOptionPane.showMessageDialog(null, "Seu nome �: " + nome);
	
	}

}