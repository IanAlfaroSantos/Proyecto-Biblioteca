package com.ianalfaro.webapp.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ianalfaro.webapp.biblioteca.model.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {

}
