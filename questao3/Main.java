package questao3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Pedido de Cafe");

        Bebida pedido1 = new Chantilly(new Leite(new Espresso()));
        Bebida pedido2 = new Calda(new Cha());
        Bebida pedido3 = new Leite(new Leite(new Calda(new Espresso())));

        imprimir(1, pedido1);
        imprimir(2, pedido2);
        imprimir(3, pedido3);
    }

    private static void imprimir(int numero, Bebida bebida) {
        System.out.printf("Pedido %d: %s | Total: R$ %.2f%n",
                numero, bebida.getDescricao(), bebida.getPreco());
    }
}
