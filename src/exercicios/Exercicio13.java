/*

Exerc�cio 13

Fa�a o exerc�cio 11 novamente mas declare as vari�veis como inteiros. Veja o que acontece quando voc� divide 9 por 2.

*/

import javax.swing.JOptionPane;

public class Exercicio13 {
	
	public static void main(String[] args) {
		
		int numero1, numero2, resultado;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um primeiro n�mero:"));
		
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo n�mero:"));
		
		resultado = numero1 / numero2;
		
		JOptionPane.showMessageDialog(null, "O resultado da divis�o �: " + resultado);
	
	}

}

