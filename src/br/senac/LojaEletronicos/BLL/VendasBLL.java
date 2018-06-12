/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.LojaEletronicos.BLL;

import br.senac.LojaEletronicos.Modelos.Produto;
import br.senac.LojaEletronicos.Modelos.Venda;
import static java.nio.file.Files.list;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.*;

/**
 *
 * @author vyvis
 */
public class VendasBLL {

    public static List<String> validarVenda(Venda v) {
        List<String> erros = new ArrayList<String>();

        if (v.getIdCliente() <0) {
            //return "O campo NOME é um campo obrigatório!";
            erros.add("É preciso ter um cliente para finalizar a venda.");
        }
        if (v.getListaDeProdutos() == null) {
            erros.add("É preciso ter selecionado produtos para concluir a venda.");
        }
        if (erros.isEmpty()) {
            return null;
        }

        return erros;

    }

    public static List<String> verificarLista(List<Produto> listaDeProdutos, Produto p) {
        List<String> erros = new ArrayList<String>();
        //Percorre a lista de produtos e caso o produto selecionado já esteja na lista, mostra mensagem
        for (int i = 0; i < listaDeProdutos.size(); i++) {
            if (listaDeProdutos.get(i).getIdProduto().equals(p.getIdProduto())) {
                erros.add("Este produto já foi inserido no se pedido");
                
            }
            if (erros.isEmpty()) {
                
                return null;
                
            }
        }
        return erros;

    }

    public static List<String> verificaQuantidade(List<Produto> lista, Produto p) {
        List<String> erros = new ArrayList<String>();
        //Percorre a lista de produtos 
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getIdProduto().equals(p.getIdProduto())) {
                //Se a quantidade selecionada for maior que a disponivel, mostra mensagem
                if (lista.get(i).getQuantidade() > p.getQuantidade()) {
                    erros.add("A quantidade informada não está disponivél.Por favor, verificar quantidade disponivel.");
                    
                }
            }
            if (erros.isEmpty()) {
                
                return null;
                       
            }
        }
        return erros ;
    }
    

}


