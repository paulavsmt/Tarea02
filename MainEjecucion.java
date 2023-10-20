import java.util.ArrayList;
// hare pruebas de ejecucion aca en lo que aprendo junit
public class MainEjecucion {
    public static void main(String[] args) {
//        Expendedor exp = new Expendedor(3,500);
//        Moneda m = null;
//        Comprador c=null;
//        m = new Moneda1500();
//        c = new Comprador(m,Expendedor.SPRITE,exp);
//        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
//        m = new Moneda1500();
//        c = new Comprador(m,Expendedor.SPRITE,exp);
//        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
//        m = new Moneda1500();
//        c = new Comprador(m,Expendedor.SPRITE,exp);
//        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());

        // caso, espendedor valido y..
        Expendedor exp = new Expendedor(2,100);
        Moneda m = null;
        Comprador c=null;

        //moneda nula, debe devolver la excepcion PagoIncorrectoException
        m = null;
        c = new Comprador(m,Expendedor.SPRITE,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());

        m = new Moneda500();
        c = new Comprador(m,Expendedor.SPRITE,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());

        m = new Moneda1000();
        c = new Comprador(m,Expendedor.SPRITE,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());

        m = new Moneda1000();
        c = new Comprador(m,Expendedor.SPRITE,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());

        m = new Moneda1000();
        c = new Comprador(m,Expendedor.SUPER8,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
    }
}
