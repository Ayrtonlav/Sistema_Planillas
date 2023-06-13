package Modelo;

public class Usuarios {

    private String nombre;
    private String apellido;
    private String codigoUTP;
    private String correo;
    private String password;
    
    //METODOS CONSTRUCTORES
    public Usuarios() {
    }

    public Usuarios(String nombre, String apellido, String codigoUTP, String correo, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoUTP = codigoUTP;
        this.correo = correo;
        this.password = password;
    }

    public Usuarios(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
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

    public String getCodigoUTP() {
        return codigoUTP;
    }

    public void setCodigoUTP(String codigoUTP) {
        this.codigoUTP = codigoUTP;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
