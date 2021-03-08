package com.company;

public class Cliente {

    //Atributos

    String titular; // Se atribuir algum valor, este será o valor padrao
    String cpf;

    @Override // Alt + Insert
    public String toString() {
        return "Cliente{" +
                "titular='" + titular + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
