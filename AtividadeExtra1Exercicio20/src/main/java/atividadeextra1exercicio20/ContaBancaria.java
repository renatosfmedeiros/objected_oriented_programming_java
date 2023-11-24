package atividadeextra1exercicio20;

public class ContaBancaria {
    
    private float saldo;

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public void abrirConta() {
        this.setSaldo(0);  
        System.out.println("Conta aberta com sucesso!");
        System.out.println("Saldo: " + this.getSaldo());
    }
    
    public void depositar(float v) {
        this.setSaldo(this.getSaldo() + v);
        System.out.println("Depósito realizado com sucesso!");
        System.out.println("Novo saldo: " + this.getSaldo());
    }
    
    public void sacar(float v) {
        this.setSaldo(this.getSaldo() - v);
        System.out.println("Saque realizado com sucesso!");
        System.out.println("Novo saldo: " + this.getSaldo());
        
    }
    
    public void saldoAtual() {
        System.out.println("Saldo atual: " + this.getSaldo());
    }
}
