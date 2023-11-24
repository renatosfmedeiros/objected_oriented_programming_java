package AtividadeExtra1Exercicio2;

import javax.swing.JOptionPane;

public class AtividadeExtra1Exercicio2 {

    public static void main(String[] args) {
        
        String[] opcoes = {"1. Celsius para Fahrenheit", "2. Fahrenheit para Celsius"};
        
        int resposta = JOptionPane.showOptionDialog(null,"Escolha o tipo de conversão:", "Conversao de Temperatura",
                JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,opcoes, opcoes[0]);
        
        if (resposta == 0) {
            String input = JOptionPane.showInputDialog("Digite a temperatura em graus Celsius:");
            double celsius = Double.parseDouble(input);
            double fahrenheit = celsius * 9/5 + 32;
            JOptionPane.showMessageDialog(null,"Resultado em graus Fahrenheit: " + fahrenheit);
        } else if (resposta == 1) {
            String input = JOptionPane.showInputDialog("Digite a temperatura em graus Fahrenheit:");
            double fahrenheit = Double.parseDouble(input);
            double celsius = (fahrenheit - 32) * 5/9;
            JOptionPane.showMessageDialog(null, "Resultado em graus Celsius: " + celsius);
        } else {
            JOptionPane.showMessageDialog(null, "Opção inválida");
        }
    }
}
        
    