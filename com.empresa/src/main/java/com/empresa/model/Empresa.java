package com.empresa.model;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Empleado> empleados;
    private double presupuesto;

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