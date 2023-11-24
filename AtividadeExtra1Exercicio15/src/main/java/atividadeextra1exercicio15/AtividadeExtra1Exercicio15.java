package atividadeextra1exercicio15;

import javax.swing.JOptionPane;

public class AtividadeExtra1Exercicio15 {

    public static void main(String[] args) {
        
        int line = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de linhas:"));
        int column = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de colunas:"));
        
        
        int[][] matriz1 = new int[line][column];
        int[][] matriz2 = new int[line][column];
        int[][] sum = new int[line][column];
        
        for (int i = 0; i < line; i++){
            for (int j = 0; j < column; j++){
                matriz1[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o elementos da primeira matriz:"));
            }
        }
        
        for (int i = 0; i < line; i++){
            for (int j = 0; j < column; j++){
                matriz2[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o elementos da segunda matriz:"));
            }
        }
        for (int i = 0; i < line; i++){
            for (int j = 0; j < column; j++){
                sum[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        
        StringBuilder result = new StringBuilder("A soma das matrizes é:\n");
        
        for (int i = 0; i < line; i ++){
            for (int j = 0; j < column; j ++) {
                result.append(sum[i][j]).append(" ");
            }
            result.append("\n");
        }
        JOptionPane.showMessageDialog(null, result.toString());
    }
}
