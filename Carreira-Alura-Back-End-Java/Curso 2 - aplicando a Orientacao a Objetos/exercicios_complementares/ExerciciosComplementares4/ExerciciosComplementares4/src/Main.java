public class Main {
    public static void main(String[] args) {
        //1 - Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira com o método
        //converterDolarParaReal() para converter um valor em dólar para reais. A classe deve receber o valor em
        //dólar como parâmetro.
        double dolarReal;
        ConversorMoeda converter = new ConversorMoeda();
        dolarReal = converter.converterDolarParaReal(66.25);
        System.out.println(String.format("%.2f", dolarReal));

        //2 - Crie uma classe CalculadoraSalaRetangular que implementa uma interface CalculoGeometrico com os métodos
        //calcularArea() e calcularPerimetro() para calcular a área e o perímetro de uma sala retangular.
        //A classe deve receber altura e largura como parâmetros.
        CalculadoraSalaRetangular calcularSala = new CalculadoraSalaRetangular(4.0, 5.0);
        //Area
        System.out.println("Area: " + calcularSala.calcularArea());
        //Perimetro
        System.out.println("Perimetro: " + calcularSala.calcularPerimetro());

        //3 - Crie uma classe TabuadaMultiplicacao que implementa uma interface Tabuada com o método mostrarTabuada()
        //para exibir a tabuada de um número. A classe deve receber o número como parâmetro.
        TabuadaMultiplicacao calcularTabuada = new TabuadaMultiplicacao();
        calcularTabuada.mostrarTabuada(7);

        //4 - Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius().
        //Implemente uma classe ConversorTemperaturaPadrao que implementa essa interface com as fórmulas de
        //conversão e exibe os resultados.
        ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao();
        conversor.celsiusParaFahrenheit(25);
        conversor.fahrenheitParaCelsius(77);

        //5 - Crie uma interface Calculavel com um método double calcularPrecoFinal(). Implemente essa
        //interface nas classes Livro e ProdutoFisico, cada uma retornando o preço final considerando descontos
        //ou taxas adicionais.
        ProdutoFisico cavaquinho = new ProdutoFisico();
        cavaquinho.precoProduto = 10.0;
        System.out.println("Preço final produto fisico: " + cavaquinho.calcularPrecoFinal());

        Livro gameOfThrones = new Livro();
        gameOfThrones.precoProduto = 10.0;
        System.out.println("Preço final livro: " + gameOfThrones.calcularPrecoFinal());

        //Crie uma interface Vendavel com métodos para calcular o preço total de um produto com base na quantidade
        //comprada e aplicar descontos. Implemente essa interface nas classes Produto e Servico, cada uma
        //fornecendo a sua própria lógica de cálculo de preço.
        Produto processador = new Produto();
        processador.precoProduto = 100.00;
        processador.quantidadeProduto = 3;
        System.out.println("Preço processador R$" + processador.calcularPrecoDescontoQuantidade());

        Servico trocaProcessador = new Servico();
        trocaProcessador.precoProduto = 10.00;
        trocaProcessador.quantidadeProduto = 1;
        System.out.println("Preço serviço troca processador R$" + trocaProcessador.calcularPrecoDescontoQuantidade());
    }
}