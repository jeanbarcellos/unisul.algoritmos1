import javax.swing.JOptionPane;

public class Slide07_ExemploSwitch2 {
	
	public static void main(String[] args) {
		
		String controle;
		
		controle = JOptionPane.showInputDialog("Voc� concorda com os termos apresentados ? (s/n)");
		
		char controleCHAR = controle.charAt(0);
		
		switch(controleCHAR){
			case 's':
				JOptionPane.showMessageDialog(null,"SIM, voc� concorda ! ");
			break;
			
			case 'n':
				JOptionPane.showMessageDialog(null,"N�O, voc� n�o concorda ! ");
			break;
			
			default:
				JOptionPane.showMessageDialog(null,"Op��o inv�lida! ");
			break;
		}

	}

}

