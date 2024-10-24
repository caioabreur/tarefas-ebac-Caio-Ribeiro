/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_1;

import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author caior
 */
public interface IClienteDAO {

    public Boolean cadastrar(Cliente cliente);

    public void excluir(String cpf);

    public void alterar(Cliente cliente);

    public Cliente consultar(String cpf);

    public Collection<Cliente> buscarTodos();

}
