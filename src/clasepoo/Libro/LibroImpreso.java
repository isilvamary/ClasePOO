public class LibroImpreso extends Libro{
    private int paginas;
    private int numeroEjemplares;

    public LibroImpreso(String titulo, ArrayList<Autor> autores, String ISBN, String genero, String formato, float valor, Editorial Editorial, int paginas, int numeroEjemplares){
        super(titulo, autores, ISBN, genero, formato, valor, Editorial);
        this.paginas = paginas;
        this.numeroEjemplares = numeroEjemplares;
    }
}