import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner valorDigitado = new Scanner(System.in);
        int opcaoSelecionada = 0;
        double valorReceber = 0.0;
        double valorTransferir = 0.0;

        Conta andre = new Conta("André", "Conta Corrente", 2000.00);
        while (opcaoSelecionada != 4) {
            System.out.println("""
                    Operações
                    
                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                    
                    Digite a opçãp desejada:""");

            opcaoSelecionada = valorDigitado.nextInt();

            if (opcaoSelecionada == 1) { //Exibir saldo
                System.out.println("O saldo atual é R$" + andre.saldo);
            } else if (opcaoSelecionada == 2) { //Receber valor
                valorReceber = 0.0;
                System.out.println("Informe o valor a receber:");
                valorReceber = valorDigitado.nextDouble();
                if (valorReceber > 0) {
                    andre.setSaldo(andre.getSaldo() + valorReceber);
                    System.out.println("O saldo atualizado é R$" + andre.saldo);
                } else {
                    System.out.println("Valor digitado invalido");
                }
            } else if (opcaoSelecionada == 3) { //Transferir valor
                valorTransferir = 0.0;
                System.out.println("Informe o valor a transferir:");
                valorTransferir = valorDigitado.nextDouble();
                if (valorTransferir <= andre.getSaldo()) {
                    andre.setSaldo(andre.getSaldo() - valorTransferir);
                    System.out.println("O saldo atualizado é R$" + andre.saldo);
                } else {
                    System.out.println("Não há saldo suficiente para fazer essa transferencia");
                }
            } else if (opcaoSelecionada == 4) { //Sair
                System.out.println("Até mais :) Volte sempre!");
            }else { //Opção invalida
                System.out.println("Opção selecionada invalida");
            }
        }
    }
}
