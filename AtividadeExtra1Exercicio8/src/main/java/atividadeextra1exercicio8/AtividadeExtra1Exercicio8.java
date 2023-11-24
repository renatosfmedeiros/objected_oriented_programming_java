package atividadeextra1exercicio8;

import javax.swing.JOptionPane;

public class AtividadeExtra1Exercicio8 {

    public static void main(String[] args) {
        
        int number1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro número:"));
        int number2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o segundo número:"));
        
        int option = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha a operação:\n" +
                                                                                    "1. Adição\n" +
                                                                                    "2. Subtração\n" +
                                                                                    "3. Multiplicação\n" +
                                                                                    "4. Divisão\n" +
                                                                                    "Opção:"));
        int result = 0;
        
        switch (option) {
            case 1:
                result = number1 + number2;
                break;
            case 2:
                result = number1 - number2;
                break;
            case 3:
                result = number1 * number2;
                break;
            case 4:
                result = number1 / number2;
                break;
        }
        
        JOptionPane.showMessageDialog(null, "Resultado: " + result);

    }
}


