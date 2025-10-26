public class Compras implements Comparable<Compras>{
    String descricaoCompra;
    double precoProduto;


    @Override
    public int compareTo(Compras outraCompra) {
        return Double.compare(this.precoProduto, outraCompra.precoProduto);
    }
}
