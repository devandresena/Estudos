public class Musica {
    String titulo = new String();
    String artista = new String();
    int anoLancamento;
    double avaliacao;
    double numAvaliacoes;

    void exibirFichaTecnica() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoLancamento);
    }

    void avaliar(double nota) {
        avaliacao += nota;
        numAvaliacoes++;
    }

    double mediaAvaliacao() {
        return avaliacao / numAvaliacoes;
    }
}
