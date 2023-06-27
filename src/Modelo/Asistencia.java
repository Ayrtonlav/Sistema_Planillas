package Modelo;

import java.util.Date;

public class Asistencia {
    private int id_personal;
    private String asistencia;
    private Date fecha;
    private int hora_ingreso;
    private int min_ingreso;
    private int hora_salida;
    private int min_salida;
    
    public Asistencia() {
    }

    public Asistencia(int id_personal, String asistencia, Date fecha, int hora_ingreso, int min_ingreso, int hora_salida, int min_salida) {
        this.id_personal = id_personal;
        this.asistencia = asistencia;
        this.fecha = fecha;
        this.hora_ingreso = hora_ingreso;
        this.min_ingreso = min_ingreso;
        this.hora_salida = hora_salida;
        this.min_salida = min_salida;
    }

    
    public Asistencia(int id_personal) {
        this.id_personal = id_personal;
    }

    public int getId_personal() {
        return id_personal;
    }

    public void setId_personal(int id_personal) {
        this.id_personal = id_personal;
    }

    public String getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(String asistencia) {
        this.asistencia = asistencia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getHora_ingreso() {
        return hora_ingreso;
    }

    public void setHora_ingreso(int hora_ingreso) {
        this.hora_ingreso = hora_ingreso;
    }

    public int getMin_ingreso() {
        return min_ingreso;
    }

    public void setMin_ingreso(int min_ingreso) {
        this.min_ingreso = min_ingreso;
    }

    public int getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(int hora_salida) {
        this.hora_salida = hora_salida;
    }

    public int getMin_salida() {
        return min_salida;
    }

    public void setMin_salida(int min_salida) {
        this.min_salida = min_salida;
    }

}
