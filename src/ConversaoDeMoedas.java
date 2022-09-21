import javax.swing.JOptionPane;

/**
 * 
 * @author IVONE
 * Faz a conversão do valor digitado para o valor convertido conforme a opção escolhida
 * através do MenuEscolheMoedas.
 * 
 * Obs. Os valores utilizados nos calculos são valores fixos.
 */

public class ConversaoDeMoedas {
	String simboloConversao;
	double valorConvertido;

	public ConversaoDeMoedas(double valor, String op) {
		
		converter(valor, op );

        String msg = String.format("O valor convertido foi %s %.2f", simboloConversao, valorConvertido);

        JOptionPane.showMessageDialog(null, msg);

	}

	public void converter(double valor, String op) {

    	switch (op) {
			case "De Reais a Dólares" -> {
				simboloConversao = "U$";
				valorConvertido = valor / 5.20;
			}
			case "De Reais a Euros" -> {
				simboloConversao = "€";
				valorConvertido = valor / 5.21;
			}
            case "De Reais a Libras Esterlinas" -> {
                simboloConversao = "£";
                valorConvertido = valor / 6.14;
            }
            case "De Reais a Peso Argentino" -> {
                simboloConversao = "$";
                valorConvertido = valor / 0.038;
            }
            case "De Reais a Peso Chileno" -> {
                simboloConversao = "CLP";
                valorConvertido = valor / 0.0055;
            }
            case "De Dólares a Reais" -> {
                simboloConversao = "R$";
                valorConvertido = valor * 5.20;
            }
            case "De Euros a Reais" -> {
                simboloConversao = "R$";
                valorConvertido = valor * 5.21;
            }
            case "De Libras Esterlinas a Reais" -> {
                simboloConversao = "R$";
                valorConvertido = valor * 6.14;
            }
            case "De Peso Argentino a Reais" -> {
                simboloConversao = "R$";
                valorConvertido = valor * 0.038;
            }
            case "De Peso Chileno a Reais" -> {
                simboloConversao = "R$";
                valorConvertido = valor * 0.0055;
            }
		}
 
	}

}
