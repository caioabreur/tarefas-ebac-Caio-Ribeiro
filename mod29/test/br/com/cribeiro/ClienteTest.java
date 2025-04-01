package br.com.cribeiro;

import br.com.cribeiro.dao.ClienteDAO;
import br.com.cribeiro.dao.IClienteDAO;
import br.com.cribeiro.domain.Cliente;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ClienteTest {

    @Test
    public void cadastrarTest() throws Exception {
        IClienteDAO dao = new ClienteDAO();

        Cliente cliente = new Cliente();
        cliente.setCodigo("01");
        cliente.setNome("Caio");

        Integer qtd = dao.cadastrar(cliente);
        assertTrue(qtd == 1);

        Cliente clienteBD = dao.consultar(cliente.getCodigo());
        assertNotNull(clienteBD);
        assertNotNull(clienteBD.getId());
        assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
        assertEquals(cliente.getNome(), clienteBD.getNome());

        Integer qtdDel = dao.excluir(clienteBD);
        assertNotNull(qtdDel);
    }

    @Test
    public void consultarTest() throws Exception {
        IClienteDAO clienteDAO = new ClienteDAO();

        Cliente cliente = new Cliente();
        cliente.setCodigo("10");
        cliente.setNome("Caio Ribeiro");
        Integer countCad = clienteDAO.cadastrar(cliente);
        assertTrue(countCad == 1);

        Cliente clienteBD = clienteDAO.consultar("10");
        assertNotNull(clienteBD);
        assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
        assertEquals(cliente.getNome(), clienteBD.getNome());

        Integer countDel = clienteDAO.excluir(clienteBD);
        assertTrue(countDel == 1);
    }

    @Test
    public void excluirTest() throws Exception {
        IClienteDAO clienteDAO = new ClienteDAO();

        Cliente cliente = new Cliente();
        cliente.setCodigo("10");
        cliente.setNome("Caio Ribeiro");
        Integer countCad = clienteDAO.cadastrar(cliente);
        assertTrue(countCad == 1);

        Cliente clienteBD = clienteDAO.consultar("10");
        assertNotNull(clienteBD);
        assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
        assertEquals(cliente.getNome(), clienteBD.getNome());

        Integer countDel = clienteDAO.excluir(clienteBD);
        assertTrue(countDel == 1);
    }

    @Test
    public void consultarTodosTest() throws Exception {
        IClienteDAO clienteDAO = new ClienteDAO();

        Cliente cliente = new Cliente();
        cliente.setCodigo("10");
        cliente.setNome("Caio Ribeiro");
        Integer countCad = clienteDAO.cadastrar(cliente);
        assertTrue(countCad == 1);

        Cliente clientes = new Cliente();
        clientes.setCodigo("20");
        clientes.setNome("Rogério");
        Integer countCad2 = clienteDAO.cadastrar(clientes);
        assertTrue(countCad2 == 1);

        List<Cliente> list = clienteDAO.consultarTodos();
        assertNotNull(list);
        assertEquals(2, list.size());

        int countDel = 0;
        for (Cliente cli : list) {
            clienteDAO.excluir(cli);
            countDel++;
        }
        assertEquals(list.size(), countDel);

        list = clienteDAO.consultarTodos();
        assertEquals(list.size(), 0);

    }

    @Test
    public void atualizarTest() throws Exception {
        IClienteDAO clienteDAO = new ClienteDAO();

        Cliente cliente = new Cliente();
        cliente.setCodigo("10");
        cliente.setNome("Caio Ribeiro");
        Integer countCad = clienteDAO.cadastrar(cliente);
        assertTrue(countCad == 1);

        Cliente clienteBD = clienteDAO.consultar("10");
        assertNotNull(clienteBD);
        assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
        assertEquals(cliente.getNome(), clienteBD.getNome());

        clienteBD.setCodigo("20");
        clienteBD.setNome("Rebeca");
        Integer countUpdate = clienteDAO.atualizar(clienteBD);
        assertTrue(countUpdate == 1);

        Cliente clienteBD1 = clienteDAO.consultar("10");
        assertNull(clienteBD1);

        Cliente clienteBD2 = clienteDAO.consultar("20");
        assertNotNull(clienteBD2);
        assertEquals(clienteBD.getId(), clienteBD2.getId());
        assertEquals(clienteBD.getCodigo(), clienteBD2.getCodigo());
        assertEquals(clienteBD.getNome(), clienteBD2.getNome());

        List<Cliente> list = clienteDAO.consultarTodos();
        for (Cliente cli : list) {
            clienteDAO.excluir(cli);
        }
    }
}
