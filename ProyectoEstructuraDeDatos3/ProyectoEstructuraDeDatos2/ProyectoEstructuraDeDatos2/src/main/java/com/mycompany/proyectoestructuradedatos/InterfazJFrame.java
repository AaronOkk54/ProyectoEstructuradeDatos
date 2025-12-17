package com.mycompany.proyectoestructuradedatos;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class InterfazJFrame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(InterfazJFrame.class.getName());

    public InterfazJFrame() {
        initComponents();
        setLocationRelativeTo(null);
        cargarTabla();
        
    }

    private void cargarTabla() {
    String[] columnas = {
        "Fecha", "Hora", "ID Deportista",
        "Cliente", "Mes", "Rutina", "Estado"
    };

    DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

    for (int i = 0; i < Central.facturacion.getCantidad(); i++) {
        Factura f = Central.facturacion.getFacturas()[i];
        if (f != null) {
            modelo.addRow(new Object[]{
                f.getFecha(),
                f.getHora(),
                f.getIdDeportista(),
                f.getNombreCliente(),
                f.getMes(),
                f.getDescripcionRutinas(),
                f.isAnulada() ? "ANULADA" : "ACTIVA"
            });
        }
    }
    tblFacturas.setModel(modelo);
}

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFacturas = new javax.swing.JTable();
        btnMostrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        txtMes = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCrearFactura = new javax.swing.JButton();
        btnGenerarCliente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDatosGenerados = new javax.swing.JTable();
        btnMostrarFacturas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblFacturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblFacturas);

        btnMostrar.setText("Filtrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Anular");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnCrearFactura.setText("Crear Factura");
        btnCrearFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearFacturaActionPerformed(evt);
            }
        });

        btnGenerarCliente.setText("Generar Cliente");
        btnGenerarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarClienteActionPerformed(evt);
            }
        });

        btnMostrarFacturas.setText("Mostrar Todas las Facturas");
        btnMostrarFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarFacturasActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        jLabel2.setText("Mes");

        tblDatosGenerados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Deporte", "Características", "Rutina", "Duración", "Deporte Rutina",
                "ID Deportista", "Nombre", "Apellidos", "Ciudad", "Dirección", "Teléfono", "Correo", "Mes"
            }
        ));
        jScrollPane2.setViewportView(tblDatosGenerados);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMes, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addComponent(txtID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMostrar)
                    .addComponent(btnBuscar)
                    .addComponent(btnCrearFactura)
                    .addComponent(btnGenerarCliente)
                    .addComponent(btnMostrarFacturas))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnMostrar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnBuscar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCrearFactura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGenerarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMostrarFacturas)
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
    String id = txtID.getText().trim();
    String mes = txtMes.getText().trim();

    DefaultTableModel modelo = (DefaultTableModel) tblFacturas.getModel();
    modelo.setRowCount(0);



    for (int i = 0; i < Central.facturacion.getCantidad(); i++) {
        Factura f = Central.facturacion.getFacturas()[i];

        if (f.getIdDeportista().equals(id) &&
            f.getMes().equalsIgnoreCase(mes)) {

            modelo.addRow(new Object[]{
                f.getFecha(),
                f.getHora(),
                f.getIdDeportista(),
                f.getNombreCliente(),
                f.getMes(),
                f.getDescripcionRutinas(),
                f.isAnulada() ? "ANULADA" : "ACTIVA"
            });
        }
    }
}//GEN-LAST:event_btnMostrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
    int fila = tblFacturas.getSelectedRow();

    if (fila == -1) {
        JOptionPane.showMessageDialog(this, "Seleccione una factura");
        return;
    }

    String id = tblFacturas.getValueAt(fila, 2).toString();
    String mes = tblFacturas.getValueAt(fila, 4).toString();

    
    boolean resultado = Central.facturacion.anularFacturaPorIdYMes(id, mes);

    if (resultado) {
        JOptionPane.showMessageDialog(this, "Factura anulada correctamente");
        cargarTabla();
    } else {
        JOptionPane.showMessageDialog(this, "No se pudo anular la factura");
    }
}//GEN-LAST:event_btnBuscarActionPerformed



