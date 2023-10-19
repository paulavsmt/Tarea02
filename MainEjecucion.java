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

        Expendedor exp = new Expendedor(3,500);
        Moneda m = null;
        Comprador c=null;
        m = new Moneda500();
        c = new Comprador(m,Expendedor.SPRITE,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
        m = new Moneda500();
        c = new Comprador(m,Expendedor.SPRITE,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
        m = new Moneda500();
        c = new Comprador(m,Expendedor.SPRITE,exp);
        System.out.println(c.queBebiste()+", "+c.cuantoVuelto());
    }
}
