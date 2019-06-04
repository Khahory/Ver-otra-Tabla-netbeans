/*
 * Copyright (c) 2018, Lugue
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package paquete1;

import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lugue
 */
public class TiendaWin extends javax.swing.JFrame {

    public TiendaWin() {
        initComponents();

    }

    //objetos
    Conexion con = new Conexion();
    Connection cn = con.conectar();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        tf_gerente = new javax.swing.JTextField();
        tf_provincia = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_tienda = new javax.swing.JTable();
        tf_cantidad = new javax.swing.JTextField();
        tf_consola = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        boton_guardarP = new javax.swing.JButton();
        boton_guardarT = new javax.swing.JButton();
        boton_verTiendas = new javax.swing.JButton();
        boton_verProductos = new javax.swing.JButton();
        comboBox_provincia = new javax.swing.JComboBox<>();
        boton_ver_producto_tiendas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(255, 51, 51));

        jTabbedPane1.setBackground(new java.awt.Color(255, 102, 51));

        jPanel1.setBackground(new java.awt.Color(0, 102, 51));

        jLabel1.setForeground(new java.awt.Color(102, 255, 255));
        jLabel1.setText("Provincia");

        jLabel2.setForeground(new java.awt.Color(102, 255, 255));
        jLabel2.setText("Gerente");

        tabla_tienda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla_tienda);

        jLabel5.setForeground(new java.awt.Color(102, 255, 255));
        jLabel5.setText("Consola");

        jLabel6.setForeground(new java.awt.Color(102, 255, 255));
        jLabel6.setText("Cantidad");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        boton_guardarP.setText("Guardar producto");
        boton_guardarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_guardarPActionPerformed(evt);
            }
        });

        boton_guardarT.setText("Guardar tienda");
        boton_guardarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_guardarTActionPerformed(evt);
            }
        });

        boton_verTiendas.setText("Ver tiendas");
        boton_verTiendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_verTiendasActionPerformed(evt);
            }
        });

        boton_verProductos.setText("Ver productos");
        boton_verProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_verProductosActionPerformed(evt);
            }
        });

        boton_ver_producto_tiendas.setText("Ver producto, tiendas");
        boton_ver_producto_tiendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_ver_producto_tiendasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(boton_verProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boton_verTiendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boton_ver_producto_tiendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(boton_guardarT)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 227, Short.MAX_VALUE)
                                .addComponent(boton_guardarP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboBox_provincia, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_gerente, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                    .addComponent(tf_provincia))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_consola, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tf_cantidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(20, 20, 20))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(tf_provincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_gerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(tf_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_consola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(boton_guardarP)
                        .addComponent(comboBox_provincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(boton_guardarT))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boton_verTiendas)
                        .addGap(18, 18, 18)
                        .addComponent(boton_verProductos)
                        .addGap(18, 18, 18)
                        .addComponent(boton_ver_producto_tiendas)
                        .addGap(46, 46, 46))))
        );

        jTabbedPane1.addTab("Registro", jPanel1);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_guardarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_guardarTActionPerformed
        insertarDatosTienda();
    }//GEN-LAST:event_boton_guardarTActionPerformed

    private void boton_verTiendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_verTiendasActionPerformed
        mostrarTablaTienda();
    }//GEN-LAST:event_boton_verTiendasActionPerformed

    private void boton_verProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_verProductosActionPerformed
        mostrarTablaProducto();
    }//GEN-LAST:event_boton_verProductosActionPerformed

    private void boton_guardarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_guardarPActionPerformed
        insertarDatosProducto();
    }//GEN-LAST:event_boton_guardarPActionPerformed

    private void boton_ver_producto_tiendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_ver_producto_tiendasActionPerformed
        mostrarTabla_tienda_productos();
        enviarAlBox();
    }//GEN-LAST:event_boton_ver_producto_tiendasActionPerformed

    public void enviarAlBox() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        comboBox_provincia.addItem("");

    }
 


    public void mostrarTabla_tienda_productos() {

        DefaultTableModel modelo = new DefaultTableModel();
        //agregar columnas
        modelo.addColumn("Provincia");
        modelo.addColumn("Gerente");
        modelo.addColumn("Consola");
        modelo.addColumn("Cantidad");
        tabla_tienda.setModel(modelo);
        //Fin

        String sql = "SELECT provincia, gerente,  consola, cantidad FROM tienda, producto WHERE tienda.id = producto.id";
        String datos[] = new String[4];
        Statement st;

        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            //Agregar los reglones
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                modelo.addRow(datos);
            }

            tabla_tienda.setModel(modelo);
            //Fin
        } catch (SQLException ex) {
            Logger.getLogger(TiendaWin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void mostrarTablaTienda() {

        DefaultTableModel modelo = new DefaultTableModel();
        //agregar columnas
        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Gerente");
        tabla_tienda.setModel(modelo);
        //Fin

        String sql = "SELECT * FROM tienda";
        String datos[] = new String[3];
        Statement st;

        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            //Agregar los reglones
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                modelo.addRow(datos);
            }

            tabla_tienda.setModel(modelo);
            //Fin
        } catch (SQLException ex) {
            Logger.getLogger(TiendaWin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //enviar los datos a la base de datos
    public void insertarDatosTienda() {
        try {
            PreparedStatement ppt = cn.prepareStatement("INSERT INTO tienda(provincia,gerente) VALUES (?,?)");
            ppt.setString(1, tf_provincia.getText());
            ppt.setString(2, tf_gerente.getText());
            limpiar();
            ppt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos guardados");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha cometido algun error");

            Logger.getLogger(TiendaWin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertarDatosProducto() {
        try {
            PreparedStatement ppt = cn.prepareStatement("INSERT INTO producto(consola,cantidad) VALUES (?,?)");
            ppt.setString(1, tf_consola.getText());
            ppt.setString(2, tf_cantidad.getText());
            limpiar();
            ppt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos guardados");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha cometido algun error");

            Logger.getLogger(TiendaWin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void mostrarTablaProducto() {
        DefaultTableModel modelo = new DefaultTableModel();
        //agregar columnas
        modelo.addColumn("Id");
        modelo.addColumn("Consola");
        modelo.addColumn("Cantidad");
        tabla_tienda.setModel(modelo);
        //Fin

        String sql = "SELECT * FROM producto";
        String datos[] = new String[3];
        Statement st;

        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            //Agregar los reglones
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                modelo.addRow(datos);
            }

            tabla_tienda.setModel(modelo);
            //Fin
        } catch (SQLException ex) {
            Logger.getLogger(TiendaWin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void limpiar() {
        tf_gerente.setText("");
        tf_provincia.setText("");
        tf_consola.setText("");
        tf_cantidad.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_guardarP;
    private javax.swing.JButton boton_guardarT;
    private javax.swing.JButton boton_verProductos;
    private javax.swing.JButton boton_verTiendas;
    private javax.swing.JButton boton_ver_producto_tiendas;
    private javax.swing.JComboBox<String> comboBox_provincia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel panel1;
    private javax.swing.JTable tabla_tienda;
    private javax.swing.JTextField tf_cantidad;
    private javax.swing.JTextField tf_consola;
    private javax.swing.JTextField tf_gerente;
    private javax.swing.JTextField tf_provincia;
    // End of variables declaration//GEN-END:variables
}
