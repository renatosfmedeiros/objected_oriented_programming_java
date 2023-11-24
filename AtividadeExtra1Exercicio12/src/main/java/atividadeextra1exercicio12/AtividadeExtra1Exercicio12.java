package atividadeextra1exercicio12;

import javax.swing.JOptionPane;

public class AtividadeExtra1Exercicio12 {

    public static void main(String[] args) {
        
        int number = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número para a tabela de multiplicação:"));
        
        for (int i=1; i<=10; i++){
            
            JOptionPane.showMessageDialog(null, "Tabela de multiplicação para "+ number +":\n"
                                                                                           + i + " X " + number + " = " + i*number); 
        }
    }
}






