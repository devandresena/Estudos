public class Livro {
    private String titulo = new String();
    private String autor = new String();

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void exibirDetalhes(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
    }
}
