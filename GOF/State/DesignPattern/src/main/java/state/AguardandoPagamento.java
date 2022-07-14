//Victor Verdan Braga - 216083145

package state;

import java.util.ArrayList;
import pedido.ItemPedido;
import pedido.Pedido;

/**
 *
 * @author victo
 */
public class AguardandoPagamento extends StatusPedido {
    
    public AguardandoPagamento (Pedido pedido){
        super(pedido);
    }

    @Override
    public String getStatusPedido() {
        return "Aguardando Pagamento";
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
        super.pedido.setItens(itens);
        //this.itens = itens;
    }

    @Override
    public String avancar() {
        pedido.changeStatus(new AguardandoPreparo(pedido));
        return "Esperando Preparar";
    }

    @Override
    public String voltar() {
        System.out.println("Não é possível fazer essa operação");
        return "Não pode voltar retornar além disso.";
    }

    @Override
    public String cancelar() {
        pedido.changeStatus(new Cancelado(pedido));
        return "Pedido cancelado";
    }
    
}