//la creaciona de facturas
    private void btnCrearFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearFacturaActionPerformed
    String id = JOptionPane.showInputDialog(this, "Ingrese el ID del deportista:");
    if (id == null || id.trim().isEmpty()) return;
    id = id.trim();

    String mes = JOptionPane.showInputDialog(this, "Ingrese el mes:");
    if (mes == null || mes.trim().isEmpty()) return;
    mes = mes.trim();

    Factura factura = FacturacionGimnasio.crearFactura(id, mes);


    
    if (factura == null) {
        JOptionPane.showMessageDialog(this, "No se pudo crear la factura. Verifique los datos.");
    } else {
        JOptionPane.showMessageDialog(this, "Factura creada exitosamente.");
        cargarTabla();
    }
}//GEN-LAST:event_btnCrearFacturaActionPerformed

    private void btnGenerarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarClienteActionPerformed
    
    
    
    
    
    
        //deporte
    String nombreDeporte = JOptionPane.showInputDialog(null, "Nombre del deporte:");
    if (nombreDeporte == null || nombreDeporte.trim().isEmpty()) return;
    nombreDeporte = nombreDeporte.trim();

    String caracteristicas = JOptionPane.showInputDialog(null, "Características del deporte:");
    if (caracteristicas == null || caracteristicas.trim().isEmpty()) return;
    caracteristicas = caracteristicas.trim();

    if (!Central.deportes.agregarDeporte(nombreDeporte, caracteristicas)) {
        JOptionPane.showMessageDialog(null, "No se pudo crear el deporte (puede estar duplicado).");
        return;
    }

    //rutina
    String descripcionRutina = JOptionPane.showInputDialog(null, "Descripción de la rutina:");
    if (descripcionRutina == null || descripcionRutina.trim().isEmpty()) return;
    descripcionRutina = descripcionRutina.trim();

    String duracionStr = JOptionPane.showInputDialog(null, "Duración de la rutina (minutos):");
    if (duracionStr == null || duracionStr.trim().isEmpty()) return;
    int duracion;
    try {
        duracion = Integer.parseInt(duracionStr.trim());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Duración inválida.");
        return;
    }

    if (!Central.rutinas.agregarRutina(descripcionRutina, nombreDeporte, duracion, Central.deportes)) {
        JOptionPane.showMessageDialog(null, "No se pudo crear la rutina (verifica deporte y duplicados).");
        return;
    }

    //deportista
    String id = JOptionPane.showInputDialog(null, "ID del deportista:");
    if (id == null || id.trim().isEmpty()) return;
    id = id.trim();

    String nombre = JOptionPane.showInputDialog(null, "Nombre del deportista:");
    if (nombre == null || nombre.trim().isEmpty()) return;
    nombre = nombre.trim();

    String apellidos = JOptionPane.showInputDialog(
        null, "Apellidos del deportista:");
    if (apellidos == null || apellidos.trim().isEmpty()) return;
    apellidos = apellidos.trim();

    String ciudad = JOptionPane.showInputDialog(null, "Ciudad:");
    if (ciudad == null || ciudad.trim().isEmpty()) return;
    ciudad = ciudad.trim();

    String direccion = JOptionPane.showInputDialog(null, "Dirección:");
    if (direccion == null || direccion.trim().isEmpty()) return;
    direccion = direccion.trim();

    String telefono = JOptionPane.showInputDialog(null, "Teléfono:");
    if (telefono == null || telefono.trim().isEmpty()) return;
    telefono = telefono.trim();

    String correo = JOptionPane.showInputDialog(null, "Correo:");
    if (correo == null || correo.trim().isEmpty()) return;
    correo = correo.trim();

    Deportista deportista = new Deportista(id, nombre, apellidos, ciudad, direccion, telefono, correo, true);
    if (!Central.deportistas.agregarDeportista(deportista)) {
        JOptionPane.showMessageDialog(null, "No se pudo crear el deportista (ID duplicado?).");
        return;
    }

    String mes = JOptionPane.showInputDialog(null, "Mes para asignar la rutina:");
    if (mes == null || mes.trim().isEmpty()) return;
    mes = mes.trim();

    AsignacionRutina asignacion = new AsignacionRutina(id, mes, descripcionRutina);
    if (!Central.asignaciones.agregarAsignacion(asignacion)) {
        JOptionPane.showMessageDialog(null, "No se pudo asignar la rutina (duplicado o error).");
        return;
    }




    JOptionPane.showMessageDialog(null, "Cliente, rutina y asignación generados exitosamente.");





    //la tabla de los clientes
    DefaultTableModel modelo = (DefaultTableModel) tblDatosGenerados.getModel();
    modelo.addRow(new Object[]{
        nombreDeporte,
        caracteristicas,
        descripcionRutina,
        duracion,
        nombreDeporte,
        id,
        nombre,
        apellidos,
        ciudad,
        direccion,
        telefono,
        correo,
        mes
    });
}//GEN-LAST:event_btnGenerarClienteActionPerformed

private void btnMostrarFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarFacturasActionPerformed
    cargarTabla();
}//GEN-LAST:event_btnMostrarFacturasActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new InterfazJFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCrearFactura;
    private javax.swing.JButton btnGenerarCliente;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnMostrarFacturas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDatosGenerados;
    private javax.swing.JTable tblFacturas;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMes;
    // End of variables declaration//GEN-END:variables
}
