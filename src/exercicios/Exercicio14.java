/*

Exercício 14

Faça um programa em JAVA que implemente a discriminante da equação quadrática :  Delta = b² - 4ac

*/

import javax.swing.JOptionPane;

public class Exercicio14 {
	
	public static void main(String[] args) {
		
		int a, b, c, delta;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para a:"));		
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para b:"));
		c = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para c:"));
	
		delta = (b * b) - (4 * a * c);
		
		JOptionPane.showMessageDialog(null, "Delta é: " + delta);
	
	}

}

