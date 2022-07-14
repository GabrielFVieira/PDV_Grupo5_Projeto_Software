//Victor Verdan Braga - 216083145

package state;

import java.util.ArrayList;
import pedido.ItemPedido;
import pedido.Pedido;

/**
 *
 * @author victo
 */
public class Cancelado extends StatusPedido {
    
    protected Cancelado (Pedido pedido){
        super(pedido);
    }

    @Override
    public String getStatusPedido() {
        return "Cancelado";
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
        System.out.println("Não é possível fazer essa operação");
        return "Pedido Cancelado";
    }

    @Override
    public String voltar() {
        System.out.println("Não é possível fazer essa operação");
        return "Pedido cancelado";
    }

    @Override
    public String cancelar() {
        System.out.println("Não é possível fazer essa operação");
        return "Pedido cancelado";
    }
    
}
