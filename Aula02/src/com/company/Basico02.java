package com.company;

public class Basico02 {

    //Estruturas de decisão

    public static void main(String[] args) {
        int ano = 2020;
        // Estrutura de decisão simples
//        if (ano % 2 == 0){
//            System.out.println("Ano Par");
//        }
//
//        if (ano % 2 != 0){
//            System.out.println("Ano Ímpar");
//        }

        //Estrutura de decisão composta
        if (ano % 2 == 0) {
            System.out.println("Ano par");
        } else
            System.out.println("Ano Ímpar");

        // da pra utilizar sem parentesis, só pega a 1 linha

        switch (ano) {

            case 2020:
                System.out.println("Vixi!");
            case 1996:
                System.out.println("Pokemon !");
            default:
                System.out.printf("Segue!");
                break;

        }
    }

}
