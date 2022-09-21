import javax.swing.JOptionPane;

/**
 * 
 * @author IVONE
 * Digitar um valor e aceitar só numeros
 */

public class DigiteUmValor {

	private final String valor;
	
	public DigiteUmValor() {
		valor = JOptionPane.showInputDialog(null, "Insira um valor: ", "", JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	public double getValor() throws NumberFormatException {
		return Double.parseDouble(this.valor);
	}

}
