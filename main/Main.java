package main;
import lista.Lista;

public class Main{
    public static void main(String[] args){
        Lista lista = new Lista();

        lista.agregar("Ella e callaita");
        lista.agregar("La chona");
        lista.agregar("Me porto bonito");
        lista.agregar("Entregate");
        lista.agregar("Himno Mexicano");

        lista.imprimir();
    }
}   