//Victor Verdan Braga - 216083145
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state;

import java.util.ArrayList;
import pedido.ItemPedido;
import pedido.Pedido;

/**
 *
 * @author victo
 */
public abstract class StatusPedido {
        
    Pedido pedido;

    protected StatusPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
    public abstract String avancar();
    public abstract String voltar();
    public abstract String cancelar();
    public abstract String getStatusPedido();
    public abstract void setId(int id);
    public abstract void setCodigo(int codigo);
    public abstract void setDataInicio(int data);
    public abstract void setDataFim(int data);
    public abstract void setItens(ArrayList<ItemPedido> itens);
}
