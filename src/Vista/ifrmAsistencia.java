package Vista;

import Modelo.Asistencia;
import controlador.Conexion;
import java.sql.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ifrmAsistencia extends javax.swing.JInternalFrame {

    PreparedStatement ps;
    Connection cn;
    ResultSet rs;
    DefaultTableModel modelo;

    public ifrmAsistencia() {
        initComponents();
        mostrarLista();
        int cantidad = contarRegistros();
        posicionarItem(cantidad);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableDatos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jcbPersonal = new javax.swing.JComboBox<>();
        btnModicifar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jdcHoraIngreso = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        jdcFecha = new com.toedter.calendar.JDateChooser();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jcbAsistencia = new javax.swing.JComboBox<>();
        jdcHoraSalida = new com.toedter.calendar.JDateChooser();
        btnRegistrar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);

        tableDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_personal", "asistencia", "fecha", "hora_ingreso", "hora_salida"
            }
        ));
        tableDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableDatos);
        if (tableDatos.getColumnModel().getColumnCount() > 0) {
            tableDatos.getColumnModel().getColumn(0).setPreferredWidth(22);
            tableDatos.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Asistencia :");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Personal :");

        btnModicifar.setBackground(new java.awt.Color(102, 255, 51));
        btnModicifar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnModicifar.setText("Modificar");
        btnModicifar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModicifarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("Hora Ingreso :");

        jdcHoraIngreso.setDateFormatString("yyyy/MM/dd HH:mm");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setText("Hora Salida :");

        jdcFecha.setDateFormatString("yyyy/MM/dd");

        btnEliminar.setBackground(java.awt.Color.red);
        btnEliminar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpiar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setText("Fecha :");

        jcbAsistencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "SI", "NO" }));

        jdcHoraSalida.setDateFormatString("yyyy/MM/dd HH:mm");

        btnRegistrar.setBackground(new java.awt.Color(0, 51, 255));
        btnRegistrar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jdcFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbAsistencia, 0, 137, Short.MAX_VALUE)
                            .addComponent(jcbPersonal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jdcHoraIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jdcHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnModicifar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdcHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(btnModicifar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(jcbPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdcHoraIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int personal = jcbPersonal.getSelectedIndex();
        Asistencia asistencia = new Asistencia(personal);
        eliminar(asistencia);
        limpiar();
        mostrarLista();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tableDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDatosMouseClicked
        int filas = tableDatos.getSelectedRow();
        if (filas == -1) {
            JOptionPane.showMessageDialog(null, "Usuario no Seleccionado");
        } else {
            String personal = (String) tableDatos.getValueAt(filas, 0);
            String asistencia = (String) tableDatos.getValueAt(filas, 1);
            String fecha = (String) tableDatos.getValueAt(filas, 2);
            String horaIn = (String) tableDatos.getValueAt(filas, 3);
            String horaOut = (String) tableDatos.getValueAt(filas, 4);
            /*switch (idCargo) {
                case "1": id_Cargo = "Director Sistemas Administrativos"; break;
                case "2": id_Cargo = "Asistente Social"; break;
                case "3": id_Cargo = "Planificador"; break;
                case "4": id_Cargo = "Abogado"; break;
                case "5": id_Cargo = "Especialista administrativo"; break;
                case "6": id_Cargo = "Ingeniero"; break;
                case "7": id_Cargo = "Estadistico"; break;
                case "8": id_Cargo = "Secretaria"; break;
                case "9": id_Cargo = "Tecnico Administrativo"; break;
                case "10": id_Cargo = "Chofer"; break;
                case "11": id_Cargo = "Programador sistema pad"; break;
                case "12": id_Cargo = "Trabajador de servicio"; break;
            }*/
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            try {
                Date fechaDia = dateFormat.parse(fecha);
                jdcFecha.setDate(fechaDia);
            } catch (Exception e) {
                e.printStackTrace();
            }
            LocalTime localTimeIn = LocalTime.parse(horaIn);
            Time horaInTime = Time.valueOf(localTimeIn);
            
            LocalTime localTimeOunt = LocalTime.parse(horaOut);
            Time horaOutTime = Time.valueOf(localTimeOunt);
            
            jcbPersonal.setSelectedItem(personal);
            jcbAsistencia.setSelectedItem(asistencia);
            
            jdcHoraIngreso.setDate(horaInTime);
            jdcHoraSalida.setDate(horaOutTime);
        }
    }//GEN-LAST:event_tableDatosMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnModicifarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModicifarActionPerformed
        int personal = jcbPersonal.getSelectedIndex();
        String asistir = jcbAsistencia.getSelectedItem().toString();
        String fecha = ((JTextField) jdcFecha.getDateEditor().getUiComponent()).getText();

        java.util.Date fechaSeleccionadaIn = jdcHoraIngreso.getDate();
        Calendar calendarIn = Calendar.getInstance();
        calendarIn.setTime(fechaSeleccionadaIn);
        int horaIn = calendarIn.get(Calendar.HOUR_OF_DAY);
        int minutoIn = calendarIn.get(Calendar.MINUTE);

        java.util.Date fechaSeleccionadaOut = jdcHoraSalida.getDate();
        Calendar calendarOut = Calendar.getInstance();
        calendarOut.setTime(fechaSeleccionadaOut);
        int horaOut = calendarOut.get(Calendar.HOUR_OF_DAY);
        int minutoOut = calendarOut.get(Calendar.MINUTE);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        try {
            Date Fecha = dateFormat.parse(fecha);
            Asistencia asistencia = new Asistencia(personal, asistir, Fecha, horaIn, minutoIn, horaOut, minutoOut);
            modificar(asistencia);
            JOptionPane.showMessageDialog(null, "Personal Actualizado");
        } catch (Exception ex) {
            Logger.getLogger(ifrmAsistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        mostrarLista();
    }//GEN-LAST:event_btnModicifarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        int personal = jcbPersonal.getSelectedIndex();
        String asistir = jcbAsistencia.getSelectedItem().toString();
        String fecha = ((JTextField) jdcFecha.getDateEditor().getUiComponent()).getText();

        java.util.Date fechaSeleccionadaIn = jdcHoraIngreso.getDate();
        Calendar calendarIn = Calendar.getInstance();
        calendarIn.setTime(fechaSeleccionadaIn);
        int horaIn = calendarIn.get(Calendar.HOUR_OF_DAY);
        int minutoIn = calendarIn.get(Calendar.MINUTE);

        java.util.Date fechaSeleccionadaOut = jdcHoraSalida.getDate();
        Calendar calendarOut = Calendar.getInstance();
        calendarOut.setTime(fechaSeleccionadaOut);
        int horaOut = calendarOut.get(Calendar.HOUR_OF_DAY);
        int minutoOut = calendarOut.get(Calendar.MINUTE);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        try {
            Date Fecha = dateFormat.parse(fecha);
            Asistencia asistencia = new Asistencia(personal, asistir, Fecha, horaIn, minutoIn, horaOut, minutoOut);
            registrar(asistencia);
            JOptionPane.showMessageDialog(null, "Personal Actualizado");
        } catch (Exception ex) {
            Logger.getLogger(ifrmAsistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        mostrarLista();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    public void registrar(Asistencia asistencia) {
        String sql = "INSERT INTO asistencia(id_personal,asistencia,fecha,hora_ingreso,hora_salida) VALUES(?,?,?,?,?)";
        Time timeIn = new Time(asistencia.getHora_ingreso(), asistencia.getMin_ingreso(), 0);
        Time timeOut = new Time(asistencia.getHora_salida(), asistencia.getMin_salida(), 0);
        String timeInTexto = timeIn.toString();
        String timeOutTexto = timeOut.toString();
        try {
            cn = Conexion.conectar();
            ps = cn.prepareStatement(sql);
            ps.setInt(1, asistencia.getId_personal());
            ps.setString(2, asistencia.getAsistencia());
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            Date fecha = asistencia.getFecha();
            String fechaTexto = dateFormat.format(fecha);
            ps.setString(3, fechaTexto);
            ps.setString(4, timeInTexto);
            ps.setString(5, timeOutTexto);
            ps.executeUpdate();
            limpiarTabla();
        } catch (Exception ex) {
            Logger.getLogger(ifrmAsistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void mostrarLista() {
        String sql = "SELECT id_personal,asistencia,fecha,hora_ingreso,hora_salida FROM asistencia";
        try {
            cn = Conexion.conectar();
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            Object[] Personal = new Object[5];
            modelo = (DefaultTableModel) tableDatos.getModel();
            while (rs.next()) {

                Personal[0] = rs.getString("id_personal");
                Personal[1] = rs.getString("asistencia");
                Personal[2] = rs.getString("fecha");
                Personal[3] = rs.getString("hora_ingreso");
                Personal[4] = rs.getString("hora_salida");
                modelo.addRow(Personal);
            }
            tableDatos.setModel(modelo);
        } catch (Exception e) {
            Logger.getLogger(ifrmAsistencia.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void modificar(Asistencia asistencia) {
        String sql = "UPDATE asistencia SET id_personal=?, asistencia=?, fecha=?, hora_ingreso=?, hora_salida=? where dni='" + asistencia.getId_personal() + "'";
        Time timeIn = new Time(asistencia.getHora_ingreso(), asistencia.getMin_ingreso(), 0);
        Time timeOut = new Time(asistencia.getHora_salida(), asistencia.getMin_salida(), 0);
        String timeInTexto = timeIn.toString();
        String timeOutTexto = timeOut.toString();
        try {
            cn = Conexion.conectar();
            ps = cn.prepareStatement(sql);
            ps.setInt(1, asistencia.getId_personal());
            ps.setString(2, asistencia.getAsistencia());
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            Date fecha = asistencia.getFecha();
            String fechaTexto = dateFormat.format(fecha);
            ps.setString(3, fechaTexto);
            ps.setString(4, timeInTexto);
            ps.setString(5, timeOutTexto);
            ps.executeUpdate();
            limpiarTabla();
        } catch (Exception e) {
            Logger.getLogger(ifrmAsistencia.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void eliminar(Asistencia asistencia) {
        int filaseleccionada = tableDatos.getSelectedRow();
        if (filaseleccionada == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar Fila");
        } else {
            String sql = "DELETE FROM asistencia WHERE id_personal='" + asistencia.getId_personal() + "'";
            try {
                cn = Conexion.conectar();
                ps = cn.prepareStatement(sql);
                ps.executeUpdate();
                limpiarTabla();
            } catch (Exception e) {
                Logger.getLogger(ifrmAsistencia.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

    public void limpiarTabla() {
        for (int i = 0; i <= tableDatos.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    public void limpiar() {
        jcbPersonal.setSelectedItem("--Seleccionar--");
        jcbAsistencia.setSelectedItem("--Seleccionar--");
        Date fecha = new Date();
        jdcHoraIngreso.setDate(fecha);
        jdcHoraSalida.setDate(fecha);
        jdcFecha.setDate(fecha);
    }

    //=============== METODO PARA CONTAR CUANTOS REGISTROS HAY EN LA TABLA PROVEEDORES ===============//
    public int contarRegistros() {
        String sql = "SELECT COUNT(nombre) FROM personal";
        try {
            cn = Conexion.conectar();
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            int cantidad;
            while (rs.next()) {
                cantidad = rs.getInt("COUNT(nombre)");
                return cantidad;
            }
        } catch (Exception e) {
        }
        return 0;
    }

    //=========== METODO PARA MOSTRAR LOS VALORES DEL CAMPO 'NOMBRE' A LOS ITEM DEL FORMULARIO ===========//
    public void posicionarItem(int numero) {
        String sql = "SELECT nombre FROM personal";
        try {
            cn = Conexion.conectar();
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            String[] proveedor = new String[numero];
            int i = 0;
            while (rs.next() && i < numero) {
                proveedor[i] = rs.getString("nombre");
                jcbPersonal.addItem(proveedor[i]);
                i++;
            }
        } catch (Exception e) {
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModicifar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbAsistencia;
    private javax.swing.JComboBox<String> jcbPersonal;
    private com.toedter.calendar.JDateChooser jdcFecha;
    private com.toedter.calendar.JDateChooser jdcHoraIngreso;
    private com.toedter.calendar.JDateChooser jdcHoraSalida;
    private javax.swing.JTable tableDatos;
    // End of variables declaration//GEN-END:variables
}
