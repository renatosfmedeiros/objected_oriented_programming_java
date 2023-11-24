package atividadeextra1exercicio19;

public class AtividadeExtra1Exercicio19 {

    public static void main(String[] args) {
        
        Aluno a1 = new Aluno("Renato", 100);
        
        Aluno a2 = a1.copia();
        
        a2.nome = "Medeiros";
        a2.nota = 200;
        
        System.out.println("Aluno original\n"+ 
                            "Nome: " + a1.nome +
                           "\nNota: " + a1.nota);
                System.out.println("Aluno copiado\n"+ 
                            "Nome: " + a2.nome +
                           "\nNota: " + a2.nota);
    }
}