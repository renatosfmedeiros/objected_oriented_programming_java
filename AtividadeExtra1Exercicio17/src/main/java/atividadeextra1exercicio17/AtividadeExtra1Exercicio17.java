package atividadeextra1exercicio17;

import javax.swing.JOptionPane;

public class AtividadeExtra1Exercicio17 {

    public static void main(String[] args) {
        
        int line = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de linhas:"));
        int column = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de colunas:"));
        
        int[][] matrix = new int[line][column];
        
        
        for (int i = 0; i < line; i ++){
            for (int j = 0; j< column; j++) {
                
                matrix[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite os elementos da matriz:"));
                
            }
        }
        

        
        StringBuilder result = new StringBuilder("A matriz transposta é:\n"); 
        
        for (int i = 0; i < column; i ++) {
            for (int j = 0; j < line; j++) {
                result.append(matrix[j][i]).append(" ");
            }
            result.append("\n");
        }
        JOptionPane.showMessageDialog(null, result.toString());
    }
}
