class Comprador{
    private String sonido;
    private int vuelto;


    // en int cual producto debe ir un numero del 1 a 5 (sacado del enum(el cual CREO
    // debe estar en el expendedor))

    public Comprador(Moneda m, int cualProducto, Expendedor exp){
        Producto compra = exp.comprarBebida(m,cualProducto);
        if (m!=null&& (cualProducto==1||cualProducto==2||cualProducto==3||cualProducto==4||cualProducto==5) && compra!=null) {

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
            while(true) {
                try {
                    vuelto = vuelto + exp.getVuelto().getValor();
                } catch (Exception a) {
                    break;
                }
            }
        } else if (m==null) {
            sonido =null;
            vuelto = 0;
        }
    }

    public int cuantoVuelto(){
        return vuelto;
    }

    public String queBebiste(){
        return sonido;
    }

}
