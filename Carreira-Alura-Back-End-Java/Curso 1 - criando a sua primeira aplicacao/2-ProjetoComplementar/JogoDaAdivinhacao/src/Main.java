import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numeroParaAdivinhar = new Random().nextInt(101);
        int sugestao = 0;
        int tentativas = 0;
        Scanner numeroDigitado = new Scanner(System.in);

        System.out.println("Tente adivinhar um número de 0 a 100.");

        while (tentativas < 5) {
            System.out.println("Digite sua sugestão");
            sugestao = numeroDigitado.nextInt();

            //Verifica se acertou número, se é menor ou maior que o número sorteado
            if (numeroParaAdivinhar == sugestao) {
                System.out.println("Você acertou!!! Parabéns!!!");
                break;
            } else if (numeroParaAdivinhar > sugestao) {
                System.out.println("O número sugerido é menor do que o valor sorteado...");
            } else {
                System.out.println("O número sugerido é maior do que o valor sorteado...");
            }
            tentativas++;
        }

        if (tentativas == 5 && sugestao != numeroParaAdivinhar) {
            System.out.println("Você não conseguiu acertar o número em 05 tentativas. O número era: " + numeroParaAdivinhar);
        }
    }
}