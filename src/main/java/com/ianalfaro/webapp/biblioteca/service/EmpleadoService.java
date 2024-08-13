package com.ianalfaro.webapp.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ianalfaro.webapp.biblioteca.model.Empleado;
import com.ianalfaro.webapp.biblioteca.repository.EmpleadoRepository;

@Service
public class EmpleadoService implements IEmpleadoService{

    @Autowired
    EmpleadoRepository empleadoRepository;

    @Override
    public List<Empleado> listarEmpleados() {
        return empleadoRepository.findAll();
    }

    @Override
    public Empleado buscarEmpleadoPorId(Long Id) {
        return empleadoRepository.findById(Id).orElse(null);
    }

    @Override
    public Empleado guardarEmpleado(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    @Override
    public void eliminarEmpleado(Empleado empleado) {
        empleadoRepository.delete(empleado);
    }

    @Override
    public Boolean verificarDpiDuplicado(Empleado empleado) {
        Boolean flag = Boolean.FALSE;
        List<Empleado> empleados = listarEmpleados();
        for (Empleado e : empleados) {
            if (e.getDpi().equals(empleado.getDpi()) && !e.getId().equals(empleado.getId())) {
                flag = Boolean.TRUE;
            }
        }
        return flag;
    }

}
