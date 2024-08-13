package com.ianalfaro.webapp.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ianalfaro.webapp.biblioteca.model.Prestamo;

public interface PrestamoRepository extends JpaRepository<Prestamo, Long>{

}
