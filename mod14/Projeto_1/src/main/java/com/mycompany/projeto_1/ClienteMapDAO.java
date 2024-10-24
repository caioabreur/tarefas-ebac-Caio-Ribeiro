package com.mycompany.projeto_1;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ClienteMapDAO implements IClienteDAO{

    private Map<String, Cliente> map;

    public ClienteMapDAO() {
        map = new TreeMap<>();
    }

    @Override
    public Boolean cadastrar(Cliente cliente) {
        if (map.containsKey(cliente.getCpf())) {
            return false;
        }

        map.put(cliente.getCpf(), cliente);
        return true;
    }

    @Override
    public void excluir(String cpf) {
        Cliente clienteCadastrado = map.get(cpf);
        map.remove(clienteCadastrado.getCpf(), clienteCadastrado);
    }

    @Override
    public void alterar(Cliente cliente) {
        Cliente clienteCadastrado = map.get(cliente.getCpf());
        clienteCadastrado.setNome(cliente.getNome());
        clienteCadastrado.setCpf(cliente.getCpf());
        clienteCadastrado.setTel(cliente.getTel());
        clienteCadastrado.setEnd(cliente.getEnd());
    }

    @Override
    public Cliente consultar(String cpf) {
        return this.map.get(cpf);
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return this.map.values();
    }
}
