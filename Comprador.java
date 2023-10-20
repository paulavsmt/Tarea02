class Comprador{
    private String sonido;
    private int vuelto;

    public Comprador(Moneda m, int queProducto, Expendedor exp)
    throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        Producto compra = exp.comprarProducto(m,queProducto);
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

    public void setVuelto(int vuelto){
        this.vuelto=vuelto;
    }

    public int cuantoVuelto(){
        //System.out.println(vuelto);
        return vuelto;
    }

    public String queBebiste(){
        return sonido;
    }

}
