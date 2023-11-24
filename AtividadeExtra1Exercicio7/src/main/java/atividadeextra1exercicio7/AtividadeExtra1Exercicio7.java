package atividadeextra1exercicio7;

import javax.swing.JOptionPane;

public class AtividadeExtra1Exercicio7 {

    public static void main(String[] args) {
        
        int number = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número: "));
        
        if (number %2 == 0){
            JOptionPane.showMessageDialog(null,"O número " + number + " é par.");
        }
        else {
            JOptionPane.showMessageDialog(null,"O número " + number + " é ímpar.7");
        }
    }
}




