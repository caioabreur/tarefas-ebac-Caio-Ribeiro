package br.com.cribeiro.dao;

import br.com.cribeiro.domain.Cliente;

import java.sql.SQLException;
import java.util.List;

public interface IClienteDAO {

    public Integer cadastrar(Cliente cliente) throws Exception;

    Cliente consultar(String codigo) throws SQLException;

    Integer excluir(Cliente clienteBD) throws SQLException;

    Integer atualizar(Cliente cliente) throws SQLException;

    List<Cliente> consultarTodos() throws SQLException;
}
