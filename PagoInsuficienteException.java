public class PagoInsuficienteException extends Exception {

    public PagoInsuficienteException() {
        super("Esta es una excepción personalizada");
    }

    public PagoInsuficienteException(String mensaje) {
        super(mensaje);
    }
}