public class Aluno {
    private String nome = new String();
    private double notas;
    private int quatidadeDeNota;

    public String getNome() {
        return nome;
    }

    public double getNotas() {
        return notas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNotas(double notas) {
        this.notas += notas;
        quatidadeDeNota++;
    }

    public double calcularMedia (){
        return notas / quatidadeDeNota;
    }
}
