/**
 * Clase abstracta moneda, sirve para crear las que tienen valor definido.
 */

abstract class Moneda{
    /**
     * Constructor de la clase asbtracta
     */
    public Moneda(){
    }

    /**
     * Lector de serie de la moneda
     */
    public Moneda getSerie(){
        return this;
    }
    /**
     * Metodo abstracto que retorna el valor de la moneda
     */
    public abstract int getValor();
}
/**
 * Clase hija de Moneda, esta tiene un valor de 100
 */
class Moneda100 extends Moneda{
    public Moneda100(){
        super();
    }
    public int getValor(){
        return 100;
    }
}

class Moneda500 extends Moneda{
    public Moneda500(){
        super();
    }
    public int getValor(){
        return 500;
    }
}

class Moneda1000 extends Moneda{
    public Moneda1000(){
        super();
    }
    public int getValor(){
        return 1000;
    }
}
