package com.company;

import java.util.Random;

public class Basico03 {
    // Estruturas de repeticão

    public static void main(String[] args) {

        int limite = 10;
        int contador;

        for (contador = 0; contador < limite; contador ++){
            System.out.println("Contador: " + contador);
        }

        int senha = 123456;

        // Objeto que possibilida pegar números aleatórios
        Random sorteador = new Random(); // Surge o import da biblioteca na linha 3
        int chute = sorteador.nextInt(999999 ) ;

        int tentativas = 0;
        while (chute  != senha){
            System.out.println("Tentativas: " + tentativas);
            System.out.println("Chute: " + chute);
            chute = sorteador.nextInt(  999999 ) ;
            tentativas++;
        }

    }


}
