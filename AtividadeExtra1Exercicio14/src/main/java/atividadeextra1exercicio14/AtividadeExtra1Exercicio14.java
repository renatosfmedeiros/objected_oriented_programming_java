package atividadeextra1exercicio14;

import javax.swing.JOptionPane;

public class AtividadeExtra1Exercicio14 {

    public static void main(String[] args) {
        
        String palavra = JOptionPane.showInputDialog("Digite uma palavra:");
        
        char[] caracteres = palavra.toCharArray();
        
        boolean Palindromo = true;
        
        for (int i = 0; i < caracteres.length/2; i ++){
            if (caracteres[i] != caracteres[caracteres.length -1 - i]) {
                Palindromo = false;
                break;
            }
        }
        
        if (Palindromo) {
            JOptionPane.showMessageDialog(null, "A palavra " + palavra + " é um palíndromo.");
            
        } 
    }
}
