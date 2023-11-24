package atividadeextra1exercicio3;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;


public class AtividadeExtra1Exercicio3 {

    public static void main(String[] args) {
        List<String> tasks = new ArrayList<>();
        
        while (true) {
            
            String comando = JOptionPane.showInputDialog("Comandos disponíveis:\n"
                                                         + "- \"adicionar\" para adicionar uma nova tarefa\n"
                                                         + "- \"listar\" para listar as tarefas\n"
                                                         + " \"concluir\" para marcar uma tarefa como concluída\n"
                                                         + "- \"sair\" para sair do programa");

            if (comando.equals("adicionar")) {
                String tarefa = JOptionPane.showInputDialog("Digite a descrição da tarefa:");
                tasks.add(tarefa);
                JOptionPane.showMessageDialog(null,"Tarefa adicionada com sucesso!");
                       
             } else if (comando.equals("listar")) {
                 if (tasks.isEmpty()) {
                     JOptionPane.showMessageDialog(null, "Tarefas pendentes:\n" +
                                                                     "(Nenhuma tarefa pendente)");
                 } else {
                     StringBuilder sb = new StringBuilder("Tarefas pendentes:\n");
                     for (int i = 0; i < tasks.size();i++) {
                         sb.append((i + 1) + ". " + tasks.get(i) + "\n");
                     }
                     JOptionPane.showMessageDialog(null, sb.toString());
                     
                 }
                 
                 
             } else if (comando.equals("concluir")) {
                 String numeroTarefa = JOptionPane.showInputDialog("Digite o número da tarefa a ser concluída:");
                 int indice = Integer.parseInt(numeroTarefa) - 1;
                 if (indice >=0 && indice < tasks.size()) {
                     String tarefa = tasks.remove(indice);
                     JOptionPane.showMessageDialog(null, "Tarefa \"" + tarefa + "\" marcada como concluída.");
                 } else {
                     JOptionPane.showMessageDialog(null, "Número de tarefa inválido.");
                 }
                 
             } else if (comando.equals("sair")) {
                 break;
             } else {
                 JOptionPane.showMessageDialog(null, "Comando inválido.");
             }
        }
    }
}

                      
            
            
   