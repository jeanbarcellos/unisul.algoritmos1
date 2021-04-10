/*

Exercício 13

Faça o exercício 11 novamente mas declare as variáveis como inteiros. Veja o que acontece quando você divide 9 por 2.

*/

import javax.swing.JOptionPane;

public class Exercicio13 {
	
	public static void main(String[] args) {
		
		int numero1, numero2, resultado;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um primeiro número:"));
		
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo número:"));
		
		resultado = numero1 / numero2;
		
		JOptionPane.showMessageDialog(null, "O resultado da divisão é: " + resultado);
	
	}

}

