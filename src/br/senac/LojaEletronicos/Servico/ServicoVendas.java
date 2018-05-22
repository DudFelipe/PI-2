/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.LojaEletronicos.Servico;
import br.senac.LojaEletronicos.BLL.VendasBLL;
import br.senac.LojaEletronicos.Mock.MockCliente;
import br.senac.LojaEletronicos.Mock.MockVendas;
import br.senac.LojaEletronicos.Modelos.Cliente;
import br.senac.LojaEletronicos.Modelos.Venda;
import java.util.Date;
import java.util.List;

/**
 *
 * @author vyvis
 */
public class ServicoVendas {
    
    public static List<String> cadastrarVenda(Venda v) {
        List<String> resposta = null;

        resposta = VendasBLL.validarVenda(v);

   
        if (resposta == null) {
           
            try {
                MockVendas.inserir(v);
            } catch (Exception e) {
                e.printStackTrace();
                resposta.add("Erro na fonte de dados!");
            }
        }

        return resposta;
    }
     
    
    public static List<Venda> procurarVenda(String s, Date tipo) {
        List<Venda> listaResposta = null;

        try {
            if (s == null || s.equals("")) {
                listaResposta = MockVendas.listar();
            } else {
                listaResposta = MockVendas.obter(s, tipo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaResposta;
    }

    
    public static Venda obterVenda(Integer id) {
        Venda vendaResposta = null;

        try {
            vendaResposta = MockVendas.obter(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return vendaResposta;
    }
    
}
