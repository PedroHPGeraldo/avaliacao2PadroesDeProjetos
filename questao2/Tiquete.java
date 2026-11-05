package questao2;

public class Tiquete {
    private final String placa;
    private final int minutos;
    private EstrategiaCobranca estrategia;

    public Tiquete(String placa, int minutos, EstrategiaCobranca estrategia) {
        if (placa == null || placa.isBlank()) {
            throw new IllegalArgumentException("A placa e obrigatoria.");
        }
        if (minutos < 0) {
            throw new IllegalArgumentException("Os minutos nao podem ser negativos.");
        }
        this.placa = placa;
        this.minutos = minutos;
        alterarPerfil(estrategia);
    }

    public void alterarPerfil(EstrategiaCobranca novaEstrategia) {
        if (novaEstrategia == null) {
            throw new IllegalArgumentException("O perfil nao pode ser nulo.");
        }
        this.estrategia = novaEstrategia;
    }

    public String getPlaca() {
        return placa;
    }

    public int getMinutos() {
        return minutos;
    }

    public String getPerfil() {
        return estrategia.getNome();
    }

    public double calcularValor() {
        return estrategia.calcularValor(minutos);
    }
}
