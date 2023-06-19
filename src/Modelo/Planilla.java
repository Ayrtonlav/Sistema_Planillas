package Modelo;

import java.util.Date;

public class Planilla extends Personal{
    private Date mes_y_año_planilla;
    private int horas_trabajadas;
    private int dias_laborados;
    private float descuento;
    private float Salario_neto;

    public Planilla() {
    }

    public Planilla(Date mes_y_año_planilla, int horas_trabajadas, int dias_laborados, float descuento, float Salario_neto) {
        this.mes_y_año_planilla = mes_y_año_planilla;
        this.horas_trabajadas = horas_trabajadas;
        this.dias_laborados = dias_laborados;
        this.descuento = descuento;
        this.Salario_neto = Salario_neto;
    }

    public Planilla(Date mes_y_año_planilla, int horas_trabajadas, int dias_laborados, float descuento, float Salario_neto, String nombre, String apellido, String dni, String direccion, String Distrito, String Provincia, String Departamento, String genero, String estado, Date fecha_nacimiento, String email, String telefono, String regPension, String num_Cuenta, Date fecha_ingreso, Date fecha_salida) {
        super(nombre, apellido, dni, direccion, Distrito, Provincia, Departamento, genero, estado, fecha_nacimiento, email, telefono, regPension, num_Cuenta, fecha_ingreso, fecha_salida);
        this.mes_y_año_planilla = mes_y_año_planilla;
        this.horas_trabajadas = horas_trabajadas;
        this.dias_laborados = dias_laborados;
        this.descuento = descuento;
        this.Salario_neto = Salario_neto;
    }

    public Date getMes_y_año_planilla() {
        return mes_y_año_planilla;
    }

    public void setMes_y_año_planilla(Date mes_y_año_planilla) {
        this.mes_y_año_planilla = mes_y_año_planilla;
    }

    public int getHoras_trabajadas() {
        return horas_trabajadas;
    }

    public void setHoras_trabajadas(int horas_trabajadas) {
        this.horas_trabajadas = horas_trabajadas;
    }

    public int getDias_laborados() {
        return dias_laborados;
    }

    public void setDias_laborados(int dias_laborados) {
        this.dias_laborados = dias_laborados;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public float getSalario_neto() {
        return Salario_neto;
    }

    public void setSalario_neto(float Salario_neto) {
        this.Salario_neto = Salario_neto;
    }
    
    
    
}
