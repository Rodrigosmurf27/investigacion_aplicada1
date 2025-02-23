package sv.edu.udb.departamento;

import sv.edu.udb.modelo.Empleado;

public abstract class Departamento {

    public abstract void agregarEmpleado(Empleado employee);

    public abstract void removerEmpleado(Empleado employee);

    public abstract double calcularPresupuesto();
}


