package com.example.repositorie;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemple.models.Cliente;

public interface ClienteRepository  extends JpaRepository<Cliente, Long>{

}
