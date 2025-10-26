//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Crie um programa que realize a média de duas notas decimais e exiba o resultado.
        double nota1 = 9.5;
        double nota2 = 8.2;

        double media = (nota1 + nota2) / 2;

        System.out.println(String.format("A nota é %s", media));

        //Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.
        double variavelDouble = 5.5;
        int variavelInt = (int) variavelDouble;

        System.out.println(String.format("Variavel Double, convertida em int: %d", variavelInt));

        //Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem.
        char umaLetra = 'O';
        String umaFrase = "lá, tudo bem?";

        System.out.println(umaLetra+umaFrase);

        //Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.
        double precoProduto = 55.10;
        int quantidade = 30;

        double valorTotal = quantidade * precoProduto;

        System.out.println(String.format("Valor total: R$%.2f", valorTotal));

        /*Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável.
        Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em
        dólares para reais e imprima o resultado formatado.*/
        double valorEmDolares = 10000.00;
        double valorEmReais = valorEmDolares * 4.96;

        System.out.println(String.format("O valor U$%.2f convertido em reais é R$%.2f", valorEmDolares, valorEmReais));

        /*Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável,
        representando o preço original de um produto. Em seguida, declare uma variável do tipo double
        percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%).
        Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.
         */
        double precoOriginal = 66.59;
        double percentualDesconto = 10;
        double precoComDesconto = precoOriginal - ((precoOriginal/100)*percentualDesconto);

        System.out.println(String.format("O preço com desconto é %.2f", precoComDesconto));
    }
}