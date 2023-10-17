class Expendedor{
    private Deposito<Bebida> coca= new Deposito<>();
    private Deposito<Bebida> sprite= new Deposito<>();
    private Deposito<Moneda> monVu= new Deposito<>();

    public static final int  COCA=1;
    public static final int  SPRITE=2;

    private int presio;
    private int numbeb;
    public Expendedor(int numBebidas, int precioBebidas){
        presio = precioBebidas;
        numbeb = numBebidas;

        for (int i =0;i<numbeb;i=i+1){
            coca.add(new CocaCola(1*i));
            sprite.add(new Sprite(2*i));
        }
    }
    public Bebida comprarBebida(Moneda m, int cual){
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
