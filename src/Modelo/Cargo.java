package Modelo;

public class Cargo extends Departamento {
    private String nombre_cargo;

    public Cargo() {
    }

    public Cargo(String nombre_cargo) {
        this.nombre_cargo = nombre_cargo;
    }

    public Cargo(String nombre_cargo, String nombre_Departamento) {
        super(nombre_Departamento);
        this.nombre_cargo = nombre_cargo;
    }

    public String getNombre_cargo() {
        return nombre_cargo;
    }

    public void setNombre_cargo(String nombre_cargo) {
        this.nombre_cargo = nombre_cargo;
    }

}
