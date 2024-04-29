/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.BEAN;

/**
 *
 * @author Joao Guilherme
 */
public class ProdutoPedido {
    private int idProdutoPedido;
    private int pedido;
    private int produto;

    public ProdutoPedido() {
    }

    public ProdutoPedido(int idProdutoPedido, int pedido, int produto) {
        this.idProdutoPedido = idProdutoPedido;
        this.pedido = pedido;
        this.produto = produto;
    }

    public int getIdProdutoPedido() {
        return idProdutoPedido;
    }

    public void setIdProdutoPedido(int idProdutoPedido) {
        this.idProdutoPedido = idProdutoPedido;
    }

    public int getPedido() {
        return pedido;
    }

    public void setPedido(int pedido) {
        this.pedido = pedido;
    }

    public int getProduto() {
        return produto;
    }

    public void setProduto(int produto) {
        this.produto = produto;
    }
    
    
}
