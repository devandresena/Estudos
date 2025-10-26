public class Produto {
    private String nome = new String();
    private double preco;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double aplicarDesconto(double percentualDesconto){
        return preco - ((preco / 100) * percentualDesconto);
    }
}
