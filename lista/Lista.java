package lista;

public class Lista{
    private Nodo inicial;

    public void agregar(String song){
        //Si inicial se encuentra vacio se agrega al inicio
        if(inicial == null){
            inicial = new Nodo(song);
            return; 
        }
        /* Si no, el nodo temporal llega hasta donde no se asi 
        y agrega la cancion */
        Nodo temp = inicial;
        while(temp.siguiente != null){
            temp = temp.siguiente;
        }

        Nodo temp2 = temp.siguiente;
        temp2 = new Nodo(song);
        temp2.anterior = temp;
        temp.siguiente = temp2;
    }

    public void imprimir(){
        Nodo temp = inicial;
        while(temp != null){
            System.out.print(temp.song + " -> ");
            temp = temp.siguiente;
        }
        System.out.println("null");
    }
}