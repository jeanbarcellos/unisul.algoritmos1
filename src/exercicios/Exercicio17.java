/*

Exerc�cio 17

Fa�a um programa em JAVA que solicite 2 n�meros inteiros, 
verificar qual � o n�mero maior  e mostrar na tela, 
ou se forem iguais, mostrar uma mensagem indicando esta informa��o:

*/

import javax.swing.JOptionPane;

public class Exercicio17 {
	
	public static void main(String[] args) {
		
		int numero1, numero2, resultado;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero:"));		
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo n�mero:"));
	
		if(numero1 > numero2){
			JOptionPane.showMessageDialog(null,"O primeiro n�mero informado � maior que o segundo!");
		}else{
			if(numero1 < numero2){
				JOptionPane.showMessageDialog(null,"O segundo n�mero informado � maior que o primeiro!");
			}else{
				JOptionPane.showMessageDialog(null,"Os dois n�meros informados s�o iguais");
			}
		}

		
	
	}

}

