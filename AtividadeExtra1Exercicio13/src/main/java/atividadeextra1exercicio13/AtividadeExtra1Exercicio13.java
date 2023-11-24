package atividadeextra1exercicio13;

import javax.swing.JOptionPane;

public class AtividadeExtra1Exercicio13 {

    public static void main(String[] args) {
        
        int size = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o tamanho dos vetores:"));
        
        double[] vetor1 = new double[size];
        double[] vetor2 = new double[size];
        double produtoEscalar = 0;
        
        for (int i = 0; i < size; i ++) {
            vetor1[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite os elementos do primeiro vetor:"));
        }
        
        for (int i = 0; i < size; i ++) {
            vetor2[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite os elementos do segundo vetor:"));
        }
        
        for (int i = 0; i < size; i ++) {
            produtoEscalar += vetor1[i] * vetor2[i];
        }
        
        JOptionPane.showMessageDialog(null, "O produto escalar dos vetores é: " + produtoEscalar);
    }
}
