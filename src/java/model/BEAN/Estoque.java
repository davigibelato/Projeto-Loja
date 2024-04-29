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
public class Estoque {
    private int idEstoque;
    private int produto;
    private int quantidade;
    private Float custo;

    public Estoque() {
    }

    public Estoque(int idEstoque, int produto, int quantidade, Float custo) {
        this.idEstoque = idEstoque;
        this.produto = produto;
        this.quantidade = quantidade;
        this.custo = custo;
    }

    public int getIdEstoque() {
        return idEstoque;
    }

    public void setIdEstoque(int idEstoque) {
        this.idEstoque = idEstoque;
    }

    public int getProduto() {
        return produto;
    }

    public void setProduto(int produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Float getCusto() {
        return custo;
    }

    public void setCusto(Float custo) {
        this.custo = custo;
    }
    
    
}
