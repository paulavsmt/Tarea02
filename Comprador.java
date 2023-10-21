/**
 * Clase donde se realiza el proceso de compra
 */

class Comprador{
    private String sonido;
    private int vuelto;

    /**
     * El constructor del comprador recibe los siguientes parametros:
     * @param m es la moneda con la que comprara el producto.
     * @param queProducto es la id del producto.
     * @param exp es un objeto expendedor donde se hara la compra.
     * @throws NoHayProductoException esta excepcion se activa si el numero de id no existe o no queda de dicho producto en el deposito.
     * @throws PagoInsuficienteException esta excepcion se lanza si el valor de la moneda no alcanza para poder comprar el porducto.
     * @throws PagoIncorrectoException esta excepcion se activa si la moneda es nula, dicho de otra forma si trata de comprar con "nada".
     *
     */

    public Comprador(Moneda m, int queProducto, Expendedor exp)
    throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {

        Producto compra = exp.comprarProducto(m,queProducto);
        /**
         * En el caso que la compra tenga una moneda valida, un id de producto valido y no sea nula, devolvera el vuelto (si es que hay) en monedas de 100 y diciendo que comio/bebio.
         * En caso de que la compra sea nula y tengamos una moneda valida, simplemente devolvera la misma moneda como vuelto y arrojara la excepcion PagoInsuficienteException.
         * En ultima instacia, si ademas la moneda es nula, no devolvera nada
         */
        if (m!=null&& (queProducto==1||queProducto==2||queProducto==3||queProducto==4||queProducto==5) && compra!=null) {

            sonido = compra.bebercomer();
            while (true) {
                try {
                    vuelto = vuelto + exp.getVuelto().getValor();
                } catch (Exception a) {
                    break;
                }
            }

        } else if (compra==null && m!=null) {
            sonido = null;
            vuelto = m.getValor();
            throw new PagoInsuficienteException("PagoInsuficienteException, El precio del producto es mayor al valor de la moneda");

        } else if (m==null) {
            sonido =null;
            vuelto = 0;
        }
    }


    /**
     * Setter de vuelto
     */
    public void setVuelto(int vuelto){
        this.vuelto=vuelto;
    }

    /**
     * Metodo que retorna vuelto cuando sea pedido
     */
    public int cuantoVuelto(){
        //System.out.println(vuelto);
        return vuelto;
    }

    /**
     * Metodo que retorna el "sonido" de lo que compraste en caso de hacer una compra valida y null en caso contrario
     */

    public String queBebiste(){
        return sonido;
    }

}
