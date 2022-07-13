/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state;

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
    
    public abstract String getStatusPedido();
    public abstract void setId();
    public abstract void setCodigo();
    public abstract void setDataInicio();
    public abstract void setDataFim();
    public abstract void setItens();
}
