package questao2;

public class Mensalista implements EstrategiaCobranca {
    public static final double VALOR_FIXO = 8.00;

    @Override
    public double calcularValor(int minutos) {
        return VALOR_FIXO;
    }

    @Override
    public String getNome() {
        return "Mensalista";
    }
}
