import java.util.ArrayList;

class Deposito<E> {
    private ArrayList<E> Lista;

    public Deposito(){
        Lista = new ArrayList<E>();
    }

    public E get(){
        if(Lista.size()!=0){
            return Lista.remove(0);
        } else {
            return null;
        }
    }
    public void add(E bob){
        Lista.add(bob);
    }

    public int chequear(){
        return Lista.size();
    }
}

