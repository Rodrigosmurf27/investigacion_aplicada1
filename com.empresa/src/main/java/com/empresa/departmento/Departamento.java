package com.empresa.departmento;

import com.empresa.modelo.Empleado;

public abstract class Departamento {
    public abstract void agregarEmpleado(Empleado empleado);

    public abstract void removerEmpleado(Empleado empleado);

    public abstract double calcularPresupuesto();
}