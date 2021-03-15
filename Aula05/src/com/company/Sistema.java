package com.company;

import java.util.Scanner;

public class Sistema {
    private boolean executarSistema;
    private Scanner scanner; //Temos que inicializar a classe Scanner
    private Conta conta;

    public void executar(){
        int opcao;
        while(executarSistema){
            
            exibirMenu();
            opcao = scanner.nextInt();
            avaliarOpcao(opcao);
        }
    }

    private void avaliarOpcao(int opcao) {
        switch (opcao){
            case 0: //Encerrar o sistema
                System.out.println("Obrigado por ter utilizado o sistema!");
                this.executarSistema = false;
                break;
            case 1: //Visualizar Saldo
                System.out.println("Saldo: R$ " + this.conta.getSaldo());
                break;
            case 2: //Depositar dinheiro
                System.out.println("Informe um valor para depositar:");
                double valorParaDepositar = scanner.nextDouble();
                this.conta.depositar(valorParaDepositar);
                System.out.println("Operacão realizada com sucesso.");
                break;
            case 3: //Sacar dinheiro
                System.out.println("Informe um valor para sacer:");
                double valorParaSacar = scanner.nextDouble();
                if (this.conta.sacar(valorParaSacar))
                    System.out.println("Operacão realizada com sucesso.");
                else
                    System.out.println("Algo de errado aconteceu: saldo");
                break;
            case 4: //Transferir dinheiro
                break;
            case 5: //Pagar conta (título)
                System.out.println("Nome do título a pagar:");
                String nomeTitulo = scanner.next(); //Lê uma linha
                System.out.println("Valor do título:");
                double valorTitulo = scanner.nextDouble();
                System.out.println("Valor do juros por dia:");
                double valorJurosPorDia = scanner.nextDouble();
                System.out.println("Informe a data de vencimento (aaaa-mm-dd)");
                String dataVencimentoTitulo = scanner.next();
                Titulo titulo = new Titulo(valorTitulo, nomeTitulo, valorJurosPorDia, dataVencimentoTitulo);

                if(this.conta.sacar(titulo.getValorPagamento()))
                    System.out.println("Operacão realizada com sucesso.");
                else
                    System.out.println("Não foi possível realizar o pagamento.");
                break;
            default:
                System.out.println("Opcão ainda não implementada!");
                break;

        }
    }

    public Sistema() { //Construtor
        this.executarSistema = true;
        this.scanner = new Scanner(System.in);
        this.conta = new Conta("Luigi", 1235, 1010);
    }

    private void exibirMenu() {
        System.out.println("Bem vindo ao MauaBank");
        System.out.println("1 - Visualizar Saldo");
        System.out.println("2 - Depositar dinheiro");
        System.out.println("3 - Sacar dinheiro");
        System.out.println("4 - Transferir dinheiro");
        System.out.println("5 - Pagar conta (título)");
        System.out.println("0 - Encerrar Sistema");
    }

}
