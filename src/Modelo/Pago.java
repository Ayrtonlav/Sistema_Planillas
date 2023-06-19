package Modelo;

import java.util.Date;

public class Pago extends Planilla{
    private Date fecha_pago;
    private float monto_pagado;

    public Pago() {
    }

    public Pago(Date fecha_pago, float monto_pagado) {
        this.fecha_pago = fecha_pago;
        this.monto_pagado = monto_pagado;
    }

    public Pago(Date fecha_pago, float monto_pagado, Date mes_y_año_planilla, int horas_trabajadas, int dias_laborados, float descuento, float Salario_neto) {
        super(mes_y_año_planilla, horas_trabajadas, dias_laborados, descuento, Salario_neto);
        this.fecha_pago = fecha_pago;
        this.monto_pagado = monto_pagado;
    }

    public Pago(Date fecha_pago, float monto_pagado, Date mes_y_año_planilla, int horas_trabajadas, int dias_laborados, float descuento, float Salario_neto, String nombre, String apellido, String dni, String direccion, String Distrito, String Provincia, String Departamento, String genero, String estado, Date fecha_nacimiento, String email, String telefono, String regPension, String num_Cuenta, Date fecha_ingreso, Date fecha_salida) {
        super(mes_y_año_planilla, horas_trabajadas, dias_laborados, descuento, Salario_neto, nombre, apellido, dni, direccion, Distrito, Provincia, Departamento, genero, estado, fecha_nacimiento, email, telefono, regPension, num_Cuenta, fecha_ingreso, fecha_salida);
        this.fecha_pago = fecha_pago;
        this.monto_pagado = monto_pagado;
    }

    public Date getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(Date fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public float getMonto_pagado() {
        return monto_pagado;
    }

    public void setMonto_pagado(float monto_pagado) {
        this.monto_pagado = monto_pagado;
    }
    
    
}
