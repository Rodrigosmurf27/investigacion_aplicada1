package sv.edu.udb.modelo;

public class Contador extends Empleado {
    public Contador(String nombre, int id, double salario) {
        super(nombre, id, salario, "Contador");
    }

    @Override
    public boolean isActivo() {
        return false;
    }
}
