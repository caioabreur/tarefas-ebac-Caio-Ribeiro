package br.com.cribeiro.dao;

import br.com.cribeiro.domain.Produto;

import java.sql.SQLException;
import java.util.List;

public interface IProdutoDAO {

    Integer cadastrar(Produto produto) throws Exception;
    Produto consultar(String codigo) throws SQLException;
    Integer excluir(Produto produto) throws SQLException;
    Integer atualizar(Produto produto) throws SQLException;
    List<Produto> consultarTodos() throws SQLException;
}