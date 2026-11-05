package questao1;

public class Auditoria implements ObservadorEstoque {
    @Override
    public void atualizar(String nomeProduto, int quantidadeAnterior, int novaQuantidade) {
        System.out.printf("%s: estoque alterado de %d para %d.%n",
                nomeProduto, quantidadeAnterior, novaQuantidade);
    }
}
