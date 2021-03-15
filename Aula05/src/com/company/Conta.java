package com.company;

public class Conta {

    //Atributos - da classe Conta

    private Cliente cliente;
    private int numero; // Se atribuir algum valor, este será o valor padrao
    private double saldo;

    //Construtor da classe

    public Conta(String cliente, int numero, double saldo) {
        this.cliente = new Cliente(cliente);
        this.numero = numero;
        this.saldo = saldo;
    }


    //GET - leitura do valor do atributo, SET - modificar o valor dos atributos

    public double getSaldo(){
        return this.saldo;
    }

    //-------------------------------------------------------------------------
    // Métodos

    public boolean sacar(double valor){ //Verdadeiro - saque bem sucedido
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public boolean transferirDinheiro(Conta destino, double valor){
        if (this.sacar(valor)){
            destino.depositar(valor);
            return true;
        }
        return false;
    }

}
