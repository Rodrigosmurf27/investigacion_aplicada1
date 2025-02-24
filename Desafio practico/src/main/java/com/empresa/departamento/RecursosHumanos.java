package com.empresa.departamento;

import com.empresa.interfaces.Gestionable;
import com.empresa.model.Empleado;
import java.util.ArrayList;
import java.util.List;

public class RecursosHumanos extends Departamento implements Gestionable {

    @Override
    public void contratar(Empleado e) {
        if (presupuesto >= e.getSalario()) {
            agregarEmpleado(e);
            presupuesto -= e.getSalario();
        } else {
            throw new IllegalStateException("No hay presupuesto disponible para contratar a " + e.getNombre());
        }
    }

    @Override
    public void despedir(Empleado e) {
        removerEmpleado(e);
        presupuesto += e.getSalario();
    }

    @Override
    public void procesarPago(Empleado e) {
        // No implementado en Recursos Humanos
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