/*

Exercício 15

Faça um programa em JAVA que solicite 2 números inteiros e efetue a adição; caso o resultado seja maior que 10, apresentá-lo:

*/

import javax.swing.JOptionPane;

public class Exercicio15 {
	
	public static void main(String[] args) {
		
		int numero1, numero2, resultado;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));		
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo número:"));
	
		resultado = numero1 + numero2;
		
		if(resultado > 10){
			JOptionPane.showMessageDialog(null,"A soma dos números informados é: " + resultado);
		}
	
	}

}

