/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.LojaEletronicos.BLL;

import br.senac.LojaEletronicos.Modelos.Venda;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vyvis
 */
public class VendasBLL {
    public static List<String> validarVenda(Venda v ){
        List<String> erros = new ArrayList<String>();
        
        if (v.getIdCliente()== 0){
            //return "O campo NOME é um campo obrigatório!";
            erros.add("É preciso ter um cliente para finalizar a venda.");
        }
        if(v.getListaDeProdutos()==null){
            erros.add("É preciso ter selecionado produtos para concluir a venda.");
        }
        if(erros.isEmpty()){
            return null;
        }
        
        return erros;
        
    }
}
