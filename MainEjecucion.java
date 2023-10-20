import java.util.ArrayList;
// hare pruebas de ejecucion aca en lo que aprendo junit
public class MainEjecucion {

    // Cosas importantes wue faltan:
    // * que devuelva la moneda directamente cuando no pueda comprar (que no la sencille)
    // * agregar excepciones ())
    // - que excepciones devuelvan la plata (y españa el oro)

    public static void main(String[] args) {

        // try y catch van aca!!!!

        // caso, espendedor valido y..
        Expendedor exp = new Expendedor(1);
        Moneda m = null;
        Comprador c=null;

        try {

            //moneda nula, debe devolver la excepcion PagoIncorrectoException [null,0]
//            m = null;
//            c = new Comprador(m, 1, exp);
//            System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());

            //moneda valida, precio justo (cocacola, 500) [cocacola,0]
//            m = new Moneda500();
//            c = new Comprador(m, 1, exp);
//            System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());

            //moneda valida, poca plata (Sprite,2000) [PagoInsuficienteException, null, 1000]
//            m = new Moneda1000();
//            c = new Comprador(m, 5, exp);
//            System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());

            // moneda valida, sobra plata (fanta, 600) [fanta, 400]
            m = new Moneda1000();
            c = new Comprador(m, 3, exp);
            System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());

            // moneda valida, producto no existente [NoHayProductoException, null, 1000]
//            m = new Moneda1000();
//            c = new Comprador(m, 7, exp);
//            System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());

            // moneda valida, sobra plata, pero no queda producto (fanta, 600) [null, 1000]
            m = new Moneda1000();
            c = new Comprador(m, 3, exp);
            System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());

        } catch (NoHayProductoException q){
            System.out.println("Error: "+q.getMessage());

        } catch (PagoIncorrectoException w){
            System.out.println("Error: "+w.getMessage());

        } catch (PagoInsuficienteException e){
            System.out.println("Error: "+e.getMessage());

        }

    }
}
