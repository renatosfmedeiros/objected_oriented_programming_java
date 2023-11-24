package com.mycompany.atividade1calculadoragorjeta;

import javax.swing.JOptionPane;

public class Atividade1CalculadoraGorjeta {

    public static void main(String[] args) {
        
        String valorContaString = JOptionPane.showInputDialog("Digite o valor total da conta:");
        
        double valorConta = Double.parseDouble(valorContaString);
        
        String porcentagemGorgetaString = JOptionPane.showInputDialog("Digite a porcentagem de gorjeta que deseja deixar (por exemplo, 15 para 15%): 15");
        
        double porcentagemGorgeta = Double.parseDouble(porcentagemGorgetaString);
        
        double valorDaGorgeta = valorConta * porcentagemGorgeta * 0.01;
        
        double pagamentoTotal = valorConta + valorDaGorgeta;
        
        String msg = String.format("Valor da gorjeta: $%.2f\nTotal a ser pago: $%.2f", valorDaGorgeta,pagamentoTotal);
        
        JOptionPane.showMessageDialog(null,msg);

        
    }
}

