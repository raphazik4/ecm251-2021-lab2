package com.company;

public class Main {

    public static void main(String[] args) {

	    //Cria uma referência para um objeto Conta
        Conta c1; //Objeto da classe conta
        //Instancia um objeto conta
        c1 = new Conta(); //Construtor da classe - dá um endereco de memória para a classe

        //Manipular os atributos
        c1.cliente.titular = "Raphael";
        c1.saldo = 666.00;
        c1.numero = 1366;

        //Invocar o método visualizarSaldo()
        c1.visualizarSaldo();

        Conta c2 = new Conta(); //Criacão de outro objeto conta
        c2.saldo = 400;
        c2.cliente.titular = "Izuku Midoriya";
        c2.visualizarSaldo();

        c1.depositar(100);
        c1.visualizarSaldo();

        if(c2.sacar(200)){
            System.out.println("Deu bom!");
        }
        else
            System.out.printf("Deu ruim");
        c2.visualizarSaldo();

        if(c1.transferirDinheiro(c2, 500))
            System.out.println("Transferência realizada com sucesso");
        else
            System.out.println("Falha ao trasnferir");

        c1.visualizarSaldo();
        c2.visualizarSaldo();

        if(c1.transferirDinheiro(c2, 500))
            System.out.println("Transferência realizada com sucesso");
        else
            System.out.println("Falha ao trasnferir");

        c1.visualizarSaldo();
        c2.visualizarSaldo();

        System.out.printf("\n\nC1: " + c1.toString());
        System.out.printf("\nC2: " + c2.toString());

    }
}
