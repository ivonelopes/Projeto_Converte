import javax.swing.JOptionPane;

/**
 * 
 * @author IVONE
 * Faz a conversão do valor digitado para o valor convertido conforme a opção escolhida
 * através do MenuEscolheTemperaturas 
 * 
 * Obs: O valos para calcular a conversão é fixo. 
 */

public class ConversaoDeTemperaturas {

	String simboloConversao;
	double valorConvertido;

	
    public ConversaoDeTemperaturas(double valor, String op) {
        converter(valor, op);
        String msg = String.format("O valor convertido foi %.2f %s", valorConvertido, simboloConversao);
        JOptionPane.showMessageDialog(null, msg);
    }

    public void converter(double valor, String op) {
        switch (op) {
            case "De Celsius para Fahrenheit" -> {
                simboloConversao = "°F";
                valorConvertido = (valor * (9.0 / 5.0)) + 32;
            }
            case "De Fahrenheit para Celsius" -> {
                simboloConversao = "°C";
                valorConvertido = (valor - 32) * (5.0 / 9.0);
            }
            case "De Celsius para Kelvin" -> {
                simboloConversao = "K";
                valorConvertido = valor + 273.15;
            }
            case "De Kelvin para Celsius" -> {
                simboloConversao = "°C";
                valorConvertido = valor - 273.15;
            }
        }
    }


}
