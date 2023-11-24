package atividadeextra1exercicio12somadevetores;
import javax.swing.JOptionPane;

public class AtividadeExtra1Exercicio12SomaDeVetores {

    public static void main(String[] args) {
        
        int size = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o tamanho dos vetores:"));

        int[] vetor1 = new int[size];
        int[] vetor2 = new int[size];
        int[] soma = new int[size];
        
        
        for (int i = 0; i < size; i++) {
            
            vetor1[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite os elementos do primeiro vetor:"));
        }
        
        for (int i = 0; i < size; i++) {
            
            vetor2[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite os elementos do segundo vetor:"));
        }
        
        String resposta = "A soma dos vetores é: [";
        
        for (int i = 0; i < size; i ++) {
            soma[i] = vetor1[i] + vetor2[i];
            resposta += soma[i];
            if(i < size - 1) {
                resposta += ", ";
            }
        }
        resposta += "]";
        
        JOptionPane.showMessageDialog(null, resposta); 
    }
}

