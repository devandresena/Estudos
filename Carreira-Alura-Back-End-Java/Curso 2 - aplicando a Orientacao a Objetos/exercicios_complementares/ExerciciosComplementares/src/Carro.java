public class Carro {
    int ano;
    String modelo = new String();
    String cor = new String();

    void exibirFichaTecnica() {
        System.out.println("Ano: " + ano);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
    }

    int calcularIdadeCarro(int anoAtual) {
        return anoAtual - ano;
    }
}
