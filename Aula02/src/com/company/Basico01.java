package com.company;

public class Basico01 {

    //Tipos primitivos (tipos básicos das variáveis que existem)

    public static void main(String[] args) {

        int hp; // número inteiro
        boolean megaEvolui; // valor lógico
        float atk; //todo número ponto flutuante em java é um double, representacao matematica dele é mais simples
        // comentário acima  ficou verde pq é um (to do) - entra na lista de afazeres
        // mantem a compatibilidade com float
        double satk;
        String nome;

        //Atribuicões

        hp = 100;
        megaEvolui = true;
        atk = 50.0f; // forca o valor a ser um double para ser ponto flutuante
        satk = 55.0;
        nome = "Gengar";

        System.out.println("Nome: " + nome);
        System.out.println("Mega Evolui?: " + megaEvolui);
        System.out.println("Atk: " + atk + " Atk Especial: " + satk);

    }

}
