/*

Exerc�cio 22B

Uma loja dar� um desconto em seus produtos de acordo com a categoria de cada produto.
As categorias e os descontos s�o mostrados abaixo:
Categoria Desconto
A 10%
B 15%
C 20%
D 25%
E 50%
Fa�a um algoritmo para ler o nome do cliente, o pre�o e a categoria do
produto que o cliente est� comprando. Ap�s a leitura mostrar na tela o pre�o
final que o cliente

*/

import javax.swing.JOptionPane;

public class Exercicio22B {
	
	public static void main(String[] args) {
		
		String controle;
		
		controle = JOptionPane.showInputDialog(
			"Qual a profiss�o do Tib�rcio? \n "+
			"  e - engenheiro \n "+
			"  p - programador \n "+
			"  m - m�dico \n "+
			"  a - advogado \n "+
			"  d - designer "
			);
		
		char controleCHAR = controle.charAt(0);
		
		switch(controleCHAR){
			case 'e':
				JOptionPane.showMessageDialog(null,"Tib�rcio � engenheiro! ");
			break;
			
			case 'p':
				JOptionPane.showMessageDialog(null,"Tib�rcio � programador! ");
			break;
			
			case 'm':
				JOptionPane.showMessageDialog(null,"Tib�rcio � m�dico! ");
			break;
			
			case 'a':
				JOptionPane.showMessageDialog(null,"Tib�rcio � advogado! ");
			break;
			
			case 'd':
				JOptionPane.showMessageDialog(null,"Tib�rcio � designer! ");
			break;
						
			default:
				JOptionPane.showMessageDialog(null,"Tib�rcio est� DESEMPREGADO! ");
			break;
		}		
		

	}

}

