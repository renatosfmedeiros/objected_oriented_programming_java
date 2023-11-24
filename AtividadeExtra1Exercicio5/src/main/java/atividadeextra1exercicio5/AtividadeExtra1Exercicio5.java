package atividadeextra1exercicio5;

import javax.swing.JOptionPane;

public class AtividadeExtra1Exercicio5 {

    public static void main(String[] args) {
        String idadeString = JOptionPane.showInputDialog("Digite sua idade:");
        
        int idade = Integer.parseInt(idadeString);
        int idadeEmMeses = idade * 12;
        int idadeEmDias = idadeEmMeses * 30;
        int idadeEmHoras = idadeEmDias * 24;
        int idadeEmMinutos = idadeEmHoras * 60;
        
              
        JOptionPane.showMessageDialog(null,"Sua idade em anos é: " + idade + " anos");
        JOptionPane.showMessageDialog(null,"Sua idade em meses é: " + idadeEmMeses + " meses");
        JOptionPane.showMessageDialog(null,"Sua idade em dias é: " + idadeEmDias + " dias");
        JOptionPane.showMessageDialog(null,"Sua idade em horas é: " + idadeEmHoras + " horas");
        JOptionPane.showMessageDialog(null,"Sua idade em minutos é: " + idadeEmMinutos + " minutos");
        
    }
}
