package questao2;

public class Conveniado implements EstrategiaCobranca {
    public static final int MINUTOS_GRATUITOS = 30;
    public static final double VALOR_HORA = 12.00;
    public static final double DESCONTO_PERCENTUAL = 0.25;

    @Override
    public double calcularValor(int minutos) {
        int minutosCobrados = Math.max(0, minutos - MINUTOS_GRATUITOS);
        double horasIniciadas = Math.ceil(minutosCobrados / 60.0);
        return horasIniciadas * VALOR_HORA * (1 - DESCONTO_PERCENTUAL);
    }

    @Override
    public String getNome() {
        return "Conveniado";
    }
}
