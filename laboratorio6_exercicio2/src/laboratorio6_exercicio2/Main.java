package laboratorio6_exercicio2;


public class Main {
    public static void main(String[] args) {
        Acao acao1 = new Acao("Empresa da Felicidade", 50);
        AcaoCorretora corretora = new AcaoCorretora();

        Investidor investidor1 = new InvestidorImpl("Investidor 1", 40, 60, corretora);
        Investidor investidor2 = new InvestidorImpl("Investidor 2", 45, 70, corretora);

        acao1.anexar(investidor1);
        acao1.anexar(investidor2);

        corretora.venderAcao(acao1, 55);
    }
}