package questao2;

public class Rotativo implements EstrategiaCobranca {
    public static final double VALOR_HORA = 12.00;

    @Override
    public double calcularValor(int minutos) {
        return Math.ceil(minutos / 60.0) * VALOR_HORA;
    }

    @Override
    public String getNome() {
        return "Rotativo";
    }
}
