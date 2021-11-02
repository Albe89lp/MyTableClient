package com.example.CRUDWithPostman.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.CRUDWithPostman.entity.Cliente;

@Service
public class ClienteService {

	//Listado Clientes
	
	private List<Cliente> clientes;
	
	public ClienteService()
	{
		clientes = new ArrayList<>();
		clientes.add(new Cliente(1, "Alberto","Castellanos","45775020Y"));
		clientes.add(new Cliente(2, "Simona","Silas","43215685S"));
		clientes.add(new Cliente(3, "Leo","Castellanos","65475020Y"));
	}
	
	
	//creamos nuestro listado
	public List<Cliente> List()
	{
		return clientes;
	}
	
	//Buscar un cliente en la lista
	
	public Cliente find(int id)
	{
		for(Cliente cliente : clientes)
		{
			if(cliente.getId()== id)
				return cliente;
		}
		return null;
	}
	
	//Crear cliente
	
	public Cliente save(Cliente cli)
	{
		clientes.add(cli);
		return cli;
	}

	//Actualizar Cliente
	
	public Cliente update(int id, Cliente cli)
	{
		int index= 0;
		for (Cliente l: clientes)
		{
			if(l.getId()== id)
			{
				cli.setId(id);;
				clientes.set(index, cli);
			}
		}
		return cli;
	}
	
	//Eliminar cliente de la lista
	
	public boolean delete(int id)
	{
		for(Cliente c : clientes)
		{
			if(c.getId() == id)
			{
				return clientes.remove(c);
			}
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
