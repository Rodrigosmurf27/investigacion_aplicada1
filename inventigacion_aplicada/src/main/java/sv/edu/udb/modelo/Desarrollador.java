package sv.edu.udb.modelo;

public class Desarrollador extends Empleado {
    private String Especialidad;

    public Desarrollador(String nombre, int id, double salario, String Especialidad) {
        super(nombre, id, salario, "Desarrollador");
        this.Especialidad = Especialidad;
    }



}
