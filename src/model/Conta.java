package model;

import java.text.DecimalFormat;

public abstract class Conta {
    private static int numeroConta = 1000;

    public Conta(Cliente cliente) {
        this.titular = cliente;
        this.ativo = true;
    }
    
    private int agencia = 0001;
    private int numero = numeroConta++;
    protected double saldo = 0;
    private Cliente titular;
    private boolean ativo;
    
    public int getAgencia() {
        return agencia;
    }
    
    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static int getNumeroConta() {
        return numeroConta;
    }

    public Cliente getTitular() {
        return titular;
    }

    public boolean isAtivo() {
        return ativo;
    }

    @Override
    public String toString() {
        return titular.toString() + "\nAgencia: " + String.format("%04d", agencia) +
            "\nNúmero: " + numero + "\nSaldo: R$ " + String.format("%.2f", saldo);
    }

    public void depositar(double valor){
        this.saldo += valor;
    }
    
    public void sacar(double valor){
        if(getSaldo() >= valor){
            this.saldo -= valor;
            System.out.println("Saque realizado!");
        }
        else
            System.out.println("Saldo insuficiente!");
    }

    public void transferir(double valor, Conta conta){
        if(getSaldo() > valor){
            this.saldo -= valor;
            conta.depositar(valor);
        }
        else
            System.out.println("Saldo insuficiente!");
    }

    public void desativar(){
        ativo = false;
    }

}
