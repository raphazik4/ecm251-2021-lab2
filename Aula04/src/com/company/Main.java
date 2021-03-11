package com.company;

public class Main {

    public static void main(String[] args) {

	    //Cria uma referência para um objeto Conta
        Conta c1; //Objeto da classe conta
        //Instancia um objeto conta
        c1 = new Conta("Saitama", 999.99); //Construtor da classe - dá um endereco de memória para a classe

        //Problema: Qualquer um pode alterar os atributos da classe, quando em tese deveriam apenas conseguir utilizar os métodos
//        c1.depositar(300);
//        c1.sacar(250);
//        c1.saldo = 300;
//        c1.visualizarSaldo();

        //Modificadores de acesso:
        //public - Pode ser acessado de qualquer lugar e por qualquer entidade que visualize a classe a que ele pertence
        //private - Não podem ser acessados por nenhuma outra classe, aplicado a métodos e atributos (burlável)
        //protected - torna o membro acessível ás classes do mesmo pacote e cadeia de heranca
        //default - disponivel para tod o pacote

        Conta c2 = new Conta("Goku", 12345);

        System.out.println("Conta 1:" + c1.toString());
        System.out.println("Conta 2:" + c2.toString());

    }
}
