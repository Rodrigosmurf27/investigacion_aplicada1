package sv.edu.udb.departamento;


import sv.edu.udb.interfaz.Gestionable;
import sv.edu.udb.modelo.Empleado;

public class RecursosHumanos extends Departamento implements Gestionable {
    private double presupuesto;

    public RecursosHumanos(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public void agregarEmpleado(Empleado employee) {
        if (presupuesto >= employee.getSalario()) {
            presupuesto -= employee.getSalario();
            System.out.println("Empleado contratado: " + employee.getNombre());
        } else {
            System.out.println("No hay suficiente presupuesto para contratar" + employee.getNombre());
        }
    }

    @Override
    public void removerEmpleado(Empleado employee) {

    }

    @Override
    public double calcularPresupuesto() {
        return presupuesto;
    }
}
