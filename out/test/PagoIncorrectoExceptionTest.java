import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PagoIncorrectoExceptionTest {
    // caso, espendedor valido y..
    //moneda nula, debe devolver la excepcion PagoIncorrectoException
   @Test
   void pr() {

        Expendedor exp = new Expendedor(1);
        Moneda m = null;
        Comprador c=null;
        m = null;
        c = new Comprador(m, 1, exp);
        exp.comprarProducto(,2)
        System.out.println(c.queBebiste() + ", " + c.cuantoVuelto());
    }
}

// o sea, tengo esto aca por que habia que definir las excepciones con su mensaje, no [ara los test
// no se si se entiende(?)
// jhhjjhjhjhf que entretenido hablar asi
// dhfkjsdhfjk si
// ni idea, lo estamos viendo, pero van en el main los try y los que gatillan las excepciones(trow) en el
// metodo comprarProducto
//



// error mio, crei que estabas el el .java, no en el test, como tengo varias class abiertas no vi la extension
// siga con lo suyo xD