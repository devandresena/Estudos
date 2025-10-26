public class Carro {
    private String nomeModelo;
    private double precoMedioAno1;
    private double precoMedioAno2;
    private double precoMedioAno3;

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public void setPrecoMedioAno1(double precoMedioAno1) {
        this.precoMedioAno1 = precoMedioAno1;
    }

    public void setPrecoMedioAno2(double precoMedioAno2) {
        this.precoMedioAno2 = precoMedioAno2;
    }

    public void setPrecoMedioAno3(double precoMedioAno3) {
        this.precoMedioAno3 = precoMedioAno3;
    }

    public void menorPreco() {
        if (precoMedioAno1 < precoMedioAno2 && precoMedioAno1 < precoMedioAno3) {
            System.out.println("O menor preço é: R$" + precoMedioAno1);
        } else if (precoMedioAno2 < precoMedioAno3) {
            System.out.println("O menor preço é: R$" + precoMedioAno2);
        } else {
            System.out.println("O menor preço é: R$" + precoMedioAno3);
        }
    }

    public void maiorPreco() {
        if (precoMedioAno1 > precoMedioAno2 && precoMedioAno1 > precoMedioAno3) {
            System.out.println("O maior preço é: R$" + precoMedioAno1);
        } else if (precoMedioAno2 > precoMedioAno3) {
            System.out.println("O maior preço é: R$" + precoMedioAno2);
        } else {
            System.out.println("O maior preço é: R$" + precoMedioAno3);
        }
    }
}
