import java.util.HashMap;

public class BalancoEmpresa {

    private HashMap<String, Divida> dividas = new HashMap<>();

    public void registrarDividas(String credor, String cnpjCredor, double valor) {

        Divida divida = new Divida(cnpjCredor);
        divida.setCredor(credor);
        divida.setTotal(valor);
        dividas.put(cnpjCredor, divida);
    }

    public void pagaDivida(String cnpjCredor, double valor, String nomePagador, String cnpjPagador) {

        Divida divida = dividas.get(cnpjCredor);
        if (divida != null) {
            Pagamento pagamento = new Pagamento();
            pagamento.setCnpjPagador(cnpjPagador);
            pagamento.setPagador(nomePagador);
            divida.getPagamentos().registra(pagamento);
        }
    }
}
