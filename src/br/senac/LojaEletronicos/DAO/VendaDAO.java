/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.LojaEletronicos.DAO;

import br.senac.LojaEletronicos.Modelos.Venda;
import br.senac.LojaEletronicos.Utils.ConnectionUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

/**
 *
 * @author marcos.climeira
 */
public class VendaDAO {
    public static void inserirVenda(Venda v)
            throws SQLException, Exception {
        //Monta a string de inserção de um cliente no BD,
        //utilizando os dados do clientes passados como parâmetro
        String sql = "INSERT INTO venda (numeroDoPedido, dataVenda, "
                + "idCliente, valoTotal) VALUES (?, ?, ?, ?)";
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
            preparedStatement.setInt(1, v.getNumeroDoPedido());
            Timestamp t = new Timestamp(v.getDataVenda().getTime());
            preparedStatement.setTimestamp(2, t);
            preparedStatement.setInt(3, v.getIdCliente());
            preparedStatement.setFloat(4, v.getValorTotal());

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
}
