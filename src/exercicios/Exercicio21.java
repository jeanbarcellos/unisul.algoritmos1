/*

Exerc�cio 21

Implemente uma calculadora, primeiro pe�a 2 n�meros ao usu�rio (um de cada vez) e apresente as seguintes op��es:
1 - adi��o
2 - subtra��o
3 - multiplica��o
4 - divis�o
Mostre o resultado ap�s a opera��o.

*/

import javax.swing.JOptionPane;

public class Exercicio21 {
	
	public static void main(String[] args) {
		
		int numero1, numero2, controle, resultado;

		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero:"));		
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo n�mero:"));
		controle = Integer.parseInt(JOptionPane.showInputDialog("Qual opera��o voc� quer executar ?"+ " \n 1 - adi��o \n 2 - subtra��o \n 3 - multiplica��o \n 4 - divis�o"));
		
		switch(controle){
			case 1:
				resultado = numero1 + numero2;
				JOptionPane.showMessageDialog(null,"O resultado da soma �: " + resultado);
			break;

			case 2:
				resultado = numero1 - numero2;
				JOptionPane.showMessageDialog(null,"O resultado subtra��o �: " + resultado);
			break;

			case 3:
				resultado = numero1 * numero2;
				JOptionPane.showMessageDialog(null,"O resultado multiplica��o �: " + resultado);
			break;

			case 4:
				resultado = numero1 / numero2;
				JOptionPane.showMessageDialog(null,"O resultado divis�o �: " + resultado);
			break;
			
			default:
				JOptionPane.showMessageDialog(null,"Op��o inv�lida! ");
			break;		
		}

	}

}

