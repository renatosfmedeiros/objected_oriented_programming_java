package atividadeextra1exercicio9;

import javax.swing.JOptionPane;


public class AtividadeExtra1Exercicio9 {

    public static void main(String[] args) {
        
        double nota1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a nota 1:"));
        double peso1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o peso da nota 1:"));
        
        double nota2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a nota 2:"));
        double peso2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o peso da nota 2:"));
        
        double nota3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a nota 3:"));
        double peso3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o peso da nota 3:"));
        
        double mediaPonderada = (nota1*peso1 + nota2*peso2 + nota3*peso3) / (peso1 + peso2 + peso3);
        
        if (90 <= mediaPonderada && mediaPonderada <= 100) {
            JOptionPane.showMessageDialog(null, "A média ponderada é "+ mediaPonderada +", que corresponde à classificação A.");
        } else if (80 <= mediaPonderada && mediaPonderada <= 89) {
            JOptionPane.showMessageDialog(null, "A média ponderada é "+ mediaPonderada +", que corresponde à classificação B.");
        } else if (70 <= mediaPonderada && mediaPonderada <= 79) {
            JOptionPane.showMessageDialog(null, "A média ponderada é "+ mediaPonderada +", que corresponde à classificação C.");
        } else if (60 <= mediaPonderada && mediaPonderada <= 69) {
            JOptionPane.showMessageDialog(null, "A média ponderada é "+ mediaPonderada +", que corresponde à classificação D.");
        } else if (60 > mediaPonderada) {
            JOptionPane.showMessageDialog(null, "A média ponderada é "+ mediaPonderada +", que corresponde à classificação F.");
        }
        
    }
}

