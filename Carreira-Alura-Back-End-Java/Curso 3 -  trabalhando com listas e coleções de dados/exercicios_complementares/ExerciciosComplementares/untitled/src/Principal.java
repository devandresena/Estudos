import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
/*        Crie uma classe Pessoa com atributos como nome, idade, e um método toString que represente esses atributos.
                No método main da classe Principal, crie um ArrayList de Pessoa chamado listaDePessoas.
        Adicione pelo menos três pessoas à lista utilizando o método add.
                Imprima o tamanho da lista utilizando o método size.
        Imprima a primeira pessoa da lista utilizando o método get.
        Imprima a lista completa*/

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("André Sena");
        pessoa1.setIdade(35);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Manoel Sena");
        pessoa2.setIdade(5);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Paola Sena");
        pessoa3.setIdade(30);

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("Tamanho da lista: " + listaDePessoas.size());

        System.out.println("Primeira pessoa lista: " + listaDePessoas.get(0));

        System.out.println(listaDePessoas);
    }
}
