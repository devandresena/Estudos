import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //Crie um programa simples que solicita dois números ao usuário e realiza a divisão do primeiro pelo segundo.
        //Utilize o bloco try/catch para tratar a exceção que pode ocorrer caso o usuário informe 0 como divisor.
        int primeiroNumero;
        int segundoNumero;
        int resultado;

        try {
            Scanner leitura = new Scanner(System.in);
            System.out.println("Digite o primeiro número: ");
            primeiroNumero = leitura.nextInt();

            System.out.println("Digite o segundo número: ");
            segundoNumero = leitura.nextInt();

            if (segundoNumero == 0) {
                throw new ArithmeticException("Divisão por zero não é permitida.");
            }

            resultado = primeiroNumero / segundoNumero;

            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e){
            System.out.println("O seguinte erro ocorreu: " + e.getMessage());
        }
    }
}
