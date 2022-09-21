import java.util.Objects;

import javax.swing.JOptionPane;

/**
 * 
 * @author IVONE
 * Conversor de Moedas ou de temperaturas.
 * Projeto desenvolvido para o Sprint 1 da formação Java do programa Oracle One.
 */

public class MenuPrincipal {

	public static void main(String[] args) {
		
		String op = "";
		
		do {
			try {
				MenuDeConversores menuDeConversores = new MenuDeConversores();
				System.out.println(menuDeConversores.getOpcaoSelecionada());

				if (Objects.equals(menuDeConversores.getOpcaoSelecionada(), "Conversor de moedas")) {
					MenuEscolheMoedas menuEscolheMoedas = new MenuEscolheMoedas();
					op = menuEscolheMoedas.getOpcaoSelecionada();

				} else {
					MenuEscolheTemperatura menuEscolheTemperatura = new MenuEscolheTemperatura();
					op = menuEscolheTemperatura.getOpcaoSelecionada();
					
				}

				DigiteUmValor digiteUmValor = new DigiteUmValor();
				double valorSelecionado = digiteUmValor.getValor();
				
				if (Objects.equals(menuDeConversores.getOpcaoSelecionada(), "Conversor de moedas")) {
					ConversaoDeMoedas conversaoDeMoedas = new ConversaoDeMoedas(valorSelecionado, op);

				} else {
					ConversaoDeTemperaturas conversaoDeTemperaturas = new ConversaoDeTemperaturas(valorSelecionado, op);
					
				} 
            } catch (NumberFormatException exception) {
                System.out.println(exception.getMessage());
                new InformaErro("Valor informado é inválido!");
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
                new InformaErro("Ocorreu um problema...");
            }
		
		} while (JOptionPane.showConfirmDialog(null, "Deseja Continuar?") != 1);

        JOptionPane.showMessageDialog(null, "Programa finalizado!");

        System.exit(0);
				
			
		}

}
