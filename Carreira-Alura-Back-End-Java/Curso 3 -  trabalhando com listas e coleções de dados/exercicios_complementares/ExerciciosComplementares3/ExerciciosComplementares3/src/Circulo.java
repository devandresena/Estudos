public class Circulo implements Forma{
    double pi = 3.1416;
    double raio = 0;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return (pi * (raio * raio));
    }
}
