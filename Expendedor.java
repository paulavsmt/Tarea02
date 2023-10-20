class Expendedor{
    private Deposito<Bebida> coca= new Deposito<>();
    private Deposito<Bebida> sprite= new Deposito<>();
    private Deposito<Bebida> fanta= new Deposito<>();
    private Deposito<Dulce> super8= new Deposito<>();
    private Deposito<Dulce> snikers= new Deposito<>();
    private Deposito<Moneda> monVu= new Deposito<>();
    public enum product{
        COCA(1,500),
        SPRITE(2,2000),
        FANTA(3,600),
        SUPER8(4,700),
        SNIKERS(5,2000);

        private final int presio;
        private final int id;

        product(int i, int precio) {
            this.id=i;
            this.presio=precio;
        }

        public int getPresio() {
            return presio;
        }

        public int getId() {
            return id;
        }
    }

    //private int presio;
    private int numbeb;
    public Expendedor(int numBebidas){

        numbeb = numBebidas;

        for (int i =0;i<numbeb;i=i+1){
            coca.add(new CocaCola(1*i));
            sprite.add(new Sprite(2*i));
            fanta.add(new Fanta(3*i));
            super8.add(new Super8(4*i));
            snikers.add(new Snikers(5*i));
        }
    }
    public Producto comprarProducto(Moneda m, int prod)
            throws NoHayProductoException,PagoIncorrectoException,PagoInsuficienteException {
        //los trow van aca!!!
        if (m!=null) {
            switch (prod) {
                case 1: {
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
                    } else if (snikers.chequear()==0) {
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

        } else {
            throw new PagoIncorrectoException();
        }
    }

    public Moneda getVuelto(){
        return monVu.get();
    }
}
