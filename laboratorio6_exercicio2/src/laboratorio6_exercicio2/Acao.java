package laboratorio6_exercicio2;

import java.util.ArrayList;
import java.util.List;

class Acao {
    private final String nome;
    private double preco;
    private final List<Investidor> investidores = new ArrayList<>();

    public Acao(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void anexar(Investidor investidor) {
        investidores.add(investidor);
    }

    public void desanexar(Investidor investidor) {
        investidores.remove(investidor);
    }

    public void notificarInvestidores() {
        for (Investidor investidor : investidores) {
            investidor.atualizar(this);
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
        notificarInvestidores();
    }

    public String getNome() {
        return nome;
    }
}