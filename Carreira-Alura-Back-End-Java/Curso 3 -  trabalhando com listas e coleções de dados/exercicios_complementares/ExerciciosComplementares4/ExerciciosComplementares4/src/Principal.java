import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        //Crie uma lista de números inteiros e utilize o método Collections.sort para ordená-la em ordem crescente.
        //Em seguida, imprima a lista ordenada.
        List<Integer> numerosInteiros = new ArrayList<>();
        int numero1 = 1;
        int numero2 = 2;
        int numero3 = 3;
        int numero4 = 4;
        int numero5 = 5;

        numerosInteiros.add(numero4);
        numerosInteiros.add(numero3);
        numerosInteiros.add(numero1);
        numerosInteiros.add(numero2);
        numerosInteiros.add(numero5);

        System.out.println(numerosInteiros);
        Collections.sort(numerosInteiros);
        System.out.println(numerosInteiros);

        //Crie uma classe Titulo com um atributo nome do tipo String. Implemente a interface Comparable na classe
        //para que seja possível ordenar uma lista de objetos Titulo.
        Titulo titulo1 = new Titulo("Homem Aranha");
        Titulo titulo2 = new Titulo("Vingadores");
        Titulo titulo3 = new Titulo("A Qualquer");
        Titulo titulo4 = new Titulo("B Qualquer");

        //No Exercício 2, crie alguns objetos da classe Titulo e adicione-os a uma lista. Utilize o método Collections.
        //sort para ordenar a lista e, em seguida, imprima os títulos ordenados.
        List<Titulo> titulos = new ArrayList<>();
        titulos.add(titulo1);
        titulos.add(titulo2);
        titulos.add(titulo3);
        titulos.add(titulo4);

        System.out.println(titulos);
        Collections.sort(titulos);
        System.out.println(titulos);

        //Crie uma lista utilizando a interface List e instancie-a tanto como ArrayList quanto como LinkedList.
        //Adicione elementos e imprima a lista, mostrando que é possível trocar facilmente a implementação.

        //Modifique o Exercício 4 para declarar a variável de lista como a interface List, demonstrando o uso de
        // polimorfismo.
        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento 1");
        listaPolimorfica.add("Elemento 2");
        System.out.println("ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        System.out.println("LinkedList: " + listaPolimorfica);
    }
}
