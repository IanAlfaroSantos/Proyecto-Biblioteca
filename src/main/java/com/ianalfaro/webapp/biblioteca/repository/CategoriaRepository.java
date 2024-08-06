package com.ianalfaro.webapp.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ianalfaro.webapp.biblioteca.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
