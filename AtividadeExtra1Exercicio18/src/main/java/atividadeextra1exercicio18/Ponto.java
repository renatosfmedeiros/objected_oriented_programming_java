package atividadeextra1exercicio18;

public class Ponto {
    
    protected int x;
    
    protected int y; 

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    

    Ponto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
