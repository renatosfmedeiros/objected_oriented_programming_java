package atividadeextra1xercicio4;

import javax.swing.JOptionPane;

public class AtividadeExtra1xercicio4 {

    public static void main(String[] args) {
        
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da prova 1:"));
        double peso1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da prova 1:"));
        
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da prova 2:"));
        double peso2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da prova 2:"));
        
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da prova 3:"));
        double peso3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da prova 3:"));
        
        double mediaPonderada = (nota1*peso1 + nota2*peso2 + nota3*peso3) / (peso1+peso2+peso3);
        
        JOptionPane.showMessageDialog(null,"A sua média ponderada final é: " + mediaPonderada);
        
    }
}


