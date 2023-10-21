import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpendedorTest {

    // caso, espendedor valido y..
    Expendedor exp = new Expendedor(1);
    Moneda m = new Moneda1000();
    Comprador c=null;
    @Test
    void comprarProducto() throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        Comprador c = new Comprador(m, 1, exp);
        Producto cc = exp.comprarProducto(m, 1);
        System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());
// dio error? en que?
    }
    @Test
    void getVuelto() {
        System.out.println(exp.getVuelto());

    }
}


// crl+/
