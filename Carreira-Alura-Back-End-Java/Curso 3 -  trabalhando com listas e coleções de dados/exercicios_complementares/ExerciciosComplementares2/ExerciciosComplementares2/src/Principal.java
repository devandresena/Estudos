import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        //1 - Crie uma classe Produto com atributos como nome, preco, e quantidade. Em seguida, crie uma lista de
        //objetos Produto utilizando a classe ArrayList. Adicione alguns produtos, imprima o tamanho da lista
        //e recupere um produto pelo índice.

        Produto garrafa = new Produto("Garrafa", 10.05, 10);

        Produto agua = new Produto("Agua",2.10,20);

        Produto papel = new Produto("Papel", 0.10, 1000);

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(garrafa);
        produtos.add(agua);
        produtos.add(papel);

        System.out.println("Tamanho do array: " + produtos.size());

        System.out.println("Produto: " + produtos.get(0));
        System.out.println("Produto: " + produtos.get(1));
        System.out.println("Produto: " + produtos.get(2));

        //Implemente o método toString() na classe Produto para retornar uma representação em texto do objeto.
        //Em seguida, imprima a lista de produtos utilizando o método System.out.println().
        //[Feito]

        //Modifique a classe Produto para incluir um construtor que aceite parâmetros para inicializar os
        //atributos. Em seguida, crie objetos Produto utilizando esse novo construtor.
        //[Feito]

        //Crie uma classe ProdutoPerecivel que herde de Produto. Adicione um atributo dataValidade e um construtor
        //que utilize o construtor da classe mãe (super) para inicializar os atributos herdados. Crie um objeto
        //ProdutoPerecivel e imprima seus valores.
        ProdutoPerecivel iogurte = new ProdutoPerecivel("Iogurte", 4.00, 100, "20/10/2025");
        produtos.add(iogurte);
        System.out.println("Nome Produto: " + produtos.get(3));
        System.out.println("Preço: " + produtos.get(3).getPreco());
        System.out.println("Quantidade: " + produtos.get(3).getQuantidade());
        System.out.println("Data Validade: " + iogurte.dataValidade);
    }
}