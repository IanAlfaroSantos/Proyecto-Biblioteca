package com.ianalfaro.webapp.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ianalfaro.webapp.biblioteca.model.Libro;

public interface LibroRepository extends JpaRepository<Libro, Long>{

}
