//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Crie uma classe Pessoa com um método que exibe "Olá, mundo!" no console.
        Pessoa pessoa = new Pessoa();
        pessoa.imprimirOlaMundo();

        //Crie uma classe Calculadora com um método que recebe um número como parâmetro e retorna o dobro desse número.
        Calculadora calculadora = new Calculadora();
        double dobro;
        dobro = calculadora.calcularDobro(12.9);
        System.out.println(dobro);

        //Crie uma classe Musica com atributos titulo, artista, anoLancamento,
        // avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a música e
        // calcular a média de avaliações.
        Musica musica = new Musica();
        double media;
        musica.artista = "Coldplay";
        musica.titulo = "Viva La Vida";
        musica.anoLancamento = 2010;
        musica.avaliar(9.5);
        musica.avaliar(8.5);
        musica.avaliar(7.7);
        media = musica.mediaAvaliacao();
        System.out.println(media);
        //Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a
        // ficha técnica e calcular a idade do carro.
        Carro carro = new Carro();
        carro.modelo = "Corsa";
        carro.ano = 2005;
        carro.cor = "Prata";

        carro.exibirFichaTecnica();
        System.out.println("A idade do carro é " + carro.calcularIdadeCarro(2025) + " anos");

        //Crie uma classe Aluno com atributos nome, idade, e um método para exibir informações.
        // Crie uma instância da classe Aluno, atribua valores aos seus atributos e utilize o
        // método para exibir as informações.
        Aluno aluno = new Aluno();
        aluno.nome = "André";
        aluno.idade = 35;
        aluno.exibirDadosAluno();
    }
}
