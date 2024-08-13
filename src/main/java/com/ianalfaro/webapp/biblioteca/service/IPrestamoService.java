package com.ianalfaro.webapp.biblioteca.service;

import java.util.List;

import com.ianalfaro.webapp.biblioteca.model.Prestamo;

public interface IPrestamoService {

    public List<Prestamo> listarPrestamo();

    public Prestamo buscarPrestamoPorId(Long id);

    public Prestamo guardarPrestamo(Prestamo prestamo);
    
    public void eliminarPrestamo(Prestamo prestamo);

}
