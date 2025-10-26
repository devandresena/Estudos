public class ConversorMoeda implements ConversaoFinanceira{
    double valorRealDolar = 5.10;
    double totalReal;

    @Override
    public double converterDolarParaReal(double totalDolar) {
        totalReal = valorRealDolar * totalDolar;
        return totalReal;
    }
}
