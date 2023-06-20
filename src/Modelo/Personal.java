package Modelo;

import java.util.Date;

public class Personal extends Cargo{
    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;
    private String Distrito;
    private String Provincia;
    private String Departamento;
    private String genero;
    private String estado;
    private Date fecha_nacimiento;	
    private String email;
    private String telefono;
    private String regPension;
    private String num_Cuenta;
    private Date fecha_ingreso;
    private Date fecha_salida;

    public Personal() {
    }

    public Personal(String nombre, String apellido, String dni, String direccion, String Distrito, String Provincia, String Departamento, String genero, String estado, Date fecha_nacimiento, String email, String telefono, String regPension, String num_Cuenta, Date fecha_ingreso, Date fecha_salida) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.Distrito = Distrito;
        this.Provincia = Provincia;
        this.Departamento = Departamento;
        this.genero = genero;
        this.estado = estado;
        this.fecha_nacimiento = fecha_nacimiento;
        this.email = email;
        this.telefono = telefono;
        this.regPension = regPension;
        this.num_Cuenta = num_Cuenta;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_salida = fecha_salida;
    }

    public Personal(String nombre, String apellido, String dni, String direccion, String Distrito, String Provincia, String Departamento, String genero, String estado, Date fecha_nacimiento, String email, String telefono, String regPension, String num_Cuenta, Date fecha_ingreso, Date fecha_salida, int id_cargo) {
        super(id_cargo);
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.Distrito = Distrito;
        this.Provincia = Provincia;
        this.Departamento = Departamento;
        this.genero = genero;
        this.estado = estado;
        this.fecha_nacimiento = fecha_nacimiento;
        this.email = email;
        this.telefono = telefono;
        this.regPension = regPension;
        this.num_Cuenta = num_Cuenta;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_salida = fecha_salida;
    }


    public Personal(String nombre, String apellido, String dni, String direccion, String Distrito, String Provincia, String Departamento, String genero, String estado, Date fecha_nacimiento, String email, String telefono, String regPension, String num_Cuenta, Date fecha_ingreso, Date fecha_salida, String nombre_cargo, String nombre_Departamento) {
        super(nombre_cargo, nombre_Departamento);
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.Distrito = Distrito;
        this.Provincia = Provincia;
        this.Departamento = Departamento;
        this.genero = genero;
        this.estado = estado;
        this.fecha_nacimiento = fecha_nacimiento;
        this.email = email;
        this.telefono = telefono;
        this.regPension = regPension;
        this.num_Cuenta = num_Cuenta;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_salida = fecha_salida;
    }

    public Personal(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDistrito() {
        return Distrito;
    }

    public void setDistrito(String Distrito) {
        this.Distrito = Distrito;
    }

    public String getProvincia() {
        return Provincia;
    }

    public void setProvincia(String Provincia) {
        this.Provincia = Provincia;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRegPension() {
        return regPension;
    }

    public void setRegPension(String regPension) {
        this.regPension = regPension;
    }

    public String getNum_Cuenta() {
        return num_Cuenta;
    }

    public void setNum_Cuenta(String num_Cuenta) {
        this.num_Cuenta = num_Cuenta;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }
    
    
}
