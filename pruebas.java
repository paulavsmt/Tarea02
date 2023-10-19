import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

class MyFirstJUnitJupiterTests {

    private final Expendedor c = new Expendedor(5,300) {

    };

    @Test
    void af() {
        Moneda vuelto = c.getVuelto();
    }

}