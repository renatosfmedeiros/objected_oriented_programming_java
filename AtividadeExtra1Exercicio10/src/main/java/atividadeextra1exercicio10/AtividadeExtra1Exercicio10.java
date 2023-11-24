package atividadeextra1exercicio10;
import javax.swing.JOptionPane;

public class AtividadeExtra1Exercicio10 {

    public static void main(String[] args) {
        
        int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inicial:"));
        
        while (number >= 1) {
            JOptionPane.showMessageDialog(null, number);
            number--;
        }
    }
}




