package br.senac.LojaEletronicos.Mock;

import br.senac.LojaEletronicos.Modelos.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduar
 */
public class MockCliente {

    private static int sequenciaIdClientes = 0; //Inteiro para controlar os ID dos clientes de forma sequencial

    private static List<Cliente> listaClientes = new ArrayList<Cliente>(); //Lista que irá conter os clientes cadastrados em memória

    //Inserindo um cliente
    public static void inserir(Cliente cliente) throws Exception {
        cliente.setId(sequenciaIdClientes++); //Adiciona um ID e incrementa a sequencia

        listaClientes.add(cliente); //Adiciona o cliente na lista
    }

    //Atualizando um cliente
    public static void atualizar(Cliente cliente) throws Exception {
        if (cliente != null && cliente.getId() != null && listaClientes.size() > 0) { //Verifica se existe pelo menos um cliente cadastrado
            int contador = 0;
            boolean clienteAtualizado = false;

            while (contador < listaClientes.size() && !clienteAtualizado) { //Enquanto o cliente ainda não tiver sido atualizado
                Cliente clienteLista = listaClientes.get(contador); //Armazena o cliente atual da lista

                //Verifica se esse cliente é o cliente que estamos buscando para atualizar, caso seja, atualiza todos os dados
                if (clienteLista != null && clienteLista.getId() == cliente.getId()) {
                    clienteLista.setNome(cliente.getNome());
                    clienteLista.setDataNascimento(cliente.getDataNascimento());
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

                    clienteAtualizado = true; //Indica que o cliente já foi atualizado para sair do loop
                }
                contador++; //Caso o cliente não tenha sido encontrado, avança para o próximo
            }
        } else { //Caso não exista nenhum cliente, informa o usuário
            throw new Exception("Não há cliente para atualizar!");
        }
    }

    public static void excluir(int id) throws Exception {
        if (listaClientes.size() > 0) {
            int contadorPosicao = 0;
            boolean clienteRemovido = false;

            while (contadorPosicao < listaClientes.size() && !clienteRemovido) {
                Cliente clienteLista = listaClientes.get(contadorPosicao);

                if (clienteLista != null && clienteLista.getId() == id) {
                    listaClientes.remove(contadorPosicao);
                    clienteRemovido = true;
                }
            }
        } else {
            throw new Exception("Não há cliente para remover!");
        }
    }

    public static List<Cliente> listar() throws Exception {
        return listaClientes;
    }

    //Caso o tipo receba 0, a busca deve ser feita por nome;
    //caso contrário, a busca deve ser feita por CPF
    public static List<Cliente> procurar(String valor, int tipo) throws Exception {
        List<Cliente> listaResultado = new ArrayList<Cliente>(); //Lista para armazenar os dados resultantes da busca

        if (valor != null && listaClientes.size() > 0) { //Caso exista algum item na lista
            int contadorPosicao = 0; //Contador para verificar se ainda há itens na lista
            while (contadorPosicao < listaClientes.size()) { //Caso ainda existam itens na lista
                Cliente clienteLista = listaClientes.get(contadorPosicao); //Armazena o cliente atual

                if (tipo == 0){ //Caso o tipo da busca seja 0 (busca por nome)
                    if (clienteLista != null && clienteLista.getNome() != null) { //Verifica se o cliente não está null
                        if (clienteLista.getNome().contains(valor)) { //Verifica se o nome do cliente possui algo igual na string 'valor'
                            listaResultado.add(clienteLista); //Caso seja verdade, insere o cliente na lista
                        }
                    }
                }
                else{ //Caso contrário, a busca deve ser feita por CPF
                    if(clienteLista != null && clienteLista.getCPF() != null){ //Verifica se o cliente não está null
                        if(clienteLista.getCPF().contains(valor)){ //Verifica se o CPF do cliente possui algo igual na string 'valor'
                            listaResultado.add(clienteLista); //Caso seja verdade, insere o cliente na lista
                        }
                    }
                }
                contadorPosicao++; //Passa para o próximo cliente cadastrado
            }
        } else { //Caso não exista nenhum dado cadastrado, informar o erro ao usuário
            throw new Exception("Não há dados para pesquisa!");
        }
        return listaResultado; //Retorna a lista com os clientes encontrados na busca
    }

    public static Cliente obter(int id) throws Exception {
        if (listaClientes.size() > 0) {
            int contadorPosicao = 0;
            while (contadorPosicao < listaClientes.size()) {
                Cliente clienteLista = listaClientes.get(contadorPosicao);

                if (clienteLista != null && clienteLista.getId() != null && clienteLista.getId() == id) {
                    return clienteLista;
                }
                contadorPosicao++;
            }
        } else {
            throw new Exception("Não há dados para pesquisa!");
        }
        return null;
    }
}
