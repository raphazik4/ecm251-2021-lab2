package com.company;

import java.util.Random;

public class Teste_Metodos_senha {

    public static void main(String[] args) {


        int alcance = 999999;
        int senha = 123456;
        int contador;

        //Metodo numeros aleatorios ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        contador = 0;

        Random sorteador = new Random();
        int chute = sorteador.nextInt(alcance);

        while (chute != senha){
            chute = sorteador.nextInt(alcance);
            contador++;
        }
        System.out.println("\nMétodo némros aleatórios:");
        System.out.println("A senha foi quebrada em " + contador + " tentativas.\nSenha: " + chute);

        //Metodo contador unitário, inicio em 0 ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        contador = 0;

        while (contador != senha){
            contador++;
        }
        System.out.println("\nMétodo contador unitário:");
        System.out.println("A senha foi quebrada em " + contador + " tentativas.\nSenha: " + contador);

        //Metodo contador unitário - aleatório -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        contador = 0;

        chute = sorteador.nextInt(alcance);
        System.out.println("\nMétodo dos unitário-aleatório, valor inicial randômico: " + chute);
        int auxiliar = chute, status = 0;

        while ( (auxiliar < alcance) && (status == 0) ){
            if (auxiliar == senha) {
                    status = 1;
                    break;
            }
            //System.out.println("Auxiliar: " + auxiliar);
            auxiliar++;
            contador++;
        }

        if (status == 0)
            auxiliar = chute-1;

        while ( (auxiliar > 0) && (status == 0) ){
            if (auxiliar == senha) {
                status = 1;
                break;
            }
            //System.out.println("Auxiliar: "  + auxiliar);
            auxiliar--;
            contador++;
        }
        System.out.println("A senha foi quebrada em " + contador + " tentativas.\nSenha: " + auxiliar );

        //Metodo contador unitário - partida de pivô central -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        contador = 0;

        auxiliar = alcance/2;
        status = 0;

        while ( (auxiliar < alcance) && (status == 0) ){
            if (auxiliar == senha) {
                status = 1;
                break;
            }
            //System.out.println("Auxiliar: " + auxiliar);
            auxiliar++;
            contador++;
        }

        if (status == 0)
            auxiliar = alcance/2-1;

        while ( (auxiliar > 0) && (status == 0) ){
            if (auxiliar == senha) {
                status = 1;
                break;
            }
            //System.out.println("Auxiliar: "  + auxiliar);
            auxiliar--;
            contador++;
        }
        System.out.println("\nMétodo contador unitário - partida de pivô central:");
        System.out.println("A senha foi quebrada em " + contador + " tentativas.\nSenha: " + auxiliar );

    }

}
