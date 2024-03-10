package model;

public class ContaCorrente extends Conta{
    public ContaCorrente(Cliente cliente) {
        super(cliente);
        this.limite = 100;
    }

    private double limite;
    
    public double getLimite() {
        return limite;
    }
    
    public void atualizarLimite(double novoValor){
        this.limite = novoValor;
    }
    
    @Override
    public double getSaldo(){
        return saldo + getLimite();
    }

    @Override
    public String toString() {
        return super.toString() + "\nLimite: R$ " + String.format("%.2f", getLimite());
    }
}
