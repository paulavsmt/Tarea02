
/**
 * El expendedor donde se lleva a cabo el proceso de compra.
 *
 */
class Expendedor{

    /**
     * Lo primero es inializar los depositos, crea uno para cada tipo de producto y uno para las monedas (monVu)
     */
    private Deposito<Bebida> coca= new Deposito<>();
    private Deposito<Bebida> sprite= new Deposito<>();
    private Deposito<Bebida> fanta= new Deposito<>();
    private Deposito<Dulce> super8= new Deposito<>();
    private Deposito<Dulce> snikers= new Deposito<>();
    private Deposito<Moneda> monVu= new Deposito<>();

    /**
     * Enumeracion que le da a cada tipo de producto un id "general" para poder seleccionarlo numericamente en el expendedor, y al lado su precio distinto para cada producto)
     */
    public enum product{
        COCA(1,300),
        SPRITE(2,2000),
        FANTA(3,600),
        SUPER8(4,700),
        SNIKERS(5,500);

        private final int presio;
        private final int id;

        /**
         * @param i es la id del producto.
         * @param precio es el precio del producto
         */

        product(int i, int precio) {
            this.id=i;
            this.presio=precio;
        }

        /**
         * getter de precio.
         */
        public int getPresio() {
            return presio;
        }

        public int getId() {
            return id;
        }
    }

    //private int presio;
    private int numbeb;

    /**
     * Constructor del Expendedor, solo recibe un parametro
     * @param numBebidas este parametro indica el numero de cada producto con que seran llenados los depositos.
     */
    public Expendedor(int numBebidas){

        numbeb = numBebidas;

        /**
         * comando for que llena los contenedores con la cantidad de productos pedido.
         */

        for (int i =0;i<numbeb;i=i+1){
            coca.add(new CocaCola(1*i));
            sprite.add(new Sprite(2*i));
            fanta.add(new Fanta(3*i));
            super8.add(new Super8(4*i));
            snikers.add(new Snikers(5*i));
        }

    }

    /**
     *
     * @param m moneda con la que se hara el proceso de compra.
     * @param prod id del producto.
     * @throws NoHayProductoException
     * @throws PagoIncorrectoException este error se disparará cuando encuentre una moneda que no es valida.
     */


    public Producto comprarProducto(Moneda m, int prod)
            throws NoHayProductoException,PagoIncorrectoException {
        //los trow van aca!!!
        /**
         *En caso que la moneda sea nula lanzara la excepcion PagoIncorrectoException, de no ser asi parará al cuerpo pincipal del expendedor donde se hara el proceso de compra.
         */
        if (m!=null) {

            /**
             * Este switch se encarga de recibir los numeros de id del producto que se trata de comprar, en caso de tomar un numero que no esta en las opciones, lanzara la excepcion NoHayProductoException.
             */
            switch (prod) {
                case 1: {

                    /**
                     * En caso de tomar un numero valido, pasara a esta estructura if/else donde se comparará que
                     * el valor de la moneda es mayor o igual al precio del producto y se revisara que el contenedor no este vacio, de cumplirse ambas condiciones ejecutara la compra
                     * y devolvera el vuelto en monedas de 100.
                     *
                     * En caso que una de las condiciones no se cumpla, lo mas probable es que el contenedor este vacio, de ser asi devolvera la moneda
                     * y lanzara la excepcion NoHayProductoException.
                     *
                     * En ultima instancia solo queda la situacion que el dinero no alcance para la venta, por lo que anulara la compra y devolvera el dinero.
                     */

                    if (m.getValor() >= product.COCA.getPresio() && coca.chequear() != 0) {
                        for (int i = 1; i <= (m.getValor() - product.COCA.getPresio()) / 100; i = i + 1) {
                            monVu.add(new Moneda100());
                        }
                        return coca.get();

                    } else if (coca.chequear()==0) {
                        monVu.add(m);
                        throw new NoHayProductoException("NoHayProductoException, No queda producto, o n invalido");
                    }else {
                        monVu.add(m);
                        return null;

                    }

                }
                case 2: {
                    if (m.getValor() >= product.SPRITE.getPresio() && sprite.chequear() != 0) {
                        for (int i = 1; i <= (m.getValor() - product.SPRITE.getPresio()) / 100; i = i + 1) {
                            monVu.add(new Moneda100());
                        }
                        return sprite.get();

                    } else if (sprite.chequear()==0) {
                        monVu.add(m);
                        throw new NoHayProductoException("NoHayProductoException, No queda producto, o n invalido");

                    } else {
                        monVu.add(m);
                        return null;
                    }
                }
                case 3: {
                    if (m.getValor() >= product.FANTA.getPresio() && fanta.chequear() != 0) {
                        for (int i = 1; i <= (m.getValor() - product.FANTA.getPresio()) / 100; i = i + 1) {
                            monVu.add(new Moneda100());
                        }
                        return fanta.get();
                    } else if (fanta.chequear()==0) {

                        monVu.add(m);
                        throw new NoHayProductoException("NoHayProductoException, No queda producto, o n invalido");

                    } else {
                        monVu.add(m);
                        return null;
                    }
                }
                case 4: {
                    if (m.getValor() >= product.SUPER8.getPresio() && super8.chequear() != 0) {
                        for (int i = 1; i <= (m.getValor() - product.SUPER8.getPresio()) / 100; i = i + 1) {
                            monVu.add(new Moneda100());
                        }
                        return super8.get();
                    } else if (super8.chequear()==0) {
                        monVu.add(m);
                        throw new NoHayProductoException("NoHayProductoException, No queda producto, o n invalido");

                    }else {
                        monVu.add(m);
                        return null;
                    }
                }
                case 5: {
                    if (m.getValor() >= product.SNIKERS.getPresio() && snikers.chequear() != 0) {
                        for (int i = 1; i <= (m.getValor() - product.SNIKERS.getPresio()) / 100; i = i + 1) {
                            monVu.add(new Moneda100());
                        }
                        return snikers.get();

                    } else if (snikers.chequear()==0) { //caso moneda valida, pero cont vacio
                        monVu.add(m);
                        throw new NoHayProductoException("NoHayProductoException, No queda producto, o n invalido");

                    } else { //caso moneda valida, pero mucho precio
                        monVu.add(m);
                        return null;
                    }
                }
                // caso moneda valida, id mala
                default: {
                    monVu.add(m);
                    throw new NoHayProductoException("NoHayProductoException, No queda producto, o n invalido");
                    //return null;
                }

            }

        } else { //caso moneda mala
            throw new PagoIncorrectoException();
        }
    }

    public Moneda getVuelto(){
        return monVu.get();
    }
}
