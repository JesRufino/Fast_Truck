package com.example.els.fasttruck;

/**
 * Created by El's on 09/09/2016.
 */
public class Produto {
    private String nome;
    private String descricao;
    private String imgProd;
    private Double preco;


    public Produto(String nome, String descricao, String imgProd, Double preco) {
        this.descricao = descricao;
        this.nome = nome;
        this.imgProd = imgProd;
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }
    public void alterarDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setImgProd(String imgProd) {
        this.imgProd = imgProd;
    }
    public String getImgProd() {
        return this.imgProd;
    }
    public double getPreco(){
        return this.preco;
    }
    public void alterarPreco(double preco){
        this.preco = preco;
    }

}
