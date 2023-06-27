package Vista;

import Modelo.Personal;
import controlador.Conexion;
import java.sql.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ifrmTablaPersonal extends javax.swing.JInternalFrame {

    PreparedStatement ps;
    Connection cn;
    ResultSet rs;
    DefaultTableModel modelo;

    public ifrmTablaPersonal() {
        initComponents();
        mostrarLista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableDatos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtProvincia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jdcFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        txtNumCuenta = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jcbGenero = new javax.swing.JComboBox<>();
        btnRegistrar = new javax.swing.JButton();
        btnModicifar = new javax.swing.JButton();
        txtDni = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtDepartamento = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtDistrito = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jdcFechaIngreso = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        jdcFechaSalida = new com.toedter.calendar.JDateChooser();
        btnEliminar = new javax.swing.JButton();
        jcbRegimen = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jcbCargo = new javax.swing.JComboBox<>();
        btnLimpiar = new javax.swing.JButton();

        setClosable(true);

        tableDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "nombre", "apellido", "dni", "direccion", "distrito", "provincia", "departamento", "genero", "estado", "fechaNacim", "email", "telefono", "regPension", "numCuenta", "fechaIn", "fechaOut", "id_cargo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableDatos);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Nombre :");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Apellido :");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("DNI :");

        txtProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProvinciaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Genero :");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Estado :");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("Fecha Nacimiento:");

        jdcFechaNacimiento.setDateFormatString("yyyy/MM/dd");

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setText("Num. Cuenta :");

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setText("Regimen :");

        jcbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "Masculino", "Femenino", "Prefiero no Especificar" }));

        btnRegistrar.setBackground(new java.awt.Color(0, 51, 204));
        btnRegistrar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnModicifar.setBackground(new java.awt.Color(102, 255, 51));
        btnModicifar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnModicifar.setText("Modificar");
        btnModicifar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModicifarActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setText("Direccion :");

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setText("Provincia :");

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setText("Departamento:");

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel21.setText("Distrito :");

        txtDistrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDistritoActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel22.setText("Email :");

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel23.setText("Telefono :");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("Fecha Ingreso :");

        jdcFechaIngreso.setDateFormatString("yyyy/MM/dd");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setText("Fecha Salida :");

        jdcFechaSalida.setDateFormatString("yyyy/MM/dd");

        btnEliminar.setBackground(java.awt.Color.red);
        btnEliminar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jcbRegimen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "ONP", "AFP" }));

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setText("Cargo :");

        jcbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "Director Sistemas Administrativos", "Asistente Social", "Planificador", "Abogado", "Especialista Administrativo", "Ingeniero", "Estadistico", "Secretaria", "Tecnico Administrativo", "Chofer", "Programador Sistema Pad", "Trabajador de servicio" }));

        btnLimpiar.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpiar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel14))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtApellido)
                                    .addComponent(txtDni)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtDireccion))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jdcFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNumCuenta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jdcFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbRegimen, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jdcFechaIngreso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(43, 43, 43)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btnModicifar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel18)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jcbCargo, 0, 1, Short.MAX_VALUE))))
                .addGap(29, 29, 29))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(jdcFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel22)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel23)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(jcbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(txtNumCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(jcbRegimen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jdcFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jdcFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(jcbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnModicifar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpiar)))
                        .addContainerGap(17, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProvinciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProvinciaActionPerformed

    private void txtDistritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDistritoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDistritoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String dni = txtDni.getText();
        Personal personal = new Personal(dni);
        eliminar(personal);
        limpiar();
        mostrarLista();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String dni = txtDni.getText();
        String direccion = txtDireccion.getText();
        String distrito = txtDistrito.getText();
        String provincia = txtProvincia.getText();
        String departamento = txtDepartamento.getText();
        String genero = jcbGenero.getSelectedItem().toString();
        String estado = txtEstado.getText();
        String fechaNacimiento = ((JTextField) jdcFechaNacimiento.getDateEditor().getUiComponent()).getText();
        String email = txtEmail.getText();
        String telefono = txtTelefono.getText();
        String regPension = jcbRegimen.getSelectedItem().toString();
        String numCuenta = txtNumCuenta.getText();
        String fechaIngreso = ((JTextField) jdcFechaIngreso.getDateEditor().getUiComponent()).getText();
        String fechaSalida = ((JTextField) jdcFechaSalida.getDateEditor().getUiComponent()).getText();
        if (fechaSalida == null || fechaSalida.isEmpty()) {
           fechaSalida = "0000/00/00";
        }
        int cargo = jcbCargo.getSelectedIndex();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        if (cargo != 0) {
            try {
                Date fechaNac = dateFormat.parse(fechaNacimiento);
                Date fechaIn = dateFormat.parse(fechaIngreso);
                Date fechaSal = dateFormat.parse(fechaSalida);
                Personal personal = new Personal(nombre, apellido, dni, direccion, distrito, provincia, departamento, genero, estado, fechaNac, email, telefono, regPension, numCuenta, fechaIn, fechaSal, cargo);
                registrar(personal);
                JOptionPane.showMessageDialog(null, "Personal Registrado");
            } catch (Exception ex) {
                Logger.getLogger(ifrmTablaPersonal.class.getName()).log(Level.SEVERE, null, ex);
            }
            mostrarLista();
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un cargo");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnModicifarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModicifarActionPerformed
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String dni = txtDni.getText();
        String direccion = txtDireccion.getText();
        String distrito = txtDistrito.getText();
        String provincia = txtProvincia.getText();
        String departamento = txtDepartamento.getText();
        String genero = jcbGenero.getSelectedItem().toString();
        String estado = txtEstado.getText();
        String fechaNacimiento = ((JTextField) jdcFechaNacimiento.getDateEditor().getUiComponent()).getText();
        String email = txtEmail.getText();
        String telefono = txtTelefono.getText();
        String regPension = jcbRegimen.getSelectedItem().toString();
        String numCuenta = txtNumCuenta.getText();
        String fechaIngreso = ((JTextField) jdcFechaIngreso.getDateEditor().getUiComponent()).getText();
        String fechaSalida = ((JTextField) jdcFechaSalida.getDateEditor().getUiComponent()).getText();
        System.out.println(fechaSalida);
        if (fechaSalida == null || fechaSalida.isEmpty()) {
           fechaSalida = "0000/00/00";
        }
        int cargo = jcbCargo.getSelectedIndex();
        System.out.println(cargo);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        try {
            Date fechaNac = dateFormat.parse(fechaNacimiento);
            Date fechaIn = dateFormat.parse(fechaIngreso);
            Date fechaSal = dateFormat.parse(fechaSalida);
            Personal personal = new Personal(nombre, apellido, dni, direccion, distrito, provincia, departamento, genero, estado, fechaNac, email, telefono, regPension, numCuenta, fechaIn, fechaSal, cargo);
            modificar(personal);
            JOptionPane.showMessageDialog(null, "Personal Actualizado");
        } catch (Exception ex) {
            Logger.getLogger(ifrmTablaPersonal.class.getName()).log(Level.SEVERE, null, ex);
        }
        mostrarLista();
    }//GEN-LAST:event_btnModicifarActionPerformed

    private void tableDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDatosMouseClicked
        int filas = tableDatos.getSelectedRow();
        if (filas == -1) {
            JOptionPane.showMessageDialog(null, "Usuario no Seleccionado");
        } else {
            String nombre = (String) tableDatos.getValueAt(filas, 0);
            String apellido = (String) tableDatos.getValueAt(filas, 1);
            String dni = (String) tableDatos.getValueAt(filas, 2);
            String direccion = (String) tableDatos.getValueAt(filas, 3);
            String distrito = (String) tableDatos.getValueAt(filas, 4);
            String provincia = (String) tableDatos.getValueAt(filas, 5);
            String departamento = (String) tableDatos.getValueAt(filas, 6);
            String genero = (String) tableDatos.getValueAt(filas, 7);
            String estado = (String) tableDatos.getValueAt(filas, 8);
            String fechaNac = (String) tableDatos.getValueAt(filas, 9);
            String email = (String) tableDatos.getValueAt(filas, 10);
            String telefono = (String) tableDatos.getValueAt(filas, 11);
            String regPension = (String) tableDatos.getValueAt(filas, 12);
            String numCuenta = (String) tableDatos.getValueAt(filas, 13);
            String fechaIn = (String) tableDatos.getValueAt(filas, 14);
            String fechaSal = (String) tableDatos.getValueAt(filas, 15);
            String idCargo = (String) tableDatos.getValueAt(filas, 16);
            String id_Cargo = "";
            switch (idCargo) {
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
            }
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            try {
                Date fechaNaci = dateFormat.parse(fechaNac);
                Date fechaIng = dateFormat.parse(fechaIn);
                Date fechaSali = dateFormat.parse(fechaSal);
                jdcFechaNacimiento.setDate(fechaNaci);
                jdcFechaIngreso.setDate(fechaIng);
                jdcFechaSalida.setDate(fechaSali);
            } catch (Exception e) {
                e.printStackTrace();
            }
            txtNombre.setText(nombre);
            txtApellido.setText(apellido);
            txtDni.setText(dni);
            txtDireccion.setText(direccion);
            txtDistrito.setText(distrito);
            txtProvincia.setText(provincia);
            txtDepartamento.setText(departamento);
            jcbGenero.setSelectedItem(genero);
            txtEstado.setText(estado);
            txtEmail.setText(email);
            txtTelefono.setText(telefono);
            jcbRegimen.setSelectedItem(regPension);
            txtNumCuenta.setText(numCuenta);
            jcbCargo.setSelectedItem(id_Cargo);
        }
    }//GEN-LAST:event_tableDatosMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    public void registrar(Personal personal) {
        String sql = "INSERT INTO personal(id_cargo,nombre,apellido,dni,direccion,distrito,provincia,departamento,genero,estado,fecha_Nacimiento,email,telefono,reg_Pension,num_cuenta,fecha_Ingreso,fecha_Salida) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            cn = Conexion.conectar();
            ps = cn.prepareStatement(sql);
            ps.setInt(1, personal.getId_cargo());
            ps.setString(2, personal.getNombre());
            ps.setString(3, personal.getApellido());
            ps.setString(4, personal.getDni());
            ps.setString(5, personal.getDireccion());
            ps.setString(6, personal.getDistrito());
            ps.setString(7, personal.getProvincia());
            ps.setString(8, personal.getDepartamento());
            ps.setString(9, personal.getGenero());
            ps.setString(10, personal.getEstado());
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            Date fechaNacimiento = personal.getFecha_nacimiento();
            String fechaNacTexto = dateFormat.format(fechaNacimiento);
            ps.setString(11, fechaNacTexto);
            ps.setString(12, personal.getEmail());
            ps.setString(13, personal.getTelefono());
            ps.setString(14, personal.getRegPension());
            ps.setString(15, personal.getNum_Cuenta());
            Date fechaIngreso = personal.getFecha_ingreso();
            String fechaInTexto = dateFormat.format(fechaIngreso);
            ps.setString(16, fechaInTexto);
            Date fechaSalida = personal.getFecha_salida();
            String fechaSalTexto = dateFormat.format(fechaSalida);
            ps.setString(17, fechaSalTexto);
            ps.executeUpdate();
            limpiarTabla();
        } catch (Exception ex) {
            Logger.getLogger(ifrmTablaPersonal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void mostrarLista() {
        String sql = "SELECT nombre,apellido,dni,direccion,distrito,provincia,departamento,genero,estado,fecha_Nacimiento,email,telefono,reg_Pension,num_cuenta,fecha_Ingreso,fecha_Salida,id_Cargo FROM personal";
        try {
            cn = Conexion.conectar();
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            Object[] Personal = new Object[17];
            modelo = (DefaultTableModel) tableDatos.getModel();
            while (rs.next()) {

                Personal[0] = rs.getString("nombre");
                Personal[1] = rs.getString("apellido");
                Personal[2] = rs.getString("dni");
                Personal[3] = rs.getString("direccion");
                Personal[4] = rs.getString("distrito");
                Personal[5] = rs.getString("provincia");
                Personal[6] = rs.getString("departamento");
                Personal[7] = rs.getString("genero");
                Personal[8] = rs.getString("estado");
                Personal[9] = rs.getString("fecha_Nacimiento");
                Personal[10] = rs.getString("email");
                Personal[11] = rs.getString("telefono");
                Personal[12] = rs.getString("reg_Pension");
                Personal[13] = rs.getString("num_cuenta");
                Personal[14] = rs.getString("fecha_Ingreso");
                Personal[15] = rs.getString("fecha_Salida");
                Personal[16] = rs.getString("id_cargo");
                modelo.addRow(Personal);
            }
            tableDatos.setModel(modelo);
        } catch (Exception e) {
            Logger.getLogger(ifrmTablaPersonal.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void modificar(Personal personal) {
        String sql = "UPDATE personal SET id_cargo=?,nombre=?, apellido=?, dni=?, direccion=?, distrito=?, provincia=?, departamento=?, genero=?, estado=?, fecha_Nacimiento=?, email=?, telefono=?, reg_Pension=?, num_cuenta=?, fecha_Ingreso=?, fecha_Salida=? where dni='" + personal.getDni() + "'";
        try {
            cn = Conexion.conectar();
            ps = cn.prepareStatement(sql);
            ps.setInt(1, personal.getId_cargo());
            ps.setString(2, personal.getNombre());
            ps.setString(3, personal.getApellido());
            ps.setString(4, personal.getDni());
            ps.setString(5, personal.getDireccion());
            ps.setString(6, personal.getDistrito());
            ps.setString(7, personal.getProvincia());
            ps.setString(8, personal.getDepartamento());
            ps.setString(9, personal.getGenero());
            ps.setString(10, personal.getEstado());
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyy/MM/dd");
            Date fechaNacimiento = personal.getFecha_nacimiento();
            String fechaNacTexto = dateFormat.format(fechaNacimiento);
            ps.setString(11, fechaNacTexto);
            ps.setString(12, personal.getEmail());
            ps.setString(13, personal.getTelefono());
            ps.setString(14, personal.getRegPension());
            ps.setString(15, personal.getNum_Cuenta());
            Date fechaIngreso = personal.getFecha_ingreso();
            String fechaInTexto = dateFormat.format(fechaIngreso);
            ps.setString(16, fechaInTexto);
            Date fechaSalida = personal.getFecha_salida();
            String fechaSalTexto = dateFormat.format(fechaSalida);
            ps.setString(17, fechaSalTexto);
            ps.executeUpdate();
            limpiarTabla();
        } catch (Exception e) {
            Logger.getLogger(ifrmTablaPersonal.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void eliminar(Personal personal) {
        int filaseleccionada = tableDatos.getSelectedRow();
        if (filaseleccionada == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar Fila");
        } else {
            String sql = "DELETE FROM personal WHERE dni='" + personal.getDni() + "'";
            try {
                cn = Conexion.conectar();
                ps = cn.prepareStatement(sql);
                ps.executeUpdate();
                limpiarTabla();
            } catch (Exception e) {
                Logger.getLogger(ifrmTablaPersonal.class.getName()).log(Level.SEVERE, null, e);
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
        txtNombre.setText("");
        txtApellido.setText("");
        txtDni.setText("");
        txtDireccion.setText("");
        txtDistrito.setText("");
        txtProvincia.setText("");
        txtEstado.setText("");
        txtEmail.setText("");
        txtTelefono.setText("");
        txtNumCuenta.setText("");
        jcbGenero.setSelectedItem("--Seleccionar--");
        jcbRegimen.setSelectedItem("--Seleccionar--");
        jcbCargo.setSelectedItem("--Seleccionar--");
        Date fecha = new Date();
        jdcFechaNacimiento.setDate(fecha);
        jdcFechaIngreso.setDate(fecha);
        jdcFechaSalida.setDate(fecha);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModicifar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbCargo;
    private javax.swing.JComboBox<String> jcbGenero;
    private javax.swing.JComboBox<String> jcbRegimen;
    private com.toedter.calendar.JDateChooser jdcFechaIngreso;
    private com.toedter.calendar.JDateChooser jdcFechaNacimiento;
    private com.toedter.calendar.JDateChooser jdcFechaSalida;
    private javax.swing.JTable tableDatos;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDepartamento;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDistrito;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumCuenta;
    private javax.swing.JTextField txtProvincia;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
