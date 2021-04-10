/*

Exercício 21

Implemente uma calculadora, primeiro peça 2 números ao usuário (um de cada vez) e apresente as seguintes opções:
1 - adição
2 - subtração
3 - multiplicação
4 - divisão
Mostre o resultado após a operação.

*/

import javax.swing.JOptionPane;

public class Exercicio21 {
	
	public static void main(String[] args) {
		
		int numero1, numero2, controle, resultado;

		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));		
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo número:"));
		controle = Integer.parseInt(JOptionPane.showInputDialog("Qual operação você quer executar ?"+ " \n 1 - adição \n 2 - subtração \n 3 - multiplicação \n 4 - divisão"));
		
		switch(controle){
			case 1:
				resultado = numero1 + numero2;
				JOptionPane.showMessageDialog(null,"O resultado da soma é: " + resultado);
			break;

			case 2:
				resultado = numero1 - numero2;
				JOptionPane.showMessageDialog(null,"O resultado subtração é: " + resultado);
			break;

			case 3:
				resultado = numero1 * numero2;
				JOptionPane.showMessageDialog(null,"O resultado multiplicação é: " + resultado);
			break;

			case 4:
				resultado = numero1 / numero2;
				JOptionPane.showMessageDialog(null,"O resultado divisão é: " + resultado);
			break;
			
			default:
				JOptionPane.showMessageDialog(null,"Opção inválida! ");
			break;		
		}

	}

}

