/*

Exerc�cio 14

Fa�a um programa em JAVA que implemente a discriminante da equa��o quadr�tica :  Delta = b� - 4ac

*/

import javax.swing.JOptionPane;

public class Exercicio14 {
	
	public static void main(String[] args) {
		
		int a, b, c, delta;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero para a:"));		
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero para b:"));
		c = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero para c:"));
	
		delta = (b * b) - (4 * a * c);
		
		JOptionPane.showMessageDialog(null, "Delta �: " + delta);
	
	}

}

