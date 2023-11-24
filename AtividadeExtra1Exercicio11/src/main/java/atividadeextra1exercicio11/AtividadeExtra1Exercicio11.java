package atividadeextra1exercicio11;

import javax.swing.JOptionPane;
import java.util.Random;

public class AtividadeExtra1Exercicio11 {

    public static void main(String[] args) {
        
        Random rand = new Random();
        
        int numeroAleatorio = rand.nextInt(10) + 1;
        
        int count = 1;

        
        int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Adivinhe o número entre 1 e 10.\n" +
                                                                                      "Tentativa " + count + ":"));
        count++;

        do {
            
            if (number < numeroAleatorio) {
                
                number = Integer.parseInt(JOptionPane.showInputDialog(null, "Tente novamente. O número é maior.\n" +
                                "Tentativa " + count + ":"));
            }
            
            if (number > numeroAleatorio) {
                
                number = Integer.parseInt(JOptionPane.showInputDialog(null, "Tente novamente. O número é menor.\n" +
                                "Tentativa " + count + ":"));
            }
            
            if (number == numeroAleatorio) {
                
                JOptionPane.showMessageDialog(null, "Parabéns! Você acertou o número " + number + " em " + count + " tentativas.");
                
            }
            
            count++;

        } while (number != numeroAleatorio);

    }
}

