public abstract class Pagamento{
    private double valor;
    private String descricao;

    public Pagamento(double valor, String descricao){
        this.valor = valor;
        this.descricao = descricao;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public double getValor(){
        return this.valor;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public abstract void processarPagamento();

    public void exibirDados(){
        System.out.println("Valor informando: "+ getValor());
        System.out.println("Descrição: "+ getDescricao());
    }
}
