import javax.swing.JOptionPane;

public class Slide07_ExemploSwitch {
	
	public static void main(String[] args) {
		
		int controle, resultado;
		int numero1 = 10;
		int numero2 = 5;
		
		controle = Integer.parseInt(JOptionPane.showInputDialog("Qual opera��o voc� quer executar ?"+ " \n 1 - adi��o \n 2 - subtra��o"));
		
		switch(controle){
			case 1:
				resultado = numero1 + numero2;
				JOptionPane.showMessageDialog(null,"O resultado �: " + resultado);
			break;

			case 2:
				resultado = numero1 - numero2;
				JOptionPane.showMessageDialog(null,"O resultado �: " + resultado);
			break;

			default:
				JOptionPane.showMessageDialog(null,"Op��o inv�lida! ");
			break;		
		}

	}

}

