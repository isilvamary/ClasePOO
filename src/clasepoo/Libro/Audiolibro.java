public class Audiolibro extends Libro{
    private int duracion;
    private Narrador Narrador;

    public Audiolibro(String titulo, ArrayList<Autor> autores, String ISBN, String genero, String formato, float valor, Editorial Editorial, int duracion, Narrador Narrador){
        super(titulo, autores, ISBN, genero, formato, valor, Editorial);
        this.duracion = duracion;
        this.Narrador = Narrador;
    }
}