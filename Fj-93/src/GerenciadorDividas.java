public class GerenciadorDividas {

    public void efetuaPagamento(Divida divida, String nomePagador, String cnpjPagador, double valor){
        Pagamento pagamento = new Pagamento();
        pagamento.setCnpjPagador(cnpjPagador);
        pagamento.setPagador(nomePagador);
        divida.getPagamentos().registra(pagamento);
    }
}
