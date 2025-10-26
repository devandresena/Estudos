import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        //Crie um ArrayList de strings e utilize um loop foreach para percorrer e imprimir cada elemento da lista.
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("André");
        nomes.add("Manoel");
        nomes.add("Judival");
        nomes.add("Rita");

        for(String nome : nomes){
            System.out.println(nome);
        }

        //Crie uma classe Animal e uma classe Cachorro que herda de Animal. Em seguida, crie um objeto da classe
        //Cachorro e faça o casting para a classe Animal.
        Cachorro cachorro = new Cachorro();
        Animal animal = (Animal) cachorro;

        //Modifique o Exercício 2 para incluir uma verificação usando instanceof para garantir que o objeto seja do
        //tipo correto antes de fazer o casting.
        if (cachorro instanceof Cachorro){
            animal = (Animal) cachorro;
        }

        //Crie uma classe Produto com propriedades como nome e preço. Em seguida, crie uma lista de produtos e
        //utilize um loop para calcular e imprimir o preço médio dos produtos.
        ArrayList<Produto> produtos = new ArrayList<>();
        Produto produto1 = new Produto("garrafa", 10.50);
        Produto produto2 = new Produto("caneca", 5.50);
        Produto produto3 = new Produto("copo", 3.50);
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);

        double valorTotal = 0;
        for(Produto produto : produtos){
            valorTotal += produto.preco;
        }
        System.out.println(valorTotal);

        //Crie uma interface Forma com um método calcularArea(). Implemente a interface em duas classes, por exemplo,
        // Circulo e Quadrado. Em seguida, crie uma lista de formas (objetos da interface Forma) e utilize um loop
        // para calcular e imprimir a área de cada forma.
        ArrayList<Forma> formas = new ArrayList<>();
        Circulo circulo1 = new Circulo(4);
        Circulo circulo2 = new Circulo(5);
        Circulo circulo3 = new Circulo(6);

        Quadrado quadrado1 = new Quadrado(5);
        Quadrado quadrado2 = new Quadrado(6);
        Quadrado quadrado3 = new Quadrado(7);

        formas.add(circulo1);
        formas.add(circulo2);
        formas.add(circulo3);

        formas.add(quadrado1);
        formas.add(quadrado2);
        formas.add(quadrado3);

        for(Forma forma : formas){
            System.out.println("A área do elemento é: " + String.format("%.2f", forma.calcularArea()));
        }

        //Crie uma classe ContaBancaria com propriedades como número da conta e saldo. Em seguida, crie uma lista de
        // contas bancárias com diferentes saldos. Utilize um loop para encontrar e imprimir a conta com o maior saldo.
        ContaBancaria conta1 = new ContaBancaria(1, 30.0);
        ContaBancaria conta2 = new ContaBancaria(2, 29.0);
        ContaBancaria conta3 = new ContaBancaria(3, 35.10);

        ArrayList<ContaBancaria> contas = new ArrayList<>();
        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);

        int numeroMaiorConta = 0;
        double maiorSaldo = 0.0;
        int contador = 0;
        for(ContaBancaria conta : contas){
            if (contador != 0){
                //Verifica se valor da conta anterior é maior que o valor da conta atual
                if (conta.saldo > maiorSaldo){
                    numeroMaiorConta = conta.numeroConta;
                    maiorSaldo = conta.saldo;
                }
            } else {
                //Se for a primeira execução, inclui valores da primeira conta em variaveis
                numeroMaiorConta = conta.numeroConta;
                maiorSaldo = conta.saldo;
                contador++;
            }
        }

        System.out.println("O número da conta com maior valor é: " + numeroMaiorConta);
        System.out.println("O valor que se encontra na maior conta é R$" + maiorSaldo);



    }
}
