package com.example.CRUDWithPostman.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CRUDWithPostman.entity.Cliente;
import com.example.CRUDWithPostman.service.ClienteService;

@RestController
@RequestMapping("/clientes")

public class ClienteController {

	private final ClienteService service;
	
	//creamos la clase Cliente Controllador para poder hacer las consultas desde el Postman
	public ClienteController(ClienteService service)
	{
		this.service = service;
	}
	
	
	//con esta query CONSULTAMOS un registro
	@GetMapping
	
	public Iterable<Cliente> List()
	{
		return service.List();
	}
	
	
	//Con esta query ENCONTRAMOS un registro
	@GetMapping("/{id}")
	
	public Cliente find(@PathVariable ("id") int id)
	{
		return service.find(id);
	}
	
	
	//Con esta query CREAMOS un registro
	@PostMapping
	
	public Cliente create(@RequestBody Cliente cliente)
	{
		return service.save(cliente);
	}
	
	
	//Con esta query ACTUALIZAMOS un registo
	@PutMapping("/{id}")
	
	public Cliente update(@PathVariable ("id") int id, @RequestBody Cliente cliente)
	{
		return service.update(id, cliente);
	}
	
	
	
	//Con esta query borramos un registro
	@DeleteMapping("/{id}")
	
	public boolean delete(@PathVariable ("id") int id)
	{
		return service.delete(id);
	}
	
	
	
	
}
