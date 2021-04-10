import javax.swing.JOptionPane;

public class Trabalho2 {

	public static void main(String[] args){

		String nome;
		int tempo_empresa;
		int numero_dependentes;
		double salario_atual;
		
		
		// 1) Solicitar dados do Empregado.
		
		nome = JOptionPane.showInputDialog("Digite o nome do empregado: ");
		tempo_empresa = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo de empresa do empregado: "));
		numero_dependentes = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero de dependentes do empregado: "));
		salario_atual = Double.parseDouble(JOptionPane.showInputDialog("Informe o sal�rio atual do empregado: "));

		
		// 2) Mostrar um MENU com as seguintes op��es.
		
		int menu;
		
		menu = Integer.parseInt(JOptionPane.showInputDialog(
		"MENU \n "
		+ "\n"
		+ "3) Mostrar todos os dados do Empregado. \n"
		+ "4) Mostrar o valor do Aumento. \n"
		+ "5) Mostrar o valor do Imposto que ser� retido na folha de pagamento. \n"
		+ "6) Mostrar o valor do Sal�rio Final. \n"
		+ "7) Apresentar um resumo de c�lculos do Empregado."));
		

		// 4) Mostrar o valor do Aumento.
		
		double valor_aumento = 0;
	
		if((tempo_empresa > 3) && (tempo_empresa <= 5)){
			valor_aumento = (salario_atual * 10) / 100;
		}else{
			if((tempo_empresa > 5) && (tempo_empresa <= 7)){
				valor_aumento = (salario_atual * 15) / 100;
			}else{
				if(tempo_empresa > 7){
					valor_aumento = (salario_atual * 20) / 100;
				}else{
					valor_aumento = 0;
				}
			}
		}


		// 5) Mostrar o valor do Imposto que ser� retido na folha de pagamento.
		
		double valor_imposto = 0;
		
		if(numero_dependentes == 0){
			valor_imposto = (salario_atual * 20) / 100;
		}else{
			if(numero_dependentes == 1){
				valor_imposto = (salario_atual * 18) / 100;
			}else{
				if(numero_dependentes == 2){
					valor_imposto = (salario_atual * 16) / 100;
				}else{
					if(numero_dependentes > 2){
						valor_imposto = (salario_atual * 15) / 100;
					}else{
						valor_imposto = 0;
					}
				}
			}
		}

		
		// 6) Mostrar o valor do Sal�rio Final.
		
		double salario_final = salario_atual + valor_aumento - valor_imposto;
		
		
		switch(menu){

			// 3) Mostrar todos os dados do Empregado.
			case 3 :
				JOptionPane.showMessageDialog(null,
				"DADOS DO EMPREGADO \n"
				+ "Nome: "+ nome +" \n"
				+ "Tempo de Empresa: "+ tempo_empresa +" \n"
				+ "N�mero de Dependentes: "+ numero_dependentes +" \n"
				+ "Sal�rio Atual: "+ salario_atual);						
			break;
			
			// 4) Mostrar o valor do Aumento.
			case 4 :
				JOptionPane.showMessageDialog(null,"O valor do aumento �: " + valor_aumento);
			break;

			// 5) Mostrar o valor do Imposto que ser� retido na folha de pagamento.
			case 5 :
				JOptionPane.showMessageDialog(null,"O valor do imposto a ser retido �: " + valor_imposto);
			break;
			
			// 6) Mostrar o valor do Sal�rio Final.
			case 6 :
				JOptionPane.showMessageDialog(null,"O valor do sal�rio final �: " + salario_final);
			break;
			
			// 7) Apresentar um resumo de c�lculos do Empregado.
			case 7 :
				JOptionPane.showMessageDialog(null," \n"
				+ "Nome: "+ nome +" \n"
				+ "Tempo de Empresa: "+ tempo_empresa +" \n"
				+ "N�mero de Dependentes: "+ numero_dependentes +" \n"
				+ "Sal�rio: "+ salario_atual +" \n"
				+ "Aumento: "+ valor_aumento +" \n"
				+ "Imposto: "+ valor_imposto +" \n"
				+ "Sal�rio Final: "+ salario_final);
			break;

			default:
				JOptionPane.showMessageDialog(null, "Op��o inv�lida!");
			break;
		
		}

	}

}
