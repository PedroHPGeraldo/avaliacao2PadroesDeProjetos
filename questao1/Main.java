package questao1;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Teclado", 8);
        Compras compras = new Compras();
        Vendas vendas = new Vendas();
        Auditoria auditoria = new Auditoria();

        produto.adicionarObservador(compras);
        produto.adicionarObservador(vendas);
        produto.adicionarObservador(auditoria);

        System.out.println("Monitor de Estoque");
        alterar(produto, 4); // Compras e Auditoria.
        alterar(produto, 0); // Compras e Auditoria.
        alterar(produto, 0); // Ninguem: quantidade nao mudou.
        alterar(produto, 10); // Vendas e Auditoria.

        System.out.println("Removendo a area de Auditoria");
        produto.removerObservador(auditoria);
        alterar(produto, 2); // Compras; Auditoria nao recebe mais.
        alterar(produto, 0);
        alterar(produto, 6); // Vendas; Auditoria nao recebe mais.
    }

    private static void alterar(Produto produto, int novaQuantidade) {
        System.out.printf("%nAlterando %s de %d para %d:%n",
                produto.getNome(), produto.getQuantidade(), novaQuantidade);
        produto.alterarQuantidade(novaQuantidade);
    }
}
