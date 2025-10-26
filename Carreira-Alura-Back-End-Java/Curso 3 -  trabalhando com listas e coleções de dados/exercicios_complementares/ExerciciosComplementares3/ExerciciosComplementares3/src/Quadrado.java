public class Quadrado implements Forma{
    double comprimento = 0;

    public Quadrado(double comprimento) {
        this.comprimento = comprimento;
    }


    @Override
    public double calcularArea() {
        return comprimento * comprimento;
    }
}
