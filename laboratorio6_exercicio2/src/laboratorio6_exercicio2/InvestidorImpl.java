package laboratorio6_exercicio2;

class InvestidorImpl implements Investidor {
    private String nome;
    private double precoMinimo;
    private double precoMaximo;
    private AcaoCorretora corretora;

    public InvestidorImpl(String nome, double precoMinimo, double precoMaximo, AcaoCorretora corretora) {
        this.nome = nome;
        this.precoMinimo = precoMinimo;
        this.precoMaximo = precoMaximo;
        this.corretora = corretora;
    }

    @Override
    public void atualizar(Acao acao) {
        double precoAtual = acao.getPreco();
        if (precoAtual >= precoMaximo) {
            corretora.venderAcao(acao, precoAtual);
        }
    }
}