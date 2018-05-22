/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.LojaEletronicos.Mock;
import br.senac.LojaEletronicos.Modelos.Venda;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author vyvis
 */
public class MockVendas {

    private static int sequenciaVendas = 0;

    private static List<Venda> listaVendas = new ArrayList<Venda>();

    
    public static void inserir(Venda v) throws Exception {
        v.setNumeroDoPedido(sequenciaVendas++); 

        listaVendas.add(v); 
    }
    
    public static List<Venda> listar() throws Exception {
        return listaVendas;
    }
        
    public static Venda obter(int n) throws Exception {
        if (listaVendas.size() > 0) {
            int contadorPosicao = 0;
            while (contadorPosicao < listaVendas.size()) {
                Venda vendaLista = listaVendas.get(contadorPosicao);

                if (vendaLista != null && vendaLista.getNumeroDoPedido()!= 0 && vendaLista.getNumeroDoPedido()== n) {
                    return vendaLista;
                }
                contadorPosicao++;
            }
        } else {
            throw new Exception("Não há dados para pesquisa!");
        }
        return null;
    }

    public static List<Venda> obter(String s, Date tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static List<Venda> obter(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
