public class CalculadoraSalaRetangular implements CalculoGeometrico{

    public CalculadoraSalaRetangular(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    double altura;
    double largura;
    double area;
    double perimetro;

    @Override
    public double calcularArea() {
        return altura * largura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (altura + largura);
    }
}
