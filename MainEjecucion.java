import java.util.ArrayList;
// hare pruebas de ejecucion aca en lo que aprendo junit
public class MainEjecucion {

    // Cosas importantes wue faltan:
    // - que devuelva la moneda directamente cuando no pueda comprar (que no la sencille)
    // - agregar excepciones ())



    public static void main(String[] args) {

        // caso, espendedor valido y..
        Expendedor exp = new Expendedor(1);
        Moneda m = null;
        Comprador c=null;

        //moneda nula, debe devolver la excepcion PagoIncorrectoException
        m = null;
        c = new Comprador(m,1,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());

        //moneda valida, precio justo (cocacola, 500)
        m = new Moneda500();
        c = new Comprador(m,1,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());

        //moneda valida, poca plata (Sprite,2000)
        m = new Moneda1000();
        c = new Comprador(m,2,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());

        // moneda valida, sobra plata (fanta, 600)
        m = new Moneda1000();
        c = new Comprador(m,3,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());

        // moneda valida, producto no existente
        m = new Moneda1000();
        c = new Comprador(m,7,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());

        // moneda valida, sobra plata, pero no queda producto (fanta, 600)
        m = new Moneda1000();
        c = new Comprador(m,3,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());

    }
}
