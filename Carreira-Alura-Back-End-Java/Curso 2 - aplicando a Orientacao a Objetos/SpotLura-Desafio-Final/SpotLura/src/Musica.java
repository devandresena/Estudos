public class Musica extends Audio implements Classificavel{
    private int quantidadeNotaMaxima  = 0;
    private int totalClassificações = 0;
    @Override
    public void classificar(int quantidadeEstrelas) {
        if (quantidadeEstrelas == 5){
            quantidadeNotaMaxima++;
            totalClassificações++;
        }

        if (quantidadeNotaMaxima > 1000){
            classificacao = 5;
        } else if (quantidadeNotaMaxima > 500){
            classificacao = 4;
        } else if (quantidadeNotaMaxima > 300){
            classificacao = 3;
        } else if (quantidadeNotaMaxima >= 200){
            classificacao = 2;
        } else {
            classificacao = 1;
        }
    }
}
