/*

Exercício 19

Solicitar o ano de nascimento de uma pessoa e o ano atual. 
Verifique se o ano de nascimento é válido, ou seja, se o ano de nascimento é menor que o ano atual, 
então mostre a idade desta pessoa.

*/

import javax.swing.JOptionPane;

public class Exercicio19 {
	
	public static void main(String[] args) {
		
		int ano_nascimento, ano_tual, idade;
		
		ano_nascimento = Integer.parseInt(JOptionPane.showInputDialog("Informe o seu ano de nascimento:"));		
		ano_tual       = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano aual:"));
		
		if(ano_nascimento < ano_tual){
			idade = ano_tual - ano_nascimento;
			JOptionPane.showMessageDialog(null, "A sua idade é: "+ idade);			
		}else{
			JOptionPane.showMessageDialog(null, "O ano de nascimento não pode ser superior ao ano atual");
		}

	}

}

