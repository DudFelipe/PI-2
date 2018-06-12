/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.LojaEletronicos.Modelos;


import static java.nio.file.Files.list;
import java.util.ArrayList;
import static java.util.Collections.list;
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
    private List<Produto> ListaDeProdutos;//
    
    
    public Venda(){
    nomeCliente = "";
    valorTotal =0.0f;
    numeroDoPedido =0;
    idCliente = 0;
    ListaDeProdutos = new ArrayList<>();;
    dataVenda = null; 
}

    public List<Produto> getListaDeProdutos() {
        return ListaDeProdutos;
    }

    public void setListaDeProdutos(List<Produto> ListaDeProdutos) {
        this.ListaDeProdutos = ListaDeProdutos;
    }
  
   public void mostraVenda(){
       System.out.println("Nome do cliente :"+ nomeCliente);
       System.out.println("Codigo do cliente :"+idCliente);
       System.out.println("n° do pedido "+numeroDoPedido);
       System.out.println("Valor total do pedido :"+ valorTotal);
       System.out.println("Data da compra "+ dataVenda);
       
      for(int i=0 ; i<= ListaDeProdutos.size(); i++){
          System.out.println("Produto"+ (i+1) +":"+ListaDeProdutos.get(i).getNome()+
                  "Codigo do Produto"+(i+1)+":"+ListaDeProdutos.get(i).getIdProduto()
                  +"Quantidade :"+ListaDeProdutos.get(i).getQuantidade()); 
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
