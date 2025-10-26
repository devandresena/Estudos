public class IdadePessoa {
    private String nome = new String();
    private int idade;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificarIdade(){
        if(idade >= 18){
            System.out.println("Pessoa é maior de idade");
        } else{
            System.out.println("Pessoa não é maior de idade");
        }
    }
}
