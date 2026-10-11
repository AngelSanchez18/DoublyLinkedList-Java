package framework;

// Importamos la lista doblemente ligada oficial del framework de Java
import java.util.LinkedList;

public class MainFramework {
    public static void main(String[] args) {
        // Usamos LinkedList del framework de Java
        LinkedList<String> lista = new LinkedList<>();

        lista.add("Ella e callaita");
        lista.add("La chona");
        lista.add("Me porto bonito");
        lista.add("Entregate");
        lista.add("Himno Mexicano");

        // Recorrido e impresión usando el framework
        for (String song : lista) {
            System.out.print(song + " -> ");
        }
        System.out.println("null");
    }
}