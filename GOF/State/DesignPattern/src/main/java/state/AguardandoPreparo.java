//Victor Verdan Braga - 216083145

package state;

import java.util.ArrayList;
import pedido.ItemPedido;
import pedido.Pedido;

/**
 *
 * @author victo
 */
public class AguardandoPreparo extends StatusPedido {

    protected AguardandoPreparo (Pedido pedido){
        super(pedido);
    }
    
    @Override
    public String getStatusPedido() {
        return "Aguardando Preparo";
    }

    @Override
    public void setId(int id) {
        System.out.println("Não é possível fazer essa operação");
    }

    @Override
    public void setCodigo(int codigo) {
        System.out.println("Não é possível fazer essa operação");
    }

    @Override
    public void setDataInicio(int data) {
        System.out.println("Não é possível fazer essa operação");
    }

    @Override
    public void setDataFim(int data) {
        System.out.println("Não é possível fazer essa operação");
    }

    @Override
    public void setItens(ArrayList<ItemPedido> itens) {
        System.out.println("Não é possível fazer essa operação");
    }
    
    @Override
    public String avancar() {
        pedido.changeStatus(new EmPreparo(pedido));
        return "Começando o Preparo";
    }

    @Override
    public String voltar() {
        pedido.changeStatus(new AguardandoPagamento(pedido));
        return "Aguardando o pagamento ";
    }

    @Override
    public String cancelar() {
        pedido.changeStatus(new Cancelado(pedido));
        return "Pedido cancelado";
    }
    
}
