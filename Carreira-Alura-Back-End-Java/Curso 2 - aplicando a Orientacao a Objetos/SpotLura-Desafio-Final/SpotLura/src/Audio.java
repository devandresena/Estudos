public class Audio{
    String titulo;
    String duracao;
    int totalReproducoes = 0;
    int curtidas = 0;
    int classificacao;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDuracao() {
        return duracao;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curtir (){
        curtidas++;
        System.out.println("Obrigado por sua curtida!");
    }

    public void reproduzir(){
        totalReproducoes++;
        System.out.println("Reproduzindo");
    }
}
