package sv.edu.udb.modelo;

import java.util.List;

public class Gerente extends Empleado {
    private List<Desarrollador> categoria;

    public Gerente(String nombre, int id, double salario, List<Desarrollador> categoria) {
        super(nombre, id, salario, "Gerente");
    }
}
