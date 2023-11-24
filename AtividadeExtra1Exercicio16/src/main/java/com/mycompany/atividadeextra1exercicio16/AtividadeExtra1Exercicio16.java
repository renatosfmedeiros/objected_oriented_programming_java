package com.mycompany.atividadeextra1exercicio16;

import javax.swing.JOptionPane;


public class AtividadeExtra1Exercicio16 {

    public static void main(String[] args) {
        
        int line_m1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de linhas da primeira matriz:"));
        int column_m1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de colunas da primeira matriz:"));
        
        int [][] matrix_m1 = new int[line_m1][column_m1];
        
        for (int i = 0; i< line_m1; i++) {
            for (int j = 0; j < column_m1; j++) {
                matrix_m1[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite os elementos da primeira matriz:"));
            }
        }
        
        int line_m2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de linhas da segunda matriz:"));
        int column_m2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de colunas da segunda matriz:"));
        
        int [][] matrix_m2 = new int[line_m2][column_m2];
        
        for (int i = 0; i< line_m2; i++) {
            for (int j = 0; j < column_m2; j++) {
                matrix_m2[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite os elementos da segunda matriz:"));
                
            }
        }
        
        int [][] matrix_m1xm2 = new int[line_m1][column_m2];
        
        for (int i = 0; i< line_m1; i++) {
            for (int j = 0; j < column_m2; j++) {
                for (int k = 0; k < column_m1; k++) {
                    matrix_m1xm2[i][j] += matrix_m1[i][k] * matrix_m2[k][j];
                }

            }
        }
        
        StringBuilder result = new StringBuilder("A multiplicação das matrizes é:\n"); 
        
        for (int i = 0; i< line_m1; i++) {
            for (int j = 0; j < column_m2; j++) {
                result.append(matrix_m1xm2[i][j]).append(" ");
            }
            result.append("\n");
        }
        JOptionPane.showMessageDialog(null, result.toString());
    }
}

