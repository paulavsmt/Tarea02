class Expendedor{
    private Deposito<Bebida> coca= new Deposito<>();
    private Deposito<Bebida> sprite= new Deposito<>();
    private Deposito<Bebida> fanta= new Deposito<>();
    private Deposito<Dulce> super8= new Deposito<>();
    private Deposito<Dulce> snikers= new Deposito<>();
    private Deposito<Moneda> monVu= new Deposito<>();

    public static final int  COCA=1;
    public static final int  SPRITE=2;
    public static final int FANTA=3;
    public static final int SUPER8=4;
    public static final int SNIKERS=5;

    private int presio;
    private int numbeb;
    public Expendedor(int numBebidas, int precioBebidas){
        presio = precioBebidas;
        numbeb = numBebidas;

        for (int i =0;i<numbeb;i=i+1){
            coca.add(new CocaCola(1*i));
            sprite.add(new Sprite(2*i));
            fanta.add(new Fanta(3*i));
            super8.add(new Super8(4*i));
            snikers.add(new Snikers(5*i));
        }
    }
    public Producto comprarBebida(Moneda m, int cual){
        try {
            switch (cual) {
                case COCA: {
                    if (m.getValor() >= presio && coca.chequear()!=0) {
                        for (int i = 1; i <= (m.getValor() - presio) / 100; i = i + 1) {
                            monVu.add(new Moneda100());
                        }
                        return coca.get();
                    } else {
                        for (int i = 100; i <= m.getValor(); i = i + 100) {
                            monVu.add(new Moneda100());
                        }
                        return null;
                    }
                }
                case SPRITE: {
                    if (m.getValor() >= presio && sprite.chequear()!=0) {
                        for (int i = 1; i <= (m.getValor() - presio) / 100; i = i + 1) {
                            monVu.add(new Moneda100());
                        }
                        return sprite.get();
                    } else {
                        for (int i = 100; i <= m.getValor(); i = i + 100) {
                            monVu.add(new Moneda100());
                        }
                        return null;
                    }
                }
                case FANTA: {
                    if (m.getValor() >= presio && fanta.chequear()!=0) {
                        for (int i = 1; i <= (m.getValor() - presio) / 100; i = i + 1) {
                            monVu.add(new Moneda100());
                        }
                        return fanta.get();
                    } else {
                        for (int i = 100; i <= m.getValor(); i = i + 100) {
                            monVu.add(new Moneda100());
                        }
                        return null;
                    }
                }
                case SUPER8: {
                    if (m.getValor() >= presio && super8.chequear()!=0) {
                        for (int i = 1; i <= (m.getValor() - presio) / 100; i = i + 1) {
                            monVu.add(new Moneda100());
                        }
                        return super8.get();
                    } else {
                        for (int i = 100; i <= m.getValor(); i = i + 100) {
                            monVu.add(new Moneda100());
                        }
                        return null;
                    }
                }
                case SNIKERS: {
                    if (m.getValor() >= presio && snikers.chequear()!=0) {
                        for (int i = 1; i <= (m.getValor() - presio) / 100; i = i + 1) {
                            monVu.add(new Moneda100());
                        }
                        return snikers.get();
                    } else {
                        for (int i = 100; i <= m.getValor(); i = i + 100) {
                            monVu.add(new Moneda100());
                        }
                        return null;
                    }
                }
                default: {
                    for (int i = 100; i <= m.getValor(); i = i + 100) {
                        monVu.add(new Moneda100());
                    }
                    return null;
                }
            }
        } catch (Exception s){
            return null;
        }
    }

    public Moneda getVuelto(){
        return monVu.get();
    }
}
