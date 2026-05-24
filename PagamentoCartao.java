public class PagamentoCartao extends Pagamento {
    private String numeroCartao;

    public PagamentoCartao(double valor, String descricao, String numeroCartao){
        super(valor, descricao);
        this.numeroCartao = numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao){
        this.numeroCartao = numeroCartao;
    }

    public String getNumeroCartao(){
        return this.numeroCartao;
    }

    @Override

    public void processarPagamento(){
         System.out.println("Pagamento realizado com sucesso!");
    }

    public void exibirDados() {
        System.out.println("Valor informando: "+ getValor());
        System.out.println("Descrição: "+ getDescricao());
        System.out.println("Numero do cartão: "+ getNumeroCartao());
    }
}
