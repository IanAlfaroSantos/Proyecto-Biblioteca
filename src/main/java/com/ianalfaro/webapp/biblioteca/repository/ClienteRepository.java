package com.ianalfaro.webapp.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ianalfaro.webapp.biblioteca.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
