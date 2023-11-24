package atividadeextra1exercicio6;

import javax.swing.JOptionPane;


public class AtividadeExtra1Exercicio6 {

    public static void main(String[] args) {
        
        double peso = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite seu peso em kg: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite sua altura em metros: "));
        
        double IMC = peso / (altura * altura);
        
        if (IMC < 18.5) {
            JOptionPane.showMessageDialog(null, "Baixo peso");
            
        } else if (18.5 <= IMC && IMC < 24.9) {
            JOptionPane.showMessageDialog(null, "Intervalo normal");
                       
        } else if (25 <= IMC && IMC < 29.9) {
            JOptionPane.showMessageDialog(null, "Sobrepeso");          
        
        } else if (30 <= IMC && IMC < 34.9) {
            JOptionPane.showMessageDialog(null, "Obesidade classe I");          
        } else if (35 <= IMC && IMC < 39.9) {
            JOptionPane.showMessageDialog(null, "Obesidade classe II");          
        } else if (40 < IMC) {
            JOptionPane.showMessageDialog(null, "Obesidade classe III");          
        }
    }
}

