public class Main{

   public static void main(String[] args){

        Pagamento[] pagamentos = new Pagamento[3];
        pagamentos[0] = new PagamentoPix(100, "Valor enviado para Gustavo", "123.456.789-00");
        pagamentos[1] = new PagamentoCartao(200, "Fatura paga por alisson barbosa", "231-980-453-92");
        pagamentos[2] = new PagamentoBoleto(300, "Boleto pago por joel", "010101011100101");

        for(int i = 0;i < pagamentos.length; i++){
            pagamentos[i].exibirDados();
            pagamentos[i].processarPagamento();
            System.out.println("------------------------------------");
        } 

   }
}