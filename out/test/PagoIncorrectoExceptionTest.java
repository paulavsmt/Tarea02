import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PagoIncorrectoExceptionTest {
    // caso, espendedor valido y..
    //moneda nula, debe devolver la excepcion PagoIncorrectoException
   @Test
   void pr() {
       Expendedor exp = new Expendedor(1);
       Moneda m =null;
       try {

           Comprador c = new Comprador(m, 1, exp);
           Producto cc = exp.comprarProducto(m, 1);
           System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());

       }
       catch (PagoIncorrectoException w){
           System.out.println("Error: "+w.getMessage());

       }

   }
}
