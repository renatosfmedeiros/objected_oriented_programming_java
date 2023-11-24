package atividadeextra1exercicio19;

public class Aluno {
    public String nome;
    public int nota;
    
    public Aluno(String nome, int nota) {
        this.nome = nome;
        this.nota = nota;
    }
    
    public Aluno copia () {
        return new Aluno(this.nome, this.nota);
    }
}

