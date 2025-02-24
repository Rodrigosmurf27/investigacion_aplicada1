package com.empresa.model;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Empleado> empleados;
    private double presupuesto;

public class Finanzas {
    public void notificarContratacion(Empleado empleado) {
        System.out.println("Notificar a contabilidad: Contratación de " + empleado.getNombre());
    }

    public void procesarPago(Empleado empleado) {
        System.out.println("Procesar pago de " + empleado.getNombre());
    }
}
    public Empresa() {
        this.empleados = new ArrayList<>();
        this.presupuesto = 0;
}
    public Empresa(double presupuesto) {
        this.empleados = new ArrayList<>();
        this.presupuesto = presupuesto;
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void removerEmpleado(Empleado empleado) {
        empleados.remove(empleado);
    }

    public double calcularPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }
}