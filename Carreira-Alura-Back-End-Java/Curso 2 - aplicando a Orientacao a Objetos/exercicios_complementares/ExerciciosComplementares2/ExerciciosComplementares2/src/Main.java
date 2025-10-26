//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado)
        // e titular (publico). Implemente métodos getters e setters para os atributos privados.
        //FEITO

        //Crie uma classe IdadePessoa com os atributos privados nome e idade. Utilize métodos getters e setters
        // para acessar e modificar esses atributos. Adicione um método verificarIdade que imprime se a pessoa é
        //  maior de idade ou não.
        IdadePessoa pessoa = new IdadePessoa();
        pessoa.setIdade(35);
        pessoa.setNome("André");
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Nome: " + pessoa.getNome());
        pessoa.verificarIdade();

        //Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize métodos getters e setters
        // para acessar e modificar esses atributos. Adicione um método aplicarDesconto que recebe um valor
        //  percentual e reduz o preço do produto.
        Produto produto = new Produto();
        produto.setNome("Arroz");
        produto.setPreco(32);
        System.out.println("Nome produto: " + produto.getNome());
        System.out.println("Preço produto: R$" + produto.getPreco());
        System.out.println("Valor produto com desconto: R$" + produto.aplicarDesconto(10));

        //Desenvolva uma classe Aluno com os atributos privados nome e notas. Utilize métodos getters e setters para
        //acessar e modificar esses atributos. Adicione um método calcularMedia que retorna a média das notas do aluno.
        Aluno aluno = new Aluno();
        aluno.setNome("André");
        aluno.setNotas(10);
        aluno.setNotas(6);
        aluno.setNotas(6);
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Nota: " + aluno.getNotas());
        System.out.println(aluno.calcularMedia());

        //Desenvolva uma classe Livro com os atributos privados titulo e autor. Utilize métodos getters e setters para
        //acessar e modificar esses atributos. Adicione um método exibirDetalhes que imprime o título e o autor do
        //livro.
        Livro livro = new Livro();
        livro.setAutor("George R. R. Martin");
        livro.setTitulo("A Guerra dos Tronos - As Crônicas de Gelo e Fogo");
        livro.exibirDetalhes();
    }
}