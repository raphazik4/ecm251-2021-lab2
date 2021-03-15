package com.company;

// O nome da classe vai sempre ser o nome do arquivo

public class Conta { // Obs: Nomes de classe em java sempre iniciam com nome maiúsculo

    //Atributos - da classe Conta

    private Cliente cliente;
    private int numero; // Se atribuir algum valor, este será o valor padrao
    private double saldo;

    //Métodos

    //Construtor da classe
    public Conta( String nomeCliente, double saldoInicial ){ //Primeiro construtor - substitui o construtor padrão
        this.saldo = saldoInicial;
        this.cliente = new Cliente(nomeCliente);
        this.numero = 1234;
    }

    //GET - leitura do valor do atributo, SET - modificar o valor dos atributos

    public double getSaldo(){
        return this.saldo;
    }

    //-------------------------------------------------------------------------

    public void visualizarSaldo(){
        double saldo = 50;
        System.out.println("Valor do saldo (conta: " + numero + ") R$:" + this.saldo);
        // this acessa o valor da instância (atributos), ignora variaveis locais
    }
    public void sacar_str(double valor){ //Baixo Acoplamento, Alta coesão
        double saldo_s = this.saldo;
        if (this.saldo >= valor){
            this.saldo -= valor;
            if (saldo_s == (this.saldo + valor))
                System.out.println("Valor sacado com sucesso");
            else{
                System.out.println("Erro ao sacar valor");
                this.saldo = saldo_s;
            }
        }
        else{
            System.out.println("Operacão não realizada, saldo insuficiente");
        }
    }
    public boolean sacar(double valor){ //Alto acoplamento, baixa coesão
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }
    boolean depositar(double valor){
        double saldo_d = this.saldo;
        this.saldo += valor;
        if (saldo_d == (this.saldo - valor))
            return true;
        this.saldo = saldo_d;
        return false;
    }
    public boolean transferirDinheiro(Conta destino, double valor){
        if (this.sacar(valor)){ //Verifica se é possivel sacar o valor do prorprio objeto
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    @Override // Alt + Insert
    public String toString() {
        return "Conta{" +
                "cliente=" + cliente +
                ", numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }
}
