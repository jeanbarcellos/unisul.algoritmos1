import javax.swing.JOptionPane;

public class Slide06_ExemploIfEnc {

	public static void main(String[] args) {
			
		int numero;
		numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um n�mero: "));
		
		if((numero % 10) == 0){
			JOptionPane.showMessageDialog(null,"� m�ltiplo de 10 !");
		}else{
			if((numero % 2) == 0){
				JOptionPane.showMessageDialog(null,"� m�ltiplo de 2 !");
			}else{
				if((numero % 5) == 0){
					JOptionPane.showMessageDialog(null,"� m�ltiplo de 5 !");
				}else{
					JOptionPane.showMessageDialog(null,"N�o � m�ltiplo destes! ");
				}
			}
		}

	}

}