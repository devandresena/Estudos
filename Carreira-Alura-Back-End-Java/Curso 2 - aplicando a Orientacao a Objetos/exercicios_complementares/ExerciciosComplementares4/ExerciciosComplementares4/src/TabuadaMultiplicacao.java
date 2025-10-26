public class TabuadaMultiplicacao implements Tabuada{

    @Override
    public void mostrarTabuada(int numero) {
        for (int i = 0; i < 10; i++) {
            System.out.println(numero + " * " + (i+1) + " = " + ((i+1)*numero));
        }
    }
}
