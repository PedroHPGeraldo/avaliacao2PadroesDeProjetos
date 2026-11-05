package questao3;

public class Calda extends Complemento {
    public static final double PRECO = 1.50;

    public Calda(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " + Calda";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + PRECO;
    }
}
