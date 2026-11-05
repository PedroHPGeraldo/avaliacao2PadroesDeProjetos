package questao3;

public class Cha implements Bebida {
    public static final double PRECO = 5.00;

    @Override
    public String getDescricao() {
        return "Cha";
    }

    @Override
    public double getPreco() {
        return PRECO;
    }
}
