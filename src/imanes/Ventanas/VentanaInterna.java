/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imanes.Ventanas;

import Clases.Database;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Edwin Grayson
 */
public class VentanaInterna extends javax.swing.JInternalFrame {
 Database conectar = new Database();
    Connection con;
    CallableStatement cst;
    ResultSet r;
    /**
     * Creates new form VentanaInterna
     */
    public VentanaInterna() {
        initComponents();
         con = conectar.getConexion();
    }

    
    
     public void insertarRegistro() {
         


          
            try {
                //  Connection con = getConnection();
                PreparedStatement ps = con.prepareStatement("INSERT INTO usuarios(nombre,direccion,telefono,sintomas,cirugia,cirugiaesp,marcapaso,bateria,sangre,tiempo,embarazada,fecha)"
                        + "values(?,?,?,?,?,?,?,?,?,?,?,?) ");
              
                
                String sel = selector.toString();
                 String sel2 = selector2.toString();
                  String sel3 = selector3.toString();
                   String sel4 = selector4.toString();
                
                ps.setString(1, nombre.getText());
                ps.setString(2, direccion.getText());
                ps.setString(3, telefono.getText());
                ps.setString(4, sintomas.getText());
                ps.setString(5, sel);
                ps.setString(6, cirugiaesp.getText());
                ps.setString(7, sel2);
                ps.setString(8, sel3);
                ps.setString(9, sel4);
                ps.setString(10, tiempo.getText());
                ps.setString(11, embarazada.getText());
                
                SimpleDateFormat date = new SimpleDateFormat("yyy-MM-dd");
                String fecha = date.format(fecha1.getDate());
                ps.setString(12, fecha);
                ps.executeUpdate();
                // Show_Products_In_JTable();

                JOptionPane.showMessageDialog(null, "Data Inserted");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
       
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        direccion = new javax.swing.JTextField();
        cirugiaesp = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        embarazada = new javax.swing.JTextField();
        tiempo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        selector = new javax.swing.JComboBox<>();
        selector3 = new javax.swing.JComboBox<>();
        selector4 = new javax.swing.JComboBox<>();
        selector2 = new javax.swing.JComboBox<>();
        fecha1 = new com.toedter.calendar.JDateChooser();
        jLabel19 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sintomas = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setClosable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 430, -1));
        getContentPane().add(cirugiaesp, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 490, 170, -1));
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 430, -1));
        getContentPane().add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 250, -1));
        getContentPane().add(embarazada, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 640, 300, -1));
        getContentPane().add(tiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 590, 70, -1));

        jButton1.setText("Guardar Datos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 640, -1, -1));

        selector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO" }));
        selector.setBorder(null);
        getContentPane().add(selector, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, 60, -1));

        selector3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI ", "NO" }));
        selector3.setBorder(null);
        getContentPane().add(selector3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 540, 60, -1));

        selector4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI ", "NO" }));
        selector4.setBorder(null);
        getContentPane().add(selector4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 590, 60, -1));

        selector2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI ", "NO" }));
        selector2.setBorder(null);
        getContentPane().add(selector2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 540, 60, -1));

        fecha1.setDateFormatString("yyyy/MM/dd");
        getContentPane().add(fecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 160, -1));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel19.setText("Telefono");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel1.setText("Fecha");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel2.setText("Nombre de Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 77, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel3.setText("Direccion");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 106, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel5.setText("Sintomas: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel6.setText("Escriba el motivo por el cual Usted, desea recibir terapia como tratamientoalternativo  ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 213, 651, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel7.setText("por la Terapeuta Eugenia Gabriela Dominguez Diaz, con el metodo \"Par Biomagnetico ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 242, -1, -1));

        sintomas.setColumns(20);
        sintomas.setRows(5);
        jScrollPane1.setViewportView(sintomas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 311, 651, 112));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel9.setText("Recibe o recibio tratamiento de quimio y/o radio terapia ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 430, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel10.setText("Mencione cuando fue la ultima vez ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 459, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel11.setText("¿A Ud. le han practicado alguna cirugia? ");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 488, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel12.setText("Mencione Cual ");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, -1, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel13.setText("¿Ud. usa marcapaso? ");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 541, -1, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel14.setText("¿Bateria?");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 541, -1, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel15.setText("Le han transfundido sangre (donado) ");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 591, -1, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel16.setText("De ser mujer; ¿esta Ud. embarazada? ");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 639, -1, -1));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel17.setText("¿Cuanto tiempo hace?");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 590, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoimanes.jpg"))); // NOI18N
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 710));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel20.setText("Ocupacion");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         insertarRegistro();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cirugiaesp;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField embarazada;
    private com.toedter.calendar.JDateChooser fecha1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombre;
    private javax.swing.JComboBox<String> selector;
    private javax.swing.JComboBox<String> selector2;
    private javax.swing.JComboBox<String> selector3;
    private javax.swing.JComboBox<String> selector4;
    private javax.swing.JTextArea sintomas;
    private javax.swing.JTextField telefono;
    private javax.swing.JTextField tiempo;
    // End of variables declaration//GEN-END:variables
}
