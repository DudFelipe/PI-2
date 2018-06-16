/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.LojaEletronicos.Modelos;

/**
 *
 * @author giovanebarreira
 */
public class Produto implements Cloneable {
    private String nome, fabricante, modelo, dimensoes, observacoes;
    private Integer idProduto, quantidade;
    private Long codBarras;
    private Float preco;
            
    public Produto(){
        idProduto = 0;
        nome = "";
        fabricante = "";
        modelo = "";
        preco = 0.0f;
        quantidade = 0;
        dimensoes = "";
        codBarras = 0l;
        observacoes = "";        
    }
    
    public Produto getClone(){
        try{
            return (Produto)super.clone();
        }catch(CloneNotSupportedException e){
            return this;
        }
    }
    
    public void mostraProduto(){
        System.out.println("Nome Produto: " + getNome());
        System.out.println("Fabricante: " + getFabricante());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Preco: " + getPreco());
        System.out.println("Quantidade: " + getQuantidade());
        System.out.println("Dimensoes: " + getDimensoes());
        System.out.println("Cód.Barras: " + getCodBarras());
        System.out.println("Observacoes: " + getObservacoes());
        
    }
    
    
      public Integer getId() {
        return idProduto;
    }
      
    public void setId(Integer idProduto){
        this.idProduto = idProduto;
    }

   
    /**
     * @return nome do produto
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param alterar nome produto
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return nome fabricante
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     * @param alterar nome fabricante
     */
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    /**
     * @return modelo do produto
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param alterar modelo do produto
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return preco do produto
     */
    public Float getPreco() {
        return preco;
    }

    /**
     * @param alterar preco do produto
     */
    public void setPreco(float preco) {
        this.preco = preco;
    }

    /**
     * @return quantidade
     */
    public Integer getQuantidade() {
        return quantidade;
    }

    /**
     * @param alterar quantidade em estoque
     */
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return dimensoes do produto
     */
    public String getDimensoes() {
        return dimensoes;
    }

    /**
     * @param dimensoes
     * @param alterar dimensoes do produto
     */
    public void setDimensoes(String dimensoes) {
        this.dimensoes = dimensoes;
    }
    
     public Long getCodBarras() {
        return codBarras;
    }
     
     public void setCodBarras(Long codBarras) {
        this.codBarras = codBarras;
    }
    

    /**
     * @return observacoes do produto
     */
    public String getObservacoes() {
        return observacoes;
    }

    /**
     * @param alterar observacoes do produto
     */
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    /**
     * @return idProduto
     */
    public Integer getIdProduto() {
        return idProduto;
    }

    /**
     * @param idProduto 
     */
    
    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }
    
    
    
}
