package Q1;

public class Livro {
    private String titulo;
    private String autor;
    private String editora;
    private int numPaginas;
    private double preco;
    public Livro(){

    }
    public Livro(String titulo, String autor, String editora, int numPaginas, double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.numPaginas = numPaginas;
        this.preco = preco;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getEditora() {
        return editora;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
}
