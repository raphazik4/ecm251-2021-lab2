package com.company;

import java.util.Random;

public class Teste_Metodos_senha {

    public static void main(String[] args) {

        int senha = 123456;
        int contador;

        //Metodo numeros aleatorios
        contador = 0;

        Random sorteador = new Random();
        int chute = sorteador.nextInt(999999);

        while (chute != senha){
            chute = sorteador.nextInt(999999);
            contador++;
        }
        System.out.println("\nMétodo némros aleatórios:");
        System.out.println("A senha foi quebrada em " + contador + " tentativas.");

        //Metodo contador 1 em 1
        contador = 0;

        while (contador != senha){
            contador++;
        }
        System.out.println("\nMétodo contador unitário:");
        System.out.println("A senha foi quebrada em " + (contador+1) + " tentativas.");

        //Metodo


    }

}
