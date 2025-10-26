public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    //O 32 não precisa ter o d porque ele está sendo somado a uma expressão que já é double.
    //Se tirar o d ele descarta o que vem depois da virgula pois ele entende como um expressão inteira
    //Pode-se adicionar o ponto flutuante ao em vez do d
    @Override
    public void celsiusParaFahrenheit(double temperaturaC) {
        System.out.println("°F= " + ((temperaturaC * (9d/5d))+32) + "°");
    }

    @Override
    public void fahrenheitParaCelsius(double temperaturaF) {
        System.out.println("°C= " + ((temperaturaF-32) * (5d/9d)) + "°");
    }
}
