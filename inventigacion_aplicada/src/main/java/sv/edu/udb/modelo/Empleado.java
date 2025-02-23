package sv.edu.udb.modelo;

public abstract class Empleado {
    private String nombre;
    private int id;
    private double salario;
    private String departamento;



    public Empleado(String nombre, int id, double salario, String departamento) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
        this.departamento = departamento;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

}

