public class NoHayProductoException extends Exception {

    public NoHayProductoException() {
        super("Excepcion al seleccionar un producto que no hay/queda");
    }

    public NoHayProductoException(String mensaje) {
        super(mensaje);
    }



}