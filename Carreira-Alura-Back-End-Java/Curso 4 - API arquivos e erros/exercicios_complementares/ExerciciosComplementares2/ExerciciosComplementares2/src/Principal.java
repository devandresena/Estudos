import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Principal {
    public static void main(String[] args) {
        //Crie uma classe Pessoa usando o conceito de Record em Java, com atributos como nome, idade e cidade.
        //Em seguida, implemente um programa que utiliza a biblioteca Gson para converter um JSON representando
        //uma pessoa em um objeto do tipo Pessoa.
        String json = """
                {
                "nome":"André",
                "idade":36,
                "cidade":"São Paulo"
                }
                """;


        Gson gson = new Gson();
        Pessoa pessoa = gson.fromJson(json, Pessoa.class);
        System.out.println(pessoa);

        //Modifique o programa do Exercício anterior para permitir a conversão de um JSON mesmo se alguns campos
        //estiverem ausentes ou se houver campos adicionais não representados no objeto Pessoa. Consulte a
        //documentação da biblioteca Gson para flexibilizar a conversão.

        //Crie uma classe Livro que contenha atributos como título, autor e um objeto representando a editora.
        //Em seguida, implemente um programa que utiliza a biblioteca Gson para converter um JSON aninhado
        //representando um livro em um objeto do tipo Livro.
    }
}
