public class Livro implements Calculavel{
    double precoProduto;
    double taxaFixaLivros = 1.25;
    @Override
    public double calcularPrecoFinal() {
        return precoProduto + taxaFixaLivros;
    }
}
