/*

Exerc�cio 20

Solicitar nome e idade de uma pessoa. 
Se a pessoa possuir idade entre 15 e 25 anos,
imprimir o nome e a mensagem: ACEITA.
Caso contr�rio, imprimir o nome e a mensagem: N�O ACEITA.

*/

import javax.swing.JOptionPane;

public class Exercicio20 {
	
	public static void main(String[] args) {
		
		String nome;
		int idade;
		
		nome  = JOptionPane.showInputDialog("Informe o seu nome:");		
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade:"));
		
		if((idade > 15) && (idade < 25)){
			JOptionPane.showMessageDialog(null, "ACEITA");
		}else{
			JOptionPane.showMessageDialog(null, "N�O ACEITA");  
		}

	}

}

