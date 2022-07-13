// Gabriel Figueiredo Vieira - 119083045
package adapter;

public class MasterCardClient {
    private static final string MasterCardURI = "fake-uri";

    public MasterCardResult solicitarPagamento(double valor) {
        return new MasterCardResult("SUCESSO"); // Exemplo de resultado falso da API do MasterCard
    }
}

public class MasterCardResult {
    private string status;

    public MasterCardClient(string status) {
        this.status = status;
    }

    public string getStatus() {
        return this.status;
    }
}


