package com.exemple.services;

import java.util.List;



import com.exemple.models.Cliente;


public interface ClienteService   {

	
	
List<Cliente> getAllCliente();
	
	Cliente getClienteById(Long id);
	
	Cliente saveCliente( Cliente cliente);
	
	Cliente upDateCliente(Long id, Cliente clienteUpdated);
	
	
	void deleteById(Long id);
	
}
