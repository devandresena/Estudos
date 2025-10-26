import java.util.Scanner;

public class Principal2 {
    public static void main(String[] args) {
        //Crie um programa que lê uma senha do usuário. Utilize o bloco try/catch para capturar a exceção
        //SenhaInvalidaException, uma classe de exceção personalizada que deve ser lançada caso a senha não atenda a
        //critérios específicos (por exemplo, ter pelo menos 8 caracteres).
        String senha;
        try {
            Scanner leitura = new Scanner(System.in);
            System.out.println("Crie sua senha: ");
            senha = leitura.nextLine();

            if (senha.length() < 8){
                throw new SenhaInvalidaException("A senha precisa ter mais que 8 caracteres.");
            }

            System.out.println("Senha gravada com sucesso.");
        } catch (SenhaInvalidaException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
