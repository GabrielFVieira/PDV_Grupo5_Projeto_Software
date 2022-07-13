// Gabriel Figueiredo Vieira - 119083045
package adapter;

public class VisaClient {
    private static final string VisaURI = "fake-uri";

    public VisaResult efetuarCobranca(string descricao, double valor) {
        return new VisaResult(112); // Exemplo de resultado falso da API do Visa
    }
}

public class VisaResult {
    private int statusCode;
    private string descricaoCobranca;

    public VisaClient(int status, string descricao) {
        this.statusCode = status;
        this.descricaoCobranca = descricao;
    }

    public int getStatus() {
        return this.status;
    }

    public string getDescricaoCobranca() {
        return this.descricaoCobranca;
    }
}


