public class NoHayProductoException extends Exception {

    public NoHayProductoException() {
        super("Excepcion al seleccionar un producto que no existe");
    }

    public NoHayProductoException(String mensaje) {
        super(mensaje);
    }
}