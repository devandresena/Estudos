public class Main {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.setTitulo("Sweet Child O Mine");
        musica.setDuracao("5 min");
        musica.reproduzir();
        //Classificar e curtir
        for (int i = 0; i < 1001; i++) {
            musica.classificar(5);
            if (i % 2 == 0){
                musica.curtir();
            }
        }
        System.out.println("A musica: '" + musica.getTitulo() + "' tem uma avaliação de " + musica.getClassificacao() +
                " estrelas e " + musica.curtidas + " curtidas.");

        Podcast podcast = new Podcast();
        podcast.setTitulo("IA para Devs: Quando melhor dev você é, melhor você guia a IA");
        podcast.setDuracao("1 hora e 25 min");
        podcast.reproduzir();
        podcast.curtir();
        podcast.classificar(5);
        podcast.classificar(4);
        podcast.classificar(3);
        podcast.classificar(2);
        System.out.println("O podcast: '" + podcast.getTitulo() + "' tem uma avaliação de " + podcast.getClassificacao() +
                " estrelas e " + podcast.curtidas + " curtidas.");
    }
}
