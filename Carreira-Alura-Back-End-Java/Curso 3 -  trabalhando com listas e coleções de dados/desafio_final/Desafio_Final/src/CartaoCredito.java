import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CartaoCredito {
    double limite;
    List<Compras> compras = new ArrayList<>();

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean realizarCompra(String descricaoCompra, Double precoProduto) {
        //verifica se tem limite
        if(limite >= precoProduto){
            limite -= precoProduto;
            Compras compra = new Compras();
            compra.precoProduto = precoProduto;
            compra.descricaoCompra = descricaoCompra;
            this.compras.add(compra);
            System.out.println("Compra realizada!");
            return true;
        } else {
            System. out.println("Saldo insuficiente!");
            this.extratoCartao();
            return false;
        }
    }

    public void extratoCartao(){
        System.out.println("**************************");
        System.out.println("COMPRAS REALIZADAS:");
        Collections.sort(compras);
        for(Compras compra : compras){
            System.out.println(compra.descricaoCompra + " - R$" + compra.precoProduto);
        }
        System.out.println("**************************\n");
        System.out.println("Saldo do cartão: R$" + this.limite);
    }
}
