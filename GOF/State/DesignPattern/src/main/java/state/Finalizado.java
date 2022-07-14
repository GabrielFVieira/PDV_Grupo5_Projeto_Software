//Victor Verdan Braga - 216083145

package state;

import java.util.ArrayList;
import pedido.ItemPedido;
import pedido.Pedido;

/**
 *
 * @author victo
 */
public class Finalizado extends StatusPedido {
    
    protected Finalizado (Pedido pedido){
        super(pedido);
    }

    @Override
    public String getStatusPedido() {
        return "Finalizado";
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
        return "Pedido finalizado";
    }

    @Override
    public String voltar() {
        pedido.changeStatus(new EmPreparo(pedido));
        return "Pedido voltou para ser preparado ";
    }

    @Override
    public String cancelar() {
        pedido.changeStatus(new Cancelado(pedido));
        return "Pedido cancelado";
    }
    
}
