/*

Exercício 22B

Uma loja dará um desconto em seus produtos de acordo com a categoria de cada produto.
As categorias e os descontos são mostrados abaixo:
Categoria Desconto
A 10%
B 15%
C 20%
D 25%
E 50%
Faça um algoritmo para ler o nome do cliente, o preço e a categoria do
produto que o cliente está comprando. Após a leitura mostrar na tela o preço
final que o cliente

*/

import javax.swing.JOptionPane;

public class Exercicio22B {
	
	public static void main(String[] args) {
		
		String controle;
		
		controle = JOptionPane.showInputDialog(
			"Qual a profissão do Tibúrcio? \n "+
			"  e - engenheiro \n "+
			"  p - programador \n "+
			"  m - médico \n "+
			"  a - advogado \n "+
			"  d - designer "
			);
		
		char controleCHAR = controle.charAt(0);
		
		switch(controleCHAR){
			case 'e':
				JOptionPane.showMessageDialog(null,"Tibúrcio é engenheiro! ");
			break;
			
			case 'p':
				JOptionPane.showMessageDialog(null,"Tibúrcio é programador! ");
			break;
			
			case 'm':
				JOptionPane.showMessageDialog(null,"Tibúrcio é médico! ");
			break;
			
			case 'a':
				JOptionPane.showMessageDialog(null,"Tibúrcio é advogado! ");
			break;
			
			case 'd':
				JOptionPane.showMessageDialog(null,"Tibúrcio é designer! ");
			break;
						
			default:
				JOptionPane.showMessageDialog(null,"Tibúrcio está DESEMPREGADO! ");
			break;
		}		
		

	}

}

