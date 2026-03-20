public abstract class Libro{
    
    protected String titulo;
    protected ArrayList<Autor> autores;
    protected String ISBN;
    protected String genero;
    protected String formato;
    protected float valor;
    protected Editorial Editorial;

    public Libro(String titulo, ArrayList<Autor> autores, String ISBN, String genero, String formato, float valor, Editorial Editorial){
        this.titulo = titulo;
        this.autores = autores;
        this.ISBN = ISBN;
        this.genero = genero;
        this.formato = formato;
        this.valor = valor;
        this.Editorial= Editorial;
    }
}