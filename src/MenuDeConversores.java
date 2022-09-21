import javax.swing.JOptionPane;

/**
 * 
 * @author IVONE
 * Menu para escolha do qual conversor será usado
 *
 */
public class MenuDeConversores {

	private String opcaoSelecionada;
	
	public MenuDeConversores() {
		String[] opcoes = {
				"Conversor de moedas",
				"Conversor de Temperatura"
		};
        opcaoSelecionada = (String)JOptionPane.showInputDialog(null, "Selecione o conversor:",
                "Conversor", JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
	}
	
	public String getOpcaoSelecionada() {
		return this.opcaoSelecionada;
	}

}
