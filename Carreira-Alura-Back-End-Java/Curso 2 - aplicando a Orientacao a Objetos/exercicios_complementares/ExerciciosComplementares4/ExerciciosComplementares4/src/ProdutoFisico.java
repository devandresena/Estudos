public class ProdutoFisico implements Calculavel{
    double precoProduto;
    double descontoEmPercentual = 10.0;

    @Override
    public double calcularPrecoFinal() {
        //Calcula valor com o desconto
        return (precoProduto - (((precoProduto / 100)) * descontoEmPercentual));
    }
}
