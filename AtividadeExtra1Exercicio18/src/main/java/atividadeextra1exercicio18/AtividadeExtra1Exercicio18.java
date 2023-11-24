package atividadeextra1exercicio18;

public class AtividadeExtra1Exercicio18 {

    public static void main(String[] args) {
        
        Ponto p1 = new Ponto(25, 100);
        
        System.out.println("Valor original: " + p1.getX() + ", " + p1.getY());
        
        int[] numeros = {p1.getX(), p1.getY()};
        
        swap(numeros);
        
        p1.setX(numeros[0]);
        p1.setY(numeros[1]);
        
        System.out.println("Valores trocados: " + p1.getX() + ", " + p1.getY());
    }
    
    public static void swap(int[] numeros) {
        int temp = numeros[0];
        numeros[0] = numeros[1];
        numeros[1] = temp;
    }
}
