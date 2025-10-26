public class Podcast extends Audio implements Classificavel{
    private int totalClassificações = 0;

    @Override
    public void classificar(int quantidadeEstrelas) {
        if (quantidadeEstrelas > 5 || quantidadeEstrelas < 0){
            System.out.println("Classifique com um valor entre 0 e 5");
            return;
        }
        totalClassificações++;
        classificacao += quantidadeEstrelas;
        //Mostra média de classificações
        System.out.println("Classificação atual é: " + (classificacao/totalClassificações));
    }

    @Override
    public int getClassificacao() {
        return (classificacao/totalClassificações);
    }
}
