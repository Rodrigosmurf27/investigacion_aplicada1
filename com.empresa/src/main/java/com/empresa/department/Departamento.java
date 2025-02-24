package com.empresa.department;

import com.empresa.model.Empleado;

public abstract class Departamento {
    public abstract void agregarEmpleado(Empleado empleado);

    public abstract void removerEmpleado(Empleado empleado);

    public abstract double calcularPresupuesto();
}