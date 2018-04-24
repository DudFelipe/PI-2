
package br.senac.LojaEletronicos.Servico;

import br.senac.LojaEletronicos.BLL.ClienteBLL;
import br.senac.LojaEletronicos.Mock.MockCliente;
import br.senac.LojaEletronicos.Modelos.Cliente;
import java.util.List;

/**
 *
 * @author eduar
 */
public class ServicoCliente {
    public static List<String> cadastrarCliente(Cliente cliente){
        List<String> resposta = null;
        
        resposta = ClienteBLL.validaCliente(cliente);
        
        if(resposta == null){
            try{
                MockCliente.inserir(cliente);
            }catch(Exception e){
                e.printStackTrace();
                resposta.add("Erro na fonta de dados!");
            }
        }
        
        return resposta;
    }
    
    public static List<String> atualizarCliente(Cliente cliente){
        List<String> resposta = null;
        
        resposta = ClienteBLL.validaCliente(cliente);
        
        if(resposta == null){
            try{
                MockCliente.atualizar(cliente);
            }catch(Exception e){
                e.printStackTrace();
                resposta.add("Erro na fonta de dados");
            }
        }
        return resposta;
    }
    
    public static List<String> excluirCliente(Integer id){
        List<String> resposta = null;
        
        try{
            MockCliente.excluir(id);
        }catch(Exception e){
            e.printStackTrace();
            resposta.add("Erro na fonta de dados");
        }
        return resposta;
    }
    
    public static List<Cliente> procurarCliente(String nome){
        List<Cliente> listaResposta = null;
        
        try{
            if(nome == null || nome.equals("")){
                listaResposta = MockCliente.listar();
            }
            else{
                listaResposta = MockCliente.procurar(nome);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return listaResposta;
    }
    
    public static Cliente obterCliente(Integer id){
        Cliente clienteResposta = null;
        
        try{
            clienteResposta = MockCliente.obter(id);
        }catch(Exception e){
            e.printStackTrace();
        }
        return clienteResposta;
    }
}
