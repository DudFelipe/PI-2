/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.LojaEletronicos.Modelos;

/**
 *
 * @author Marcos
 */
public class ItemDaVenda {
    private Integer idItemDaVenda;
    private Produto produto;
    private Integer quantidade;
    
    public ItemDaVenda(Produto p, int quant, int id){
        idItemDaVenda = id;
        produto = p;
        quantidade = quant;
    }
    
    public int setProduto(Produto prod){
        try{
            this.produto = prod;
        }
        catch(Error e){
            System.out.println(e.getMessage());
            return 0;
        }
        return 1;
    }
    
    public Produto getProduto(){
        return produto;
    }
    
    public int setQuantidade(Integer quant){
        try{
            this.quantidade = quant;
        }
        catch(Error e){
            System.out.println(e.getMessage());
            return 0;
        }
        return 1;
    }
    
    public Integer getQuantidade(){
        return quantidade;
    }

    
    public Integer getIdItemDaVenda(){
        return idItemDaVenda;
    }
}
