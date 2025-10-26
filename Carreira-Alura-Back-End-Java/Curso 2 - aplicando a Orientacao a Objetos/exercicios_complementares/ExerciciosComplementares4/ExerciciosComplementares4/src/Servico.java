public class Servico implements Vendavel{
    double precoProduto;
    double quantidadeProduto;
    double percentualDesconto = 0.0;

    @Override
    public double calcularPrecoDescontoQuantidade() {
        if (quantidadeProduto == 1){
            percentualDesconto = 5.0;
        } else if (quantidadeProduto > 1) {
            percentualDesconto = 10.0;
        }

        return (precoProduto - ((precoProduto / 100) * percentualDesconto)) * (double) quantidadeProduto;
    }
}
