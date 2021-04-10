import javax.swing.JOptionPane;

public class Slide04_Exemplo3 {

	public static void main(String[] args) {

		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
		
		JOptionPane.showMessageDialog(null, numero);

	}

}