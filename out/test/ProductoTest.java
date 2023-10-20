import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductoTest {

    @Test
    void getSerie() {
        Bebida b=new Fanta(10000001);
        int bb= b.getSerie();
        System.out.print(bb);

    }
}