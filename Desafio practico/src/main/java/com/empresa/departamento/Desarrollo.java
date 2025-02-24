package com.empresa.departamento;

import com.empresa.model.Empleado;
import com.empresa.model.Gerente;

import java.util.List;

public class Desarrollo extends Departamento {

    @Override
    public void agregarEmpleado(Empleado e) {
        if (e instanceof Gerente) {
            Gerente gerente = (Gerente) e;
            if (gerente.getEquipo().size() < 3) {
                throw new IllegalStateException("El gerente " + e.getNombre() + " debe supervisar a un equipo de mínimo 3 desarrolladores.");
            }
        }
        empleados.add(e);
    }

    @Override
    public void removerEmpleado(Empleado e) {
        empleados.remove(e);
    }

    @Override
    public double calcularPresupuesto() {
        return presupuesto;
    }
}