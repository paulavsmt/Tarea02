import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpendedorTest {

    // caso, espendedor valido y..


    Comprador c=null;
    @Test
    void test1() throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        Moneda m = new Moneda1000();
        Expendedor exp = new Expendedor(1);
        Comprador c = new Comprador(m, 1, exp);

        System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());
    }
    @Test
    void test2() throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException{
        try {
            Moneda m = new Moneda1000();
            Expendedor exp = new Expendedor(1);
            Comprador c = new Comprador(m, 2, exp);
            System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());
        } catch (PagoInsuficienteException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    @Test
    void test3() throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException{
        try {
            Moneda m = null;
            Expendedor exp = new Expendedor(1);
            Comprador c = new Comprador(m, 2, exp);
            System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());
        } catch (PagoIncorrectoException w){
            System.out.println("Error: " + w.getMessage());
        }
    }

    @Test
    void test4() throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException{
        try {
            Moneda m = new Moneda500();
            Expendedor exp = new Expendedor(1);
            Comprador c = new Comprador(m, 5, exp);
            System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());
        } catch (PagoIncorrectoException w){
            System.out.println("Error: " + w.getMessage());
        }
    }
    @Test
    void test5() throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException{
        try {
            Moneda m = new Moneda500();
            Expendedor exp = new Expendedor(1);
            Comprador c = new Comprador(m, 7, exp);
            System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());
        } catch (NoHayProductoException q) {
        System.out.println("Error: " + q.getMessage());
        }
    }
    @Test
    void test6() throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException{
        try {
            Moneda m = new Moneda1000();
            Expendedor exp = new Expendedor(0);
            Comprador c = new Comprador(m, 5, exp);
            System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());
        } catch (NoHayProductoException q) {
            System.out.println("Error: " + q.getMessage());
        }
    }
    void test7() throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException{
        try {
            Expendedor exp = new Expendedor(1);

            Moneda m = new Moneda1000();
            Comprador c = new Comprador(m, 5, exp);
            System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());

            Moneda m = new Moneda1000();
            Comprador c = new Comprador(m, 5, exp);
            System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());
        } catch (NoHayProductoException q) {
            System.out.println("Error: " + q.getMessage());
        }
    }


}
