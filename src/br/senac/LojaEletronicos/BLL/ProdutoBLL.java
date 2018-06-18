    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.LojaEletronicos.BLL;
import br.senac.LojaEletronicos.Modelos.Produto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author giovanebarreira
 */
public class ProdutoBLL {
    public static List<String> validaProduto(Produto p){
        
        List<String> erros = new ArrayList<String>();
        
        if(p.getNome().trim().length() == 0){
            //return "O campo NOME é um campo obrigatório!";
            erros.add("O campo NOME é um campo obrigatório!");
        }
        if(p.getFabricante().trim().length() == 0){
            //return "O campo FABRICANTE é um campo obrigatório!";
            erros.add("\nO campo FABRICANTE é um campo obrigatório!\n");
        }
        
        if(p.getModelo().trim().length() == 0){
            //return "O campo MODELO é um campo obrigatório!";
            erros.add("\nO campo MODELO é um campo obrigatório!");
        }
        
        if(p.getPreco() == null || p.getPreco() <= 0){
            //return "O valor digitado é inválido"";
            erros.add("\nO preço digitado é inválido");
        }
        
        if(p.getQuantidade() == null || p.getQuantidade()<= 0){
            //return "O campo QUANTIDADE é um campo obrigatório!";
            erros.add("\nA quantidade digitada é inválida");
        }
        
        if(p.getDimensoes().trim().length() == 0){
            //return "O campo DIMENSÕES é um campo obrigatório!";
            erros.add("\nO campo DIMENSÕES é um campo obrigatório!");
        }
        
        if(erros.isEmpty()){
            return null;
        }
        return erros;
    }
    
    
}
