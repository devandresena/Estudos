public class Livro {
    String titulo;
    String autor;
    Editora editora;

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", editora=" + editora +
                '}';
    }
}
