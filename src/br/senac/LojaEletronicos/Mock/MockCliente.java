
package br.senac.LojaEletronicos.Mock;

import br.senac.LojaEletronicos.Modelos.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduar
 */
public class MockCliente {
    private static int sequenciaIdClientes = 0;
    
    private static List<Cliente> listaClientes = new ArrayList<Cliente>();
    
    public static void inserir(Cliente cliente)throws Exception{
        cliente.setId(sequenciaIdClientes++);
        
        listaClientes.add(cliente);
    }
    
    public static void atualizar(Cliente cliente) throws Exception{
        if(cliente != null && cliente.getId() != null && listaClientes.size() > 0){
            int contador = 0;
            boolean clienteAtualizado = false;
            
            while(contador < listaClientes.size() && !clienteAtualizado){
                Cliente clienteLista = listaClientes.get(contador);
                
                if(clienteLista != null && clienteLista.getId() == cliente.getId()){
                    clienteLista.setNome(cliente.getNome());
                    //clienteLista.setDataNascimento(cliente.getDataNascimento());
                    clienteLista.setSexo(cliente.getSexo());
                    clienteLista.setCPF(cliente.getCPF());
                    clienteLista.setRG(cliente.getRG());
                    clienteLista.setEstadoCivil(cliente.getEstadoCivil());
                    clienteLista.setEndereco(cliente.getEndereco());
                    clienteLista.setNumero(cliente.getNumero());
                    clienteLista.setCEP(cliente.getCEP());
                    clienteLista.setBairro(cliente.getBairro());
                    clienteLista.setComplemento(cliente.getComplemento());
                    clienteLista.setCidade(cliente.getCidade());
                    clienteLista.setTelefoneFixo(cliente.getTelefoneFixo());
                    clienteLista.setCelular(cliente.getCelular());
                    clienteLista.setEmail(cliente.getEmail());
                    clienteLista.setPrefContato(cliente.getPrefContato());
                    
                    clienteAtualizado = true;
                }
                contador++;
            }
        }
        else{
            throw new Exception("Não há cliente para atualizar!");
        }
    }
    
    public static void excluir(int id) throws Exception{
        if(listaClientes.size() > 0){
            int contadorPosicao = 0;
            boolean clienteRemovido = false;
            
            while(contadorPosicao < listaClientes.size() && !clienteRemovido){
                Cliente clienteLista = listaClientes.get(contadorPosicao);
                
                if(clienteLista != null && clienteLista.getId() == id){
                    listaClientes.remove(contadorPosicao);
                    clienteRemovido = true;
                }
            }
        }
        else{
            throw new Exception("Não há cliente para remover!");
        }
    }
    
    public static List<Cliente> listar() throws Exception{
        return listaClientes;
    }
    
    public static List<Cliente> procurar(String valor) throws Exception{
        List<Cliente> listaResultado = new ArrayList<Cliente>();
        
        if(valor != null && listaClientes.size() > 0){
            int contadorPosicao = 0;
            while(contadorPosicao < listaClientes.size()){
                Cliente clienteLista = listaClientes.get(contadorPosicao);
                
                if(clienteLista != null && clienteLista.getNome() != null){
                    if(clienteLista.getNome().contains(valor)){
                        listaResultado.add(clienteLista);
                    }
                }
                contadorPosicao++;
            }
        }
        else{
            throw new Exception("Não há dados para pesquisa!");
        }
        return listaResultado;
    }
    
    public static Cliente obter(int id) throws Exception{
        if(listaClientes.size() > 0){
            int contadorPosicao = 0;
            while(contadorPosicao < listaClientes.size()){
                Cliente clienteLista = listaClientes.get(contadorPosicao);
                
                if(clienteLista != null && clienteLista.getId() != null && clienteLista.getId() == id){
                    return clienteLista;
                }
                contadorPosicao++;
            }
        }
        else{
            throw new Exception("Não há dados para pesquisa!");
        }
        return null;
    }
}
