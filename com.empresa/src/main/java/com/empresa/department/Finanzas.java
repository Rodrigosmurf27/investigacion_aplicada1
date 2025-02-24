package com.empresa.department;

import com.empresa.model.Empleado;
import com.empresa.service.Gestionable;

public class Finanzas extends Departamento implements Gestionable {
    @Override
    public void contratar(Empleado e) {
        // Finanzas no contrata empleados
    }

    @Override
    public void despedir(Empleado e) {
        // Finanzas no despide empleados
    }

    @Override
    public void procesarPago(Empleado e) {
        if (e.isActivo()) {
            System.out.println("Pago procesado para: " + e.getNombre());
        } else {
            System.out.println("No se puede procesar el pago para un empleado inactivo: " + e.getNombre());
        }
    }

    @Override
    public double calcularPresupuesto() {
        return 0; // Finanzas no maneja presupuesto directamente
    }

    @Override
    public void agregarEmpleado(Empleado empleado) {
        // Finanzas no agrega empleados
    }

    @Override
    public void removerEmpleado(Empleado empleado) {
        // Finanzas no remueve empleados
    }
}