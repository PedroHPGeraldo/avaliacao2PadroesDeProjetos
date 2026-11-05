package questao1;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private final String nome;
    private int quantidade;
    private final List<ObservadorEstoque> observadores = new ArrayList<>();

    public Produto(String nome, int quantidadeInicial) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome do produto e obrigatorio.");
        }
        if (quantidadeInicial < 0) {
            throw new IllegalArgumentException("O estoque nao pode ser negativo.");
        }
        this.nome = nome;
        this.quantidade = quantidadeInicial;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void adicionarObservador(ObservadorEstoque observador) {
        if (observador == null) {
            throw new IllegalArgumentException("O observador nao pode ser nulo.");
        }
        if (!observadores.contains(observador)) {
            observadores.add(observador);
        }
    }

    public void removerObservador(ObservadorEstoque observador) {
        observadores.remove(observador);
    }

    public void alterarQuantidade(int novaQuantidade) {
        if (novaQuantidade < 0) {
            throw new IllegalArgumentException("O estoque nao pode ser negativo.");
        }
        if (novaQuantidade == quantidade) {
            return; // Sem mudanca, sem notificacao.
        }
        int quantidadeAnterior = quantidade;
        quantidade = novaQuantidade;
        for (ObservadorEstoque observador : new ArrayList<>(observadores)) {
            observador.atualizar(nome, quantidadeAnterior, novaQuantidade);
        }
    }
}
