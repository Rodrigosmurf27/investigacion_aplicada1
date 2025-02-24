package com.empresa.departamento;

import com.empresa.model.Empleado;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public abstract class Departamento {
    protected List<Empleado> empleados;
    protected double presupuesto;

    public abstract void agregarEmpleado(Empleado e);
    public abstract void removerEmpleado(Empleado e);
    public abstract double calcularPresupuesto();
}
