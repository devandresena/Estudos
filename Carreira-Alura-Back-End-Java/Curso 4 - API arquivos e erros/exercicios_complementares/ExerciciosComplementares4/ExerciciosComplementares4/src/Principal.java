import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException {
        //1 - Crie um programa em Java que escreva a seguinte mensagem em um arquivo chamado "arquivo.txt": "Conteúdo a
        //ser gravado no arquivo." Utilize as classes do pacote java.io.
        FileWriter escrever = new FileWriter("arquivo.txt");
        escrever.write("Conteúdo a ser gravado no arquivo");
        escrever.close();

        //2 - Defina uma classe chamada Titulo com os atributos necessários. Em seguida, crie um programa que instancia
        //um objeto Titulo, serializa esse objeto para JSON usando a biblioteca Gson e imprime o resultado.

        //3 - Modifique o programa anterior para que o JSON gerado seja formatado de maneira mais elegante.
        //Utilize o método setPrettyPrinting para alcançar esse resultado.
        Titulo starwars = new Titulo("Star Wars", 1977);

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
        System.out.println(gson.toJson(starwars));

        //Defina uma classe chamada Veiculo com os atributos necessários. Em seguida, crie um programa que
        //instancia um objeto Veiculo, serializa esse objeto para JSON usando a biblioteca Gson e imprime o resultado.
        Veiculo carro = new Veiculo("Vectra", "Carro", "GM", 1993);
        System.out.println(gson.toJson(carro));
    }
}
