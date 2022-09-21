import javax.swing.JOptionPane;
/**
 * 
 * @author IVONE
 * Menu com as opções de conversão de valores
 */

public class MenuEscolheMoedas {

	
	private final String opcaoSelecionada;
	
	public MenuEscolheMoedas() {
		String[] opcoes = {
				"De Reais a Dólares",
				"De Reais a Euros",
				"De Reais a Libras Esterlinas",
				"De Reais a Peso Argentino",
				"De Reais a Peso Chileno",
				"De Dólares a Reais",
				"De Euros a Reais",
				"De Libras Esterlinas a Reias",
				"De Peso Argentino a Reais",
				"De Peso Chileno a Reais"
		};
        opcaoSelecionada = (String)JOptionPane.showInputDialog(null, "Escolha a moeda para a qual deseja girar seu dinheiro:",
                "Moedas", JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
	}
	
	public String getOpcaoSelecionada() {
		return this.opcaoSelecionada;
	}


}
