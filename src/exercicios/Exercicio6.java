/*
Exercício 6

Repita o exercício anterior, mas agora mostre a mensagem abaixo:
O valor da variável é : <número escolhido>

*/

import javax.swing.JOptionPane;

public class Exercicio6 {

	public static void main(String[] args) {

		int numero;
		
		numero = 2015;
		
		JOptionPane.showMessageDialog(null, "O valor da variável é: "+ numero);

	}

}