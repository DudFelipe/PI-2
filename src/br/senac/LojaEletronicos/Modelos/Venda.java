/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.LojaEletronicos.Modelos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author vyvis
 */
public class Venda {
    private float valorTotal;
    private int numeroDoPedido;//
    private int idCliente;//
    private Date dataVenda;//
    private String nomeCliente;//
    private List<ItemDaVenda> ListaDeItens;//
    
    
    public Venda(){
    nomeCliente = "";
    valorTotal =0.0f;
    numeroDoPedido =0;
    idCliente = 0;
    ListaDeItens = new ArrayList<>();
    dataVenda = null; 
}

    public List<ItemDaVenda> getListaDeItens() {
        return ListaDeItens;
    }

    public void setListaDeItens(List<ItemDaVenda> Lista) {
        this.ListaDeItens = Lista;
    }
  
   public void mostraVenda(){
       System.out.println("Nome do cliente :"+ nomeCliente);
       System.out.println("Codigo do cliente :"+idCliente);
       System.out.println("n° do pedido "+numeroDoPedido);
       System.out.println("Valor total do pedido :"+ valorTotal);
       System.out.println("Data da compra "+ dataVenda);
       
      for(int i=0 ; i<= ListaDeItens.size(); i++){
          System.out.println("Produto"+ (i+1) +":"+ListaDeItens.get(i).getProduto().getNome()
                  +"Quantidade :"+ListaDeItens.get(i).getQuantidade()); 
      }
       
       
   }   
    

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getNumeroDoPedido() {
        return numeroDoPedido;
    }

    public void setNumeroDoPedido(int numeroDoPedido) {
        this.numeroDoPedido = numeroDoPedido;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

   
    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
     
}