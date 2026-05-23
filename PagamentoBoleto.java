public class PagamentoBoleto extends Pagamento{
    private String codigoBarras;

    public PagamentoBoleto(double valor, String descricao, String codigoBarras){
        super(valor, descricao);
        this.codigoBarras = codigoBarras;
    }

    public String getCodigoBarras(){
        return this.codigoBarras;
    }

    @Override

    public void processarPagamento(){
         System.out.println("Pagamento realizado com sucesso!");
         return;
    }

    public void exibirDados(){
        System.out.println("Valor informando: "+ getValor());
        System.out.println("Descrição: "+ getDescricao());
        System.out.println("Codigo de barras: "+ getCodigoBarras());
    }

}
