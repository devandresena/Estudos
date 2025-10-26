public class Produto implements Vendavel{
    double precoProduto;
    double quantidadeProduto;
    double percentualDesconto = 0.0;

    @Override
    public double calcularPrecoDescontoQuantidade() {
        if (quantidadeProduto == 2){
            percentualDesconto = 10.0;
        } else if (quantidadeProduto > 2){
            percentualDesconto = 15.0;
        }

        if (percentualDesconto > 0.0){
            return (precoProduto - ((precoProduto / 100) * percentualDesconto)) * (double) quantidadeProduto;
        } else {
            return precoProduto * (double) quantidadeProduto;
        }
    }
}
