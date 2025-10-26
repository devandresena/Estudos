import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba
        // "Número positivo", caso contrário, exiba "Número negativo".
        Scanner numeroDigitado = new Scanner(System.in);
        int numeroArmazenado = 0;

        System.out.println("Digite um número positivo ou negativo:");
        numeroArmazenado = numeroDigitado.nextInt();

        if (numeroArmazenado > 0) {
            System.out.println("O número digitado é positivo");
        } else if (numeroArmazenado < 0) {
            System.out.println("O número digitado é negativo");
        } else {
            System.out.println("O número digitado é 0");
        }

        //Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando
        //se são iguais, diferentes, o primeiro é maior ou o segundo é maior.
        int primeiroNumero = 0;
        int segundoNumero = 0;

        System.out.println("Digite o primeiro número:");
        primeiroNumero = numeroDigitado.nextInt();
        System.out.println("Digite o segundo número:");
        segundoNumero = numeroDigitado.nextInt();

        if (primeiroNumero == segundoNumero) {
            System.out.println("Os números são iguais");
        } else if (primeiroNumero > segundoNumero) {
            System.out.println("Os números são diferentes e o primeiro número é maior que o segundo");
        } else {
            System.out.println("Os números são diferentes e o segundo número é maior que o primeiro");
        }

        //Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do
        // círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
        int opcaoSelecionada = 0;
        double comprimento = 0;
        double raio = 0;

        System.out.println("""
                Digite uma das opções abaixo
                (1) Para calcular a área de um quadrado
                (2) Para calcular a área de um círculo""");

        opcaoSelecionada = numeroDigitado.nextInt();

        if (opcaoSelecionada == 1) {
            System.out.println("Digite o comprimento do quadrado em centimetros");
            comprimento = numeroDigitado.nextDouble();
            System.out.println("A área do quadrado é: " + comprimento * comprimento + "cm");
        } else if (opcaoSelecionada == 2) {
            System.out.println("Digite o raio do circulo em centimetros");
            raio = numeroDigitado.nextDouble();
            System.out.println("A área do círculo é: " + 3.14 * (raio * raio) + "cm");
        } else {
            System.out.println("A opção selecionada não é valida");
        }

        //Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
        int numeroTabuada = 0;

        System.out.println("Digite um número para seja calculado a tabuada de 1 até 10");
        numeroTabuada = numeroDigitado.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(numeroTabuada + "x" + i + "=" + i * numeroTabuada);
        }

        //Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é
        //par ou ímpar e exiba uma mensagem correspondente.
        int numeroParOuImpar = 0;

        System.out.println("Digite um número para saber se ele é para ou impar");
        numeroParOuImpar = numeroDigitado.nextInt();

        if (numeroParOuImpar % 2 == 0) {
            System.out.println("Numero par");
        } else {
            System.out.println("Numero impar");
        }

        //Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
        int numeroFatorial = 0;
        int resultadoFinal = 0;

        System.out.println("Digite um número para que seja calculado o fatorial dele");
        numeroFatorial = numeroDigitado.nextInt();
        resultadoFinal = numeroFatorial;

        if (numeroFatorial == 0) {
            resultadoFinal = 1;
        } else if (numeroFatorial == 1) {
            resultadoFinal = 1;
        } else {
            for (int i = numeroFatorial - 1; i >= 1; i--) {
                resultadoFinal = resultadoFinal * i;
            }
        }

        System.out.println("O fatorial de " + numeroFatorial + " é igual a " + resultadoFinal);
    }
}