/**
 *  Clase Producto: es la  clase encargada de crear
 */
abstract class Producto{
    private final int serie;

    public Producto(int serie) {
        this.serie= serie;
    }

    public int getSerie() {
        return serie;
    }

    public abstract String bebercomer();
}
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

