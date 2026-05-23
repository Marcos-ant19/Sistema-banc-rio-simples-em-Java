public class PagamentoPix extends Pagamento{
    private String chavePix;

    public PagamentoPix(double valor, String descricao, String chavePix){
        super(valor, descricao);
        this.chavePix = chavePix;
    }

    public void setChavePix(String chavePix){
        this.chavePix = chavePix;
    }

    public String getChavePix(){
        return this.chavePix;
    }

    @Override

    public void processarPagamento(){
        System.out.println("Pagamento realizado com sucesso!");
    }

    @Override
    
    public void exibirDados() {
        System.out.println("Valor informando: "+ getValor());
        System.out.println("Descrição: "+ getDescricao());
        System.out.println("Codigo de barras: "+ getChavePix());
    }
}
