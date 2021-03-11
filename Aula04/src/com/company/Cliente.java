package com.company;

public class Cliente {

    //Atributos

    private String nome; // Se atribuir algum valor, este será o valor padrao
    private String sobrenome;
    private String cpf;

    public Cliente(String nomeCliente){
        this.nome = nomeCliente;
    }

    // Alt + Insert


    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
