/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.LojaEletronicos.DAO;

import br.senac.LojaEletronicos.Modelos.Cliente;
import br.senac.LojaEletronicos.Utils.ConnectionUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Dud Felipe
 */
public class ClienteDAO {
    //Insere um cliente na tabela "cliente" do banco de dados
    public static void inserir(Cliente cliente)
            throws SQLException, Exception {
        //Monta a string de inserção de um cliente no BD,
        //utilizando os dados do clientes passados como parâmetro
        String sql = "INSERT INTO cliente (nome, dataDeNascimento, "
                + "sexo, CPF, RG, estadoCivil, endereco, numero, CEP, bairro, complemento, cidade, "
                + "telefoneFixo, celular, email, prefContato, enabled) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        //Conexão para abertura e fechamento
        Connection connection = null;
        //Statement para obtenção através da conexão, execução de
        //comandos SQL e fechamentos
        PreparedStatement preparedStatement = null;
        try {
            //Abre uma conexão com o banco de dados
            connection = ConnectionUtils.getConnection();
            //Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);
            //Configura os parâmetros do "PreparedStatement"
            preparedStatement.setString(1, cliente.getNome());
            Timestamp t = new Timestamp(cliente.getDataNascimento().getTime());
            preparedStatement.setTimestamp(2, t);
            preparedStatement.setString(3, cliente.getSexo());
            preparedStatement.setString(4, cliente.getCPF());
            preparedStatement.setString(5, cliente.getRG());
            preparedStatement.setString(6, cliente.getEstadoCivil());
            preparedStatement.setString(7, cliente.getEndereco());
            preparedStatement.setInt(8, cliente.getNumero());
            preparedStatement.setString(9, cliente.getCEP());
            preparedStatement.setString(10, cliente.getBairro());
            preparedStatement.setString(11, cliente.getComplemento());
            preparedStatement.setString(12, cliente.getCidade());
            preparedStatement.setString(13, cliente.getTelefoneFixo());
            preparedStatement.setString(14, cliente.getCelular());
            preparedStatement.setString(15, cliente.getEmail());
            preparedStatement.setInt(16, cliente.getPrefContato());
            preparedStatement.setBoolean(17, true);

            //Executa o comando no banco de dados
            preparedStatement.execute();
        } finally {
            //Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            //Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    //Realiza a atualização dos dados de um cliente, com ID e dados
    //fornecidos como parâmetro através de um objeto da classe "Cliente"
    public static void atualizar(Cliente cliente)
            throws SQLException, Exception {
        //Monta a string de atualização do cliente no BD, utilizando
        //prepared statement
        String sql = "UPDATE cliente SET nome = ?, dataDeNascimento = ?, sexo = ?, CPF = ?, RG = ?, estadoCivil = ?,  endereco = ?,"
                + " numero = ?, CEP = ?, bairro = ?, complemento = ?, cidade = ?, telefoneFixo = ?, celular = ?, email = ?, prefContato = ?"
                + " WHERE (idCliente = ?)";
        //Conexão para abertura e fechamento
        Connection connection = null;
        //Statement para obtenção através da conexão, execução de
        //comandos SQL e fechamentos
        PreparedStatement preparedStatement = null;
        try {
            //Abre uma conexão com o banco de dados
            connection = ConnectionUtils.getConnection();
            //Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);
            //Configura os parâmetros do "PreparedStatement"
            preparedStatement.setString(1, cliente.getNome());
            Timestamp t = new Timestamp(cliente.getDataNascimento().getTime());
            preparedStatement.setTimestamp(2, t);
            preparedStatement.setString(3, cliente.getSexo());
            preparedStatement.setString(4, cliente.getCPF());
            preparedStatement.setString(5, cliente.getRG());
            preparedStatement.setString(6, cliente.getEstadoCivil());
            preparedStatement.setString(7, cliente.getEndereco());
            preparedStatement.setInt(8, cliente.getNumero());
            preparedStatement.setString(9, cliente.getCEP());
            preparedStatement.setString(10, cliente.getBairro());
            preparedStatement.setString(11, cliente.getComplemento());
            preparedStatement.setString(12, cliente.getCidade());
            preparedStatement.setString(13, cliente.getTelefoneFixo());
            preparedStatement.setString(14, cliente.getCelular());
            preparedStatement.setString(15, cliente.getEmail());
            preparedStatement.setInt(16, cliente.getPrefContato());
            preparedStatement.setInt(17, cliente.getId());
            //Executa o comando no banco de dados
            preparedStatement.execute();
        } finally {
            //Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            //Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    //Realiza a exclusão lógica de um cliente no BD, com ID fornecido
    //como parâmetro. A exclusão lógica simplesmente "desliga" o
    //cliente, configurando um atributo específico, a ser ignorado
    //em todas as consultas de cliente ("enabled").
    public static void excluir(Integer id) throws SQLException, Exception {
        //Monta a string de atualização do cliente no BD, utilizando
        //prepared statement
        String sql = "UPDATE cliente SET enabled = ? WHERE (idCliente = ?)";
        //Conexão para abertura e fechamento
        Connection connection = null;
        //Statement para obtenção através da conexão, execução de
        //comandos SQL e fechamentos
        PreparedStatement preparedStatement = null;
        try {
            //Abre uma conexão com o banco de dados
            connection = ConnectionUtils.getConnection();
            //Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);
            //Configura os parâmetros do "PreparedStatement"
            preparedStatement.setBoolean(1, false);
            preparedStatement.setInt(2, id);

            //Executa o comando no banco de dados
            preparedStatement.execute();
        } finally {
            //Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            //Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    //Lista todos os clientes da tabela clientes
    public static List<Cliente> listar()
            throws SQLException, Exception {
        //Monta a string de listagem de clientes no banco, considerando
        //apenas a coluna de ativação de clientes ("enabled")
        String sql = "SELECT * FROM cliente WHERE (enabled=?)";
        //Lista de clientes de resultado
        List<Cliente> listaClientes = null;
        //Conexão para abertura e fechamento
        Connection connection = null;
        //Statement para obtenção através da conexão, execução de
        //comandos SQL e fechamentos
        PreparedStatement preparedStatement = null;
        //Armazenará os resultados do banco de dados
        ResultSet result = null;
        try {
            //Abre uma conexão com o banco de dados
            connection = ConnectionUtils.getConnection();
            //Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setBoolean(1, true);

            //Executa a consulta SQL no banco de dados
            result = preparedStatement.executeQuery();

            //Itera por cada item do resultado
            while (result.next()) {
                //Se a lista não foi inicializada, a inicializa
                if (listaClientes == null) {
                    listaClientes = new ArrayList<Cliente>();
                }
                //Cria uma instância de Cliente e popula com os valores do BD
                Cliente cliente = new Cliente();
                cliente.setId(result.getInt("idCliente"));
                cliente.setNome(result.getString("nome"));
                Date d = new Date(result.getTimestamp("dataDeNascimento").getTime());
                cliente.setDataNascimento(d);
                cliente.setSexo(result.getString("sexo"));
                cliente.setCPF(result.getString("CPF"));
                cliente.setRG(result.getString("RG"));
                cliente.setEstadoCivil("estadoCivil");
                cliente.setEndereco(result.getString("endereco"));
                cliente.setNumero(result.getInt("numero"));
                cliente.setCEP(result.getString("CEP"));
                cliente.setBairro(result.getString("bairro"));
                cliente.setComplemento(result.getString("complemento"));
                cliente.setCidade(result.getString("cidade"));
                cliente.setTelefoneFixo(result.getString("telefoneFixo"));
                cliente.setCelular(result.getString("celular"));
                cliente.setEmail(result.getString("email"));
                cliente.setPrefContato(result.getInt("prefContato"));
                //Adiciona a instância na lista
                listaClientes.add(cliente);
            }
        } finally {
            //Se o result ainda estiver aberto, realiza seu fechamento
            if (result != null && !result.isClosed()) {
                result.close();
            }
            //Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            //Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
        //Retorna a lista de clientes do banco de dados
        return listaClientes;
    }

    //Procura um cliente no banco de dados, de acordo com o nome
    //ou com o sobrenome, passado como parâmetro
    public static List<Cliente> procurar(String valor, int tipo)
            throws SQLException, Exception {
        String sql = null;
        
        if(tipo == 0){
            sql = "SELECT * FROM cliente WHERE nome LIKE ?"
                + " AND enabled = ?";
        }
        else{
            sql = "SELECT * FROM cliente WHERE cpf LIKE ?"
                + " AND enabled = ?";
        }
        //Lista de clientes de resultado
        List<Cliente> listaClientes = null;
        //Conexão para abertura e fechamento
        Connection connection = null;
        //Statement para obtenção através da conexão, execução de
        //comandos SQL e fechamentos
        PreparedStatement preparedStatement = null;
        //Armazenará os resultados do banco de dados
        ResultSet result = null;
        try {
            //Abre uma conexão com o banco de dados
            connection = ConnectionUtils.getConnection();
            //Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);
            //Configura os parâmetros do "PreparedStatement"
            preparedStatement.setString(1, "%" + valor + "%");
            preparedStatement.setBoolean(2, true);

            //Executa a consulta SQL no banco de dados
            result = preparedStatement.executeQuery();

            //Itera por cada item do resultado
            while (result.next()) {
                //Se a lista não foi inicializada, a inicializa
                if (listaClientes == null) {
                    listaClientes = new ArrayList<Cliente>();
                }
                //Cria uma instância de Cliente e popula com os valores do BD
                Cliente cliente = new Cliente();
                cliente.setId(result.getInt("idCliente"));
                cliente.setNome(result.getString("nome"));
                Date d = new Date(result.getTimestamp("dataDeNascimento").getTime());
                cliente.setDataNascimento(d);
                cliente.setSexo(result.getString("sexo"));
                cliente.setCPF(result.getString("CPF"));
                cliente.setRG(result.getString("RG"));
                cliente.setEstadoCivil("estadoCivil");
                cliente.setEndereco(result.getString("endereco"));
                cliente.setNumero(result.getInt("numero"));
                cliente.setCEP(result.getString("CEP"));
                cliente.setBairro(result.getString("bairro"));
                cliente.setComplemento(result.getString("complemento"));
                cliente.setCidade(result.getString("cidade"));
                cliente.setTelefoneFixo(result.getString("telefoneFixo"));
                cliente.setCelular(result.getString("celular"));
                cliente.setEmail(result.getString("email"));
                cliente.setPrefContato(result.getInt("prefContato"));
                //Adiciona a instância na lista
                listaClientes.add(cliente);
            }
        } finally {
            //Se o result ainda estiver aberto, realiza seu fechamento
            if (result != null && !result.isClosed()) {
                result.close();
            }
            //Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            //Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
        //Retorna a lista de clientes do banco de dados
        return listaClientes;
    }

    //Obtém uma instância da classe "Cliente" através de dados do
    //banco de dados, de acordo com o ID fornecido como parâmetro
    public static Cliente obter(Integer id)
            throws SQLException, Exception {
        //Compõe uma String de consulta que considera apenas o cliente
        //com o ID informado e que esteja ativo ("enabled" com "true")
        String sql = "SELECT * FROM cliente WHERE (idCliente = ? AND enabled = ?)";

        //Conexão para abertura e fechamento
        Connection connection = null;
        //Statement para obtenção através da conexão, execução de
        //comandos SQL e fechamentos
        PreparedStatement preparedStatement = null;
        //Armazenará os resultados do banco de dados
        ResultSet result = null;
        try {
            //Abre uma conexão com o banco de dados
            connection = ConnectionUtils.getConnection();
            //Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);
            //Configura os parâmetros do "PreparedStatement"
            preparedStatement.setInt(1, id);
            preparedStatement.setBoolean(2, true);

            //Executa a consulta SQL no banco de dados
            result = preparedStatement.executeQuery();

            //Verifica se há pelo menos um resultado
            if (result.next()) {
                //Cria uma instância de Cliente e popula com os valores do BD
                Cliente cliente = new Cliente();
                cliente.setId(result.getInt("idCliente"));
                cliente.setNome(result.getString("nome"));
                Date d = new Date(result.getTimestamp("dataDeNascimento").getTime());
                cliente.setDataNascimento(d);
                cliente.setSexo(result.getString("sexo"));
                cliente.setCPF(result.getString("CPF"));
                cliente.setRG(result.getString("RG"));
                cliente.setEstadoCivil("estadoCivil");
                cliente.setEndereco(result.getString("endereco"));
                cliente.setNumero(result.getInt("numero"));
                cliente.setCEP(result.getString("CEP"));
                cliente.setBairro(result.getString("bairro"));
                cliente.setComplemento(result.getString("complemento"));
                cliente.setCidade(result.getString("cidade"));
                cliente.setTelefoneFixo(result.getString("telefoneFixo"));
                cliente.setCelular(result.getString("celular"));
                cliente.setEmail(result.getString("email"));
                cliente.setPrefContato(result.getInt("prefContato"));

                //Retorna o resultado
                return cliente;
            }
        } finally {
            //Se o result ainda estiver aberto, realiza seu fechamento
            if (result != null && !result.isClosed()) {
                result.close();
            }
            //Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            //Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }

        //Se chegamos aqui, o "return" anterior não foi executado porque
        //a pesquisa não teve resultados
        //Neste caso, não há um elemento a retornar, então retornamos "null"
        return null;
    }
}
