package br.com.cribeiro.dao;

import br.com.cribeiro.domain.Cliente;
import br.com.cribeiro.jdbc.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO implements IClienteDAO {

    @Override
    public Integer cadastrar(Cliente cliente) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;

        try {
            connection = ConnectionFactory.getConnection();
            String sql = "INSERT INTO TB_CLIENTE (ID, CODIGO, NOME) VALUES (nextval('SQ_CLIENTE'), ?, ?)";
            stm = connection.prepareStatement(sql);
            stm.setString(1, cliente.getCodigo());
            stm.setString(2, cliente.getNome());
            return stm.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            if (stm  != null && !connection.isClosed()) {
                connection.close();
            }
            if (connection  != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    @Override
    public Cliente consultar(String codigo) throws SQLException {
        Connection connection = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        Cliente cliente = null;

        try {
            connection = ConnectionFactory.getConnection();
            String sql = "SELECT * FROM tb_cliente WHERE codigo = ?";
            stm = connection.prepareStatement(sql);
            stm.setString(1, codigo);
            rs = stm.executeQuery();

            if (rs.next()) {
                cliente = new Cliente();
                cliente.setId(rs.getLong("id"));
                cliente.setCodigo(rs.getString("codigo"));
                cliente.setNome(rs.getString("nome"));
            }
            return cliente;
        } catch (Exception e) {
            throw e;
        } finally {
            if (stm  != null && !connection.isClosed()) {
                connection.close();
            }
            if (connection  != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    @Override
    public Integer excluir(Cliente cliente) throws SQLException {
        Connection connection = null;
        PreparedStatement stm = null;

        try {
            connection = ConnectionFactory.getConnection();
            String sql = "DELETE FROM tb_cliente WHERE codigo = ?";
            stm = connection.prepareStatement(sql);
            stm.setString(1, cliente.getCodigo());
            return stm.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            if (stm  != null && !connection.isClosed()) {
                connection.close();
            }
            if (connection  != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    @Override
    public Integer atualizar(Cliente cliente) throws SQLException {
        Connection connection = null;
        PreparedStatement stm = null;

        try {
            connection = ConnectionFactory.getConnection();
            String sql = "UPDATE tb_cliente SET nome = ?, codigo = ? WHERE id = ?";
            stm = connection.prepareStatement(sql);
            stm.setString(1, cliente.getNome());
            stm.setString(2, cliente.getCodigo());
            stm.setLong(3, cliente.getId());
            return stm.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (stm  != null && !connection.isClosed()) {
                connection.close();
            }
            if (connection  != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    @Override
    public List<Cliente> consultarTodos() throws SQLException {
        Connection connection = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        List<Cliente> list = new ArrayList<>();
        Cliente cliente = null;

        try {
            connection = ConnectionFactory.getConnection();
            String sql = "SELECT * FROM tb_cliente";
            stm = connection.prepareStatement(sql);
            rs = stm.executeQuery();

            while (rs.next()) {
                cliente = new Cliente();
                cliente.setId(rs.getLong("ID"));
                cliente.setNome(rs.getString("NOME"));
                cliente.setCodigo(rs.getString("CODIGO"));
                list.add(cliente);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (stm  != null && !connection.isClosed()) {
                connection.close();
            }
            if (connection  != null && !connection.isClosed()) {
                connection.close();
            }
        }
        return list;
    }
}
