/**
 *  Clase Producto: crea productos jfbkjbkdfbkvbkdfj
 *
 */
abstract class Producto{
    private final int serie;

    /**
     *
     * @param serie: almacena el numero de serie de el producto
     */
    public Producto(int serie) {
        this.serie= serie;
    }

    public int getSerie() {
        return serie;
    }

    public abstract String bebercomer();
    /**
     * costructor de producto
     *
     * getter de serie
     *
     * metodo abstracto bebercomer
     */
}

/**
 * Dulce: subclase de producto
 */
abstract class Dulce extends Producto{
    public Dulce(int serie) {
        super(serie);
    }
}
class Snikers extends Dulce{
    public Snikers(int ser) {
        super(ser);
    }

    @Override
    public String bebercomer() {
        return "Snikers";
    }
}
class Super8 extends Dulce{
    public Super8(int ser) {
        super(ser);
    }

    @Override
    public String bebercomer() {
        return "Super8";
    }
}

/**
 *  bebida: subclase de Producto
 */
abstract class Bebida extends Producto{

    public Bebida(int serie) {
        super(serie);
    }


}
class CocaCola extends Bebida{
    public CocaCola(int ser){
        super(ser);
    }
    public String bebercomer(){
        return "cocacola";
    }
}
class Fanta extends Bebida{
    public Fanta(int ser){
        super(ser);
    }
    public String bebercomer(){
        return "Fanta";
    }
}

class Sprite extends Bebida{
    public Sprite(int ser){
        super(ser);
    }
    public String bebercomer(){
        return "sprite";
    }
}
/**
 *  metodo bebercomer: se encarga de retornar un string con el nombre de el producto,
 *  en cada una de las subclases que lo sobreescriben.
 *
 * cada clase tambien tiene su cunstructor
 */


