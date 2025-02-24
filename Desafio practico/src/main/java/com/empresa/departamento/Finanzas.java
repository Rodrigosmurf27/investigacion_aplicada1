package com.empresa.departamento;

import com.empresa.interfaces.Gestionable;
import com.empresa.model.Desarrollador;
import com.empresa.model.Empleado;

import java.util.List;

public class Finanzas extends Departamento implements Gestionable {

    @Override
    public void contratar(Empleado e) {
        // No implementado en Finanzas
    }

    @Override
    public void despedir(Empleado e) {
        // No implementado en Finanzas
    }

    @Override
    public void procesarPago(Empleado e) {
        if (empleados.contains(e) && e instanceof Desarrollador) {
            Desarrollador dev = (Desarrollador) e;
            if (dev.getProyectoAsignado() == null) {
                throw new IllegalStateException("El desarrollador " + e.getNombre() + " no está asignado a un proyecto.");
            }
        }
        if (!empleados.contains(e)) {
            throw new IllegalStateException("El empleado " + e.getNombre() + " no está activo.");
        }
    }

    @Override
    public void agregarEmpleado(Empleado e) {
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

