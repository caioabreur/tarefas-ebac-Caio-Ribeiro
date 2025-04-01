package br.com.cribeiro;

import br.com.cribeiro.dao.IProdutoDAO;
import br.com.cribeiro.dao.ProdutoDAO;
import br.com.cribeiro.domain.Produto;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.*;

public class ProdutoTest {

    @Test
    public void cadastrarTest() throws Exception {
        IProdutoDAO dao = new ProdutoDAO();

        Produto produto = new Produto();
        produto.setCodigo("P001");
        produto.setNome("Notebook");
        produto.setPreco(3500.00);

        Integer qtd = dao.cadastrar(produto);
        assertTrue(qtd == 1);

        Produto produtoBD = dao.consultar(produto.getCodigo());
        assertNotNull(produtoBD);
        assertNotNull(produtoBD.getId());
        assertEquals(produto.getCodigo(), produtoBD.getCodigo());
        assertEquals(produto.getNome(), produtoBD.getNome());
        assertEquals(produto.getPreco(), produtoBD.getPreco());

        Integer qtdDel = dao.excluir(produtoBD);
        assertNotNull(qtdDel);
    }

    @Test
    public void consultarTest() throws Exception {
        IProdutoDAO dao = new ProdutoDAO();

        Produto produto = new Produto();
        produto.setCodigo("P002");
        produto.setNome("Teclado");
        produto.setPreco(150.00);
        Integer countCad = dao.cadastrar(produto);
        assertTrue(countCad == 1);

        Produto produtoBD = dao.consultar("P002");
        assertNotNull(produtoBD);
        assertEquals(produto.getCodigo(), produtoBD.getCodigo());
        assertEquals(produto.getNome(), produtoBD.getNome());
        assertEquals(produto.getPreco(), produtoBD.getPreco());

        Integer countDel = dao.excluir(produtoBD);
        assertTrue(countDel == 1);
    }

    @Test
    public void excluirTest() throws Exception {
        IProdutoDAO dao = new ProdutoDAO();

        Produto produto = new Produto();
        produto.setCodigo("P003");
        produto.setNome("Mouse");
        produto.setPreco(80.00);
        Integer countCad = dao.cadastrar(produto);
        assertTrue(countCad == 1);

        Produto produtoBD = dao.consultar("P003");
        assertNotNull(produtoBD);
        assertEquals(produto.getCodigo(), produtoBD.getCodigo());
        assertEquals(produto.getNome(), produtoBD.getNome());
        assertEquals(produto.getPreco(), produtoBD.getPreco());

        Integer countDel = dao.excluir(produtoBD);
        assertTrue(countDel == 1);
    }

    @Test
    public void consultarTodosTest() throws Exception {
        IProdutoDAO dao = new ProdutoDAO();

        Produto produto1 = new Produto();
        produto1.setCodigo("P004");
        produto1.setNome("Monitor");
        produto1.setPreco(800.00);
        Integer countCad1 = dao.cadastrar(produto1);
        assertTrue(countCad1 == 1);

        Produto produto2 = new Produto();
        produto2.setCodigo("P005");
        produto2.setNome("Impressora");
        produto2.setPreco(450.00);
        Integer countCad2 = dao.cadastrar(produto2);
        assertTrue(countCad2 == 1);

        List<Produto> list = dao.consultarTodos();
        assertNotNull(list);
        assertEquals(2, list.size());

        int countDel = 0;
        for (Produto prod : list) {
            dao.excluir(prod);
            countDel++;
        }
        assertEquals(list.size(), countDel);

        list = dao.consultarTodos();
        assertEquals(list.size(), 0);
    }

    @Test
    public void atualizarTest() throws Exception {
        IProdutoDAO dao = new ProdutoDAO();

        Produto produto = new Produto();
        produto.setCodigo("P006");
        produto.setNome("Webcam");
        produto.setPreco(200.00);
        Integer countCad = dao.cadastrar(produto);
        assertTrue(countCad == 1);

        Produto produtoBD = dao.consultar("P006");
        assertNotNull(produtoBD);
        assertEquals(produto.getCodigo(), produtoBD.getCodigo());
        assertEquals(produto.getNome(), produtoBD.getNome());
        assertEquals(produto.getPreco(), produtoBD.getPreco());

        produtoBD.setCodigo("P007");
        produtoBD.setNome("Webcam HD");
        produtoBD.setPreco(250.00);
        Integer countUpdate = dao.atualizar(produtoBD);
        assertTrue(countUpdate == 1);

        Produto produtoBD1 = dao.consultar("P006");
        assertNull(produtoBD1);

        Produto produtoBD2 = dao.consultar("P007");
        assertNotNull(produtoBD2);
        assertEquals(produtoBD.getId(), produtoBD2.getId());
        assertEquals(produtoBD.getCodigo(), produtoBD2.getCodigo());
        assertEquals(produtoBD.getNome(), produtoBD2.getNome());
        assertEquals(produtoBD.getPreco(), produtoBD2.getPreco());

        List<Produto> list = dao.consultarTodos();
        for (Produto prod : list) {
            dao.excluir(prod);
        }
    }
}