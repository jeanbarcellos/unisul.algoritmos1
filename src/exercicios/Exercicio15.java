/*

Exerc�cio 15

Fa�a um programa em JAVA que solicite 2 n�meros inteiros e efetue a adi��o; caso o resultado seja maior que 10, apresent�-lo:

*/

import javax.swing.JOptionPane;

public class Exercicio15 {
	
	public static void main(String[] args) {
		
		int numero1, numero2, resultado;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero:"));		
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo n�mero:"));
	
		resultado = numero1 + numero2;
		
		if(resultado > 10){
			JOptionPane.showMessageDialog(null,"A soma dos n�meros informados �: " + resultado);
		}
	
	}

}

