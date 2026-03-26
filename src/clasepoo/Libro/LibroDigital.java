import java.util.ArrayList;

public class LibroDigital extends Libro{
    private boolean hasHipervinculo;
    private ArrayList<String> hipervinculos;

    public LibroDigital(String titulo, ArrayList<Autor> autores, String ISBN, String genero, String formato, float valor, Editorial Editorial, boolean hasHipervinculo, ArrayList<String> hipervinculos){
        super(titulo, autores, ISBN, genero, formato, valor, Editorial);
        this.hasHipervinculo = hasHipervinculo;
        this.hipervinculos = hipervinculos;
    }
}