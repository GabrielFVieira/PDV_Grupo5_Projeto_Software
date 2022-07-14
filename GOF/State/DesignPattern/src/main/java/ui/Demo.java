//Victor Verdan Braga - 216083145

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import pedido.Pedido;

/**
 *
 * @author victo
 */
public class Demo {
    
    public static void main (String[] args){
        Pedido p1 = new Pedido(1,1,20220713);
        Pedido p2 = new Pedido(2,2,20220713);
        
        //Testes do pedido 1
        //Testando se os dados estão sendo instanciados
        System.out.println(p1.getId());
        System.out.println(p1.getCodigo());
        System.out.println(p1.getDataInicio());
        //Avança para o próximo estágio [Aguardando Preparo]
        p1.getStatus().avancar();
        System.out.println(p1.getStatus().getStatusPedido());
        //Avança para o próximo estágio [Em Preparo]
        p1.getStatus().avancar();
        System.out.println(p1.getStatus().getStatusPedido());
        //Avança para o próximo estágio [Finalizado]
        p1.getStatus().avancar();
        System.out.println(p1.getStatus().getStatusPedido());
        
        //Dando uma linha
        System.out.println("==================================");
        
        //Testes do pedido 2
        //Testando se os dados estão sendo instanciados
        System.out.println(p2.getId());
        System.out.println(p2.getCodigo());
        System.out.println(p2.getDataInicio());
        //Cancela o pedido [Cancelado]
        p1.getStatus().cancelar();
        System.out.println(p1.getStatus().getStatusPedido());
        //Tenta voltar para o estágio anterior
        p1.getStatus().voltar();
        System.out.println(p1.getStatus().getStatusPedido());
        //Avança para o próximo estágio [Finalizado]
        p1.getStatus().avancar();
        System.out.println(p1.getStatus().getStatusPedido());
    }
}
