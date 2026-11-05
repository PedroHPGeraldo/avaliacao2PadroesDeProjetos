package questao1;

public class Vendas implements ObservadorEstoque {
    @Override
    public void atualizar(String nomeProduto, int quantidadeAnterior, int novaQuantidade) {
        if (quantidadeAnterior == 0 && novaQuantidade > 0) {
            System.out.printf("%s voltou a ter estoque (%d unidades).%n",
                    nomeProduto, novaQuantidade);
        }
    }
}
