/*

Exerc�cio 16

Fa�a um programa em JAVA que solicite 1 n�mero inteiro, verificar se o mesmo � m�ltiplo de 2 e mostrar a resposta mesmo que negativa:

*/

import javax.swing.JOptionPane;

public class Exercicio16 {
	
	public static void main(String[] args) {
		
		int numero, resultado;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero:"));		
	
		if((numero % 2) == 0){
			JOptionPane.showMessageDialog(null,"O n�mero informado � m�ltiplo de 2 !");
		}else{
			JOptionPane.showMessageDialog(null,"O n�mero informado N�O � m�ltiplo de 2 !");
		}

		
	
	}

}

