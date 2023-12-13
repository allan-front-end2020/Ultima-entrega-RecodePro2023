package com.exemple.models;


import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;


@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="cliente_nome", length= 50)
	private String nome;
	
	@Column(length= 14 )
	private String CPF;
	
	
	
	@ManyToMany( mappedBy="clientes")
	private Set<Destino> destino = new HashSet<>();



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCPF() {
		return CPF;
	}



	public void setCPF(String cPF) {
		CPF = cPF;
	}



	public Set<Destino> getDestino() {
		return destino;
	}



	public void setDestino(Set<Destino> destino) {
		this.destino = destino;
	}
	
	



	
	

}
