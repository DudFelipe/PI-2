package br.senac.LojaEletronicos.Servico;

import br.senac.LojaEletronicos.BLL.ClienteBLL;
import br.senac.LojaEletronicos.DAO.ClienteDAO;
import br.senac.LojaEletronicos.Mock.MockCliente;
import br.senac.LojaEletronicos.Modelos.Cliente;
import java.util.List;

/**
 *
 * @author eduar
 */
public class ServicoCliente {

    public static List<String> cadastrarCliente(Cliente cliente) {
        List<String> resposta = null;

        resposta = ClienteBLL.validaCliente(cliente);

        if (resposta == null) {
            try {
                ClienteDAO.inserir(cliente);
            } catch (Exception e) {
                e.printStackTrace();
                resposta.add("Erro na fonte de dados!");
            }
        }

        return resposta;
    }

    public static List<String> atualizarCliente(Cliente cliente) {
        List<String> resposta = null;

        resposta = ClienteBLL.validaCliente(cliente);

        if (resposta == null) {
            try {
                ClienteDAO.atualizar(cliente);
            } catch (Exception e) {
                e.printStackTrace();
                resposta.add("Erro na fonte de dados");
            }
        }
        return resposta;
    }

    public static List<String> excluirCliente(Integer id) {
        List<String> resposta = null;

        try {
            ClienteDAO.excluir(id);
        } catch (Exception e) {
            e.printStackTrace();
            resposta.add("Erro na fonta de dados");
        }
        return resposta;
    }

    //Caso o tipo receba 0, a busca deve ser feita por nome,
    //caso contrário, a busca deve ser feita por CPF
    public static List<Cliente> procurarCliente(String s, int tipo) {
        List<Cliente> listaResposta = null;

        try {
            if (s == null || s.equals("")) {
                listaResposta = ClienteDAO.listar();
            } else {
                listaResposta = ClienteDAO.procurar(s, tipo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaResposta;
    }

    public static Cliente obterCliente(Integer id) {
        Cliente clienteResposta = null;

        try {
            clienteResposta = ClienteDAO.obter(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return clienteResposta;
    }
}
