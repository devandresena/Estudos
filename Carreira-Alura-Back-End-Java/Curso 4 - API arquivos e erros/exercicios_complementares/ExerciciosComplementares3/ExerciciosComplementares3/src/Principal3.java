import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal3 {
    public static void main(String[] args) throws IOException, InterruptedException {
        //Desenvolva um programa em Java que permite aos usuários consultar informações sobre um usuário do GitHub
        //(utilize a API pública do GitHub para obter os dados). Crie uma classe de exceção personalizada,
        // ErroConsultaGitHubException, que estende RuntimeException. Lance essa exceção quando o nome de usuário
        // não for encontrado. No bloco catch, trate de forma específica essa exceção, exibindo uma mensagem amigável.
        String usuarioGit;
        String endereco;

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o nome do usuario que deseja procurar: ");
        usuarioGit = leitura.nextLine();

        endereco = "https://api.github.com/users/" + usuarioGit;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        Gson gson = new Gson();

        gitRetorno retornoEstruturado = gson.fromJson(json, gitRetorno.class);

        try {
            if(retornoEstruturado.message() != null) {
                if (retornoEstruturado.message().equals("Not Found")) {
                    throw new ErroConsultaGitHubException("Usuario não encontrado!");
                }
            }
            System.out.println("URL: " + retornoEstruturado.url());
        } catch (ErroConsultaGitHubException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
