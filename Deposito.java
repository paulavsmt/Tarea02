import java.util.ArrayList;
/**
 * Clase Deposito, es la encargada de almacenar las monedas, bebidas y dulces en el Expendedor
 * @param <E> objeto generico que sera determinado y contenido en el expendedor
 */
class Deposito<E> {
    /**
     * Arraylist con elemento generico <E>
     */
    private ArrayList<E> Lista;

    /**
     * Constructor
     */

    public Deposito(){
        Lista = new ArrayList<E>();
    }

    /**
     * Metodo para obtener un objeto del deposito, si no tiene objetos retorna null
     */

    public E get(){
        if(Lista.size()!=0){
            return Lista.remove(0);
        } else {
            return null;
        }
    }

    /**
     * Metodo para agregar elementos <E> al deposito
     */

    public void add(E bob){
        Lista.add(bob);
    }

    /**
     * Metodo encargado de comprobar que el deposito esta vacio.
     */

    public int chequear(){
        return Lista.size();
    }
}

