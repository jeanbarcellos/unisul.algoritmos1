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
final que o cliente dever� pagar ap�s ter sido dado o desconto no pre�o da
mercadoria. 

*/

import javax.swing.JOptionPane;

public class Exercicio22B {
	
	public static void main(String[] args) {

		String nome;
		double preco;
		String categoria;
		double resultado;
		
		nome = JOptionPane.showInputDialog("Informe o nome do cliente: ");
		
		preco = Double.parseDouble(JOptionPane.showInputDialog("Informe pre�o do produto: "));
		
		categoria = JOptionPane.showInputDialog(
			"Qual a categoria do desconto? \n "+
			"  A 10% \n "+
			"  B 15% \n "+
			"  C 20% \n "+
			"  D 25% \n "+
			"  E 50% "
			);
		
		char categoriaCHAR = categoria.charAt(0);
		
		switch(categoriaCHAR){
			case 'A':
				resultado = preco - ((10 * preco) / 100) ;
				JOptionPane.showMessageDialog(null,"O cliente "+ nome +" ir� pagar: "+ resultado +" pois recebeu 10% de desconto!");
			break;
			
			case 'B':
				resultado = preco - ((15 * preco) / 100) ;
				JOptionPane.showMessageDialog(null,"O cliente "+ nome +" ir� pagar: "+ resultado +" pois recebeu 15% de desconto!");
			break;
			
			case 'C':
				resultado = preco - ((20 * preco) / 100) ;
				JOptionPane.showMessageDialog(null,"O cliente "+ nome +" ir� pagar: "+ resultado +" pois recebeu 20% de desconto!");
			break;
			
			case 'D':
				resultado = preco - ((25 * preco) / 100) ;
				JOptionPane.showMessageDialog(null,"O cliente "+ nome +" ir� pagar: "+ resultado +" pois recebeu 25% de desconto!");
			break;
			
			case 'E':
				resultado = preco - ((50 * preco) / 100) ;
				JOptionPane.showMessageDialog(null,"O cliente "+ nome +" ir� pagar: "+ resultado +" pois recebeu 50% de desconto!");
			break;
						
			default:
				JOptionPane.showMessageDialog(null,"O cliente "+ nome +" ir� pagar o valor integral pois n�o recebeu nenhum desconto!");
			break;
		}		
		

	}

}

