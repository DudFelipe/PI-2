/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.LojaEletronicos.DAO;

import br.senac.LojaEletronicos.Modelos.Produto;
import br.senac.LojaEletronicos.Utils.ConnectionUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author giovanebarreira
 */
public class ProdutoDao {
    
    //Data Access Object de Cliente. Realiza operações de BD com o cliente. 
    
    //Insere um cliente na tabela "cliente" do banco de dados
    public static void inserirProduto(Produto p)
            throws SQLException, Exception {
        //Monta a string de inserção de um cliente no BD,
        //utilizando os dados do clientes passados como parâmetro
        String sql = "INSERT INTO produto (nome, fabricante, "
                + "modelo, preco, quantidade, dimensoes, enabled) VALUES (?, ?, ?, ?, ?, ?, ?)";
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
            preparedStatement.setString(1, p.getNome());
            preparedStatement.setString(2, p.getFabricante());
            preparedStatement.setString(3, p.getModelo());
            preparedStatement.setFloat(4, p.getPreco());
            preparedStatement.setInt(5, p.getQuantidade());
            preparedStatement.setString(6, p.getDimensoes());
            preparedStatement.setBoolean(7, true);

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
    public static void atualizarProduto(Produto p) throws SQLException, Exception {
        //Monta a string de atualização do cliente no BD, utilizando
        //prepared statement
        String sql = "UPDATE produto SET nome=?, fabricante=?, modelo=?, preco=?, quantidade=?, dimensoes=?"
                + " WHERE idProduto = ?";
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
            preparedStatement.setString(1, p.getNome());
            preparedStatement.setString(2, p.getFabricante());
            preparedStatement.setString(3, p.getModelo());
            preparedStatement.setFloat(4, p.getPreco());
            preparedStatement.setInt(5, p.getQuantidade());
            preparedStatement.setString(6, p.getDimensoes());
            preparedStatement.setInt(7, p.getIdProduto());

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
    public static void excluirProduto(Integer id) throws SQLException, Exception {
        //Monta a string de atualização do cliente no BD, utilizando
        //prepared statement
        String sql = "UPDATE produto SET enabled=? WHERE (idProduto=?)";
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
    public static List<Produto> listarProdutos()
            throws SQLException, Exception {
        //Monta a string de listagem de clientes no banco, considerando
        //apenas a coluna de ativação de clientes ("enabled")
        String sql = "SELECT * FROM produto WHERE (enabled=?)";
        //Lista de clientes de resultado
        List<Produto> listaProduto = null;
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
                if (listaProduto == null) {
                    listaProduto = new ArrayList<Produto>();
                }
                //Cria uma instância de Cliente e popula com os valores do BD
                Produto p = new Produto();
                p.setId(result.getInt("idProduto"));
                p.setNome(result.getString("nome"));
                p.setFabricante(result.getString("fabricante"));
                p.setModelo(result.getString("modelo"));
                p.setPreco(result.getFloat("preco"));
                p.setQuantidade(result.getInt("quantidade"));
                p.setDimensoes(result.getString("dimensoes"));
                
                //Adiciona a instância na lista
                listaProduto.add(p);
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
        return listaProduto;
    }

    //Procura um cliente no banco de dados, de acordo com o nome
    //ou com o sobrenome, passado como parâmetro
    public static List<Produto> procurar(String valor, int tipo)
            throws SQLException, Exception {
        
        String sql = null;
        
        if(tipo == 0){
            sql = "SELECT * FROM produto WHERE (nome LIKE ?) "
                    + "AND enabled = ?";
        }else{
            sql = "SELECT * FROM produto WHERE (fabricante LIKE ?) "
                    + "AND enabled = ?";
        }
        
        //Lista de clientes de resultado
        List<Produto> listaProduto = null;
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
                if (listaProduto == null) {
                    listaProduto = new ArrayList<Produto>();
                }
                //Cria uma instância de Cliente e popula com os valores do BD
                Produto p = new Produto();
                p.setId(result.getInt("idProduto"));
                p.setNome(result.getString("nome"));
                p.setFabricante(result.getString("fabricante"));
                p.setModelo(result.getString("modelo"));
                p.setPreco(result.getFloat("preco"));
                p.setQuantidade(result.getInt("quantidade"));
                p.setDimensoes(result.getString("dimensoes"));
                
                //Adiciona a instância na lista
                listaProduto.add(p);
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
        return listaProduto;
    }

    //Obtém uma instância da classe "Cliente" através de dados do
    //banco de dados, de acordo com o ID fornecido como parâmetro
    public static Produto obter(Integer id)
            throws SQLException, Exception {
        //Compõe uma String de consulta que considera apenas o cliente
        //com o ID informado e que esteja ativo ("enabled" com "true")
        String sql = "SELECT * FROM produto WHERE (idProduto=? AND enabled=?)";

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
                Produto p = new Produto();
                p.setId(result.getInt("idProduto"));
                p.setNome(result.getString("nome"));
                p.setFabricante(result.getString("fabricante"));
                p.setModelo(result.getString("modelo"));
                p.setPreco(result.getFloat("preco"));
                p.setQuantidade(result.getInt("quantidade"));
                p.setDimensoes(result.getString("dimensoes"));

                //Retorna o resultado
                return p;
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


