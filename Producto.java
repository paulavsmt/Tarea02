abstract class Producto{
    private final int serie;

    public Producto(int serie) {
        this.serie= serie;
    }

    public int getSerie() {
        return serie;
    }

}
abstract class Dulce extends Producto{
    public Dulce(int serie) {
        super(serie);
    }
    public abstract String comer();
}
class Snikers extends Dulce{
    public Snikers(int serie) {
        super(serie);
    }

    @Override
    public String comer() {
        return "Snikers";
    }
}
class Super8 extends Dulce{
    public Super8(int serie) {
        super(serie);
    }

    @Override
    public String comer() {
        return "Super8";
    }
}
abstract class Bebida extends Producto{


    public Bebida(int serie) {
        super(serie);
    }

    public abstract String beber();

}
class CocaCola extends Bebida{
    public CocaCola(int ser){
        super(ser);
    }
    public String beber(){
        return "cocacola";
    }
}
class Fanta extends Bebida{
    public Fanta(int ser){
        super(ser);
    }
    public String beber(){
        return "Fanta";
    }
}

class Sprite extends Bebida{
    public Sprite(int ser){
        super(ser);
    }
    public String beber(){
        return "sprite";
    }
}

