public class PagoIncorrectoException extends Exception {

    public PagoIncorrectoException() {
        super("Excepcion de pago incorrecto");
    }

    public PagoIncorrectoException(String mensaje) {
        super(mensaje);
    }
}

// excepcion si la moneda es null