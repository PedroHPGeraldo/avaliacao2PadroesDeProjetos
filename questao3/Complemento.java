package questao3;

public abstract class Complemento implements Bebida {
    protected final Bebida bebida;

    protected Complemento(Bebida bebida) {
        if (bebida == null) {
            throw new IllegalArgumentException("A bebida nao pode ser nula.");
        }
        this.bebida = bebida;
    }
}
