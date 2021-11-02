package com.example.CRUDWithPostman.entity;

public class Cliente {

	private int id;
	private String nombre;
	private String apellidos;
	private String dni;
	
	//creamos el constructor solo con la clase
	public Cliente() {
		
	}

	
	
	// creamos el constructor con todas las variables
	public Cliente(int id, String nombre, String apellidos, String dni) {
		
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}




	//creamos los Getter y los Setters de la clase Cliente
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	
}
