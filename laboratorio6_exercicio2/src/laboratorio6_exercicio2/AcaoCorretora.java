package laboratorio6_exercicio2;

class AcaoCorretora {
    public void venderAcao(Acao acao, double preco) {
        acao.setPreco(preco);
        System.out.println("Ação " + acao.getNome() + " vendida por " + preco + ".");
    }
}