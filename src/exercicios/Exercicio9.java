/*
Exerc�cio 9

Escreva um programa em JAVA que solicite ao usu�rio o seu peso(aqui entenda massa) em Kg(int) e a sua altura em metros (Double). 
Com estes dados calcule o IMC � �ndice de Massa Corporal. Seguindo a seguinte f�rmula. 
IMC = massa / (altura * altura ) Mostre o resultado em uma mensagem.

*/

import javax.swing.JOptionPane;

public class Exercicio9 {
	
	public static void main(String[] args) {
		
		int massa;
		double altura;
		double imc;
		
		massa = Integer.parseInt(JOptionPane.showInputDialog("Informe o seu peso (Kg): "));
		
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a sua altura (Metros):"));
		
		imc = massa / (altura * altura);
		
		JOptionPane.showMessageDialog(null, "O seu IMC �: " + imc);
	
	}

}

