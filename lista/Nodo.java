package lista;

public class Nodo{
    public String song;
    public Nodo siguiente;
    public Nodo anterior;

    public Nodo(String song){
        this.song = song;
        siguiente = null;
        anterior = null;
    }
}
