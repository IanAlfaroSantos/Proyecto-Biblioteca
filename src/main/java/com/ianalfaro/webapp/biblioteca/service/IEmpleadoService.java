package com.ianalfaro.webapp.biblioteca.service;

import java.util.List;

import com.ianalfaro.webapp.biblioteca.model.Empleado;

public interface IEmpleadoService {
    
    public List<Empleado> listarEmpleados();

    public Empleado buscarEmpleadoPorId(Long Id);

    public Empleado guardarEmpleado(Empleado empleado);

    public void eliminarEmpleado(Empleado empleado);

}
