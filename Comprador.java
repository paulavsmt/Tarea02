class Comprador{
    private String sonido;
    private int vuelto;

    public Comprador(Moneda m, int cualBebida, Expendedor exp){
        Producto compra = exp.comprarBebida(m,cualBebida);
        if (m!=null&& (cualBebida==1||cualBebida==2||cualBebida==3||cualBebida==4||cualBebida==5) && compra!=null) {

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
