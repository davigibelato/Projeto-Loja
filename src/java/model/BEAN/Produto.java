/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.BEAN;

import java.sql.Blob;


public class Produto {
    private int idProduto;
    private int categoria;
    private String nome;
    private Float valor;
    private byte[] imagemBytes;
    private String imagemBase64;
    


    public Produto() {
    }

    public Produto(int idProduto, int categoria, String nome, Float valor, byte[] imagemBytes, String imagemBase64) {
        this.idProduto = idProduto;
        this.categoria = categoria;
        this.nome = nome;
        this.valor = valor;
        this.imagemBytes = imagemBytes;
        this.imagemBase64 = imagemBase64;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public byte[] getImagemBytes() {
        return imagemBytes;
    }

    public void setImagemBytes(byte[] imagemBytes) {
        this.imagemBytes = imagemBytes;
    }

    public String getImagemBase64() {
        return imagemBase64;
    }

    public void setImagemBase64(String imagemBase64) {
        this.imagemBase64 = imagemBase64;
    }

    
}