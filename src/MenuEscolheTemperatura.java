import javax.swing.JOptionPane;
/**
 * 
 * @author IVONE
 * Menu com as opções de conversão de valores
 */

public class MenuEscolheTemperatura {


	private final String opcaoSelecionada;
	
	public MenuEscolheTemperatura() {
		String[] opcoes = {
				"De Celsius para Fahrenheit",
				"De Fahrenheit para Celsius",
				"De Celsius para Kelvin",
				"De Kelvin para Celsius"
		};
		
        opcaoSelecionada = (String)JOptionPane.showInputDialog(null, "Escolha a temperatura para a qual deseja converter:",
                "Temperaturas", JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
		
	}

	public String getOpcaoSelecionada() {
		return opcaoSelecionada;
	}

}
