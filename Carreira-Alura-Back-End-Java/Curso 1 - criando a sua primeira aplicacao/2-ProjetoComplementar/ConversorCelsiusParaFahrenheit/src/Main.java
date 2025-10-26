//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double temperaturaCelsiusDouble = 25.5;
        double temperaturaFahrenheitDouble = (temperaturaCelsiusDouble * 1.8) + 32;

        String mensagem = String.format("A temperatura %.2f Celsius convertida em Fahrenheit é %.2f", temperaturaCelsiusDouble, temperaturaFahrenheitDouble);
        System.out.println(mensagem);

        int temperaturaFahrenheitInteiro = (int) temperaturaFahrenheitDouble;
        String mensagem2 = String.format("Temperatura Fahrenheit convertida em inteiro %d", temperaturaFahrenheitInteiro);
        System.out.println(mensagem2);
    }
}