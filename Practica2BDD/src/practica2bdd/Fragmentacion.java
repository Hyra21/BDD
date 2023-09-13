/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2bdd;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yaed1
 */
public class Fragmentacion extends javax.swing.JFrame {

    private static final String URL = "HYRA\\SQLEXPRESS;databaseName=Practica2";
    private static final String USUARIO = "HYRA\\yaed1";
    private static final String CONTRASEÑA = "2115";

    /**
     * Creates new form Fragmentacion
     */
    public Fragmentacion() {
        initComponents();
        cargarTabla();
        this.setLocationRelativeTo(null);

    }

    private void cargarTabla() {

        DefaultTableModel modelo = (DefaultTableModel) tableBD.getModel();

        Connection conexion = null;
        Statement statement = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1:3306/practica2";
            String usuario = "root";
            String contraseña = "admin";
            conexion = DriverManager.getConnection(url, usuario, contraseña);

            statement = conexion.createStatement();
            String consulta = "SELECT * FROM Trabajadores";
            ResultSet resultSet = statement.executeQuery(consulta);

            while (modelo.getRowCount() > 0) {
                modelo.removeRow(0);
            }

            while (resultSet.next()) {
                int noControl = resultSet.getInt("no_Control");
                String nombre = resultSet.getString("nombre");
                String domicilio = resultSet.getString("domicilio");
                String ciudad = resultSet.getString("ciudad");
                int edad = resultSet.getInt("edad");
                String oficio = resultSet.getString("oficio");

                Object[] fila = {noControl, nombre, domicilio, ciudad, edad, oficio};
                modelo.addRow(fila);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void activar() {
        mayor.setEnabled(true);
        mayorIgual.setEnabled(true);
        menor.setEnabled(true);
        menorIgual.setEnabled(true);
        igual.setSelected(false);
        textField.setText("");
    }

    public void desactivar() {
        mayor.setEnabled(false);
        mayorIgual.setEnabled(false);
        menor.setEnabled(false);
        menorIgual.setEnabled(false);
        igual.setSelected(false);
        textField.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        checkGroup = new javax.swing.ButtonGroup();
        minterminos = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBD = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        noControl = new javax.swing.JCheckBox();
        nombre = new javax.swing.JCheckBox();
        domicilio = new javax.swing.JCheckBox();
        ciudad = new javax.swing.JCheckBox();
        edad = new javax.swing.JCheckBox();
        oficio = new javax.swing.JCheckBox();
        simples = new javax.swing.JButton();
        menor = new javax.swing.JRadioButton();
        mayor = new javax.swing.JRadioButton();
        menorIgual = new javax.swing.JRadioButton();
        mayorIgual = new javax.swing.JRadioButton();
        igual = new javax.swing.JRadioButton();
        textField = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tableBD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "no_Control", " nombre", "domicilio", "ciudad", "edad", "oficio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableBD);

        jLabel1.setText("CREACIÓN DE PREDICADO SIMPLE");

        checkGroup.add(noControl);
        noControl.setText("no_Control");
        noControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noControlActionPerformed(evt);
            }
        });

        checkGroup.add(nombre);
        nombre.setText("nombre");
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        checkGroup.add(domicilio);
        domicilio.setText("domicilio");
        domicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                domicilioActionPerformed(evt);
            }
        });

        checkGroup.add(ciudad);
        ciudad.setText("ciudad");
        ciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciudadActionPerformed(evt);
            }
        });

        checkGroup.add(edad);
        edad.setText("edad");
        edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edadActionPerformed(evt);
            }
        });

        checkGroup.add(oficio);
        oficio.setText("oficio");
        oficio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oficioActionPerformed(evt);
            }
        });

        simples.setText("Pred. Simples");
        simples.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simplesActionPerformed(evt);
            }
        });

        minterminos.add(menor);
        menor.setText("<");
        menor.setEnabled(false);

        minterminos.add(mayor);
        mayor.setText(">");
        mayor.setEnabled(false);

        minterminos.add(menorIgual);
        menorIgual.setText("<=");
        menorIgual.setEnabled(false);

        minterminos.add(mayorIgual);
        mayorIgual.setText(">=");
        mayorIgual.setEnabled(false);

        minterminos.add(igual);
        igual.setText("=");

        jButton4.setText("Resetear Tabla");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(domicilio)
                        .addGap(18, 18, 18)
                        .addComponent(menor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mayor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(menorIgual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mayorIgual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(igual)
                        .addGap(18, 18, 18)
                        .addComponent(textField, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edad)
                            .addComponent(ciudad)
                            .addComponent(nombre)
                            .addComponent(oficio))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(simples))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(noControl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(jButton1))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(361, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(noControl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(23, 23, 23)))
                .addComponent(nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(domicilio)
                    .addComponent(menor)
                    .addComponent(mayor)
                    .addComponent(menorIgual)
                    .addComponent(mayorIgual)
                    .addComponent(igual)
                    .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ciudad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(edad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(oficio)
                .addGap(80, 80, 80)
                .addComponent(simples)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jButton1)
                    .addGap(35, 35, 35)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel1)
                    .addContainerGap(278, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void noControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noControlActionPerformed
        activar();
    }//GEN-LAST:event_noControlActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        desactivar();
    }//GEN-LAST:event_nombreActionPerformed

    private void edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edadActionPerformed
        activar();
    }//GEN-LAST:event_edadActionPerformed

    private void simplesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simplesActionPerformed

        String parametro = "";
        String mintermino = "";

        String cadena = "";

        Enumeration<AbstractButton> par = checkGroup.getElements();
        while (par.hasMoreElements()) {
            JCheckBox checkBox = (JCheckBox) par.nextElement();
            if (checkBox.isSelected()) {
                parametro = checkBox.getText();
                break;
            }
        }

        Enumeration<AbstractButton> min = minterminos.getElements();
        while (min.hasMoreElements()) {
            JRadioButton radioButton = (JRadioButton) min.nextElement();
            if (radioButton.isSelected()) {
                mintermino = radioButton.getText();
                break;
            }
        }

        String valor = textField.getText();

        if (valor.equals("")) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un valor");
        } else {
            DefaultTableModel modelo = (DefaultTableModel) tableBD.getModel();

            Connection conexion = null;
            Statement statement = null;

            try {
                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://127.0.0.1:3306/practica2";
                String usuario = "root";
                String contraseña = "admin";
                conexion = DriverManager.getConnection(url, usuario, contraseña);

                statement = conexion.createStatement();

                if (parametro.equals("no_Control") || parametro.equals("edad")) {
                    cadena = parametro + mintermino + " " + valor;
                } else {
                    cadena = parametro + mintermino + " " + "'" + valor + "'";
                }
                JOptionPane.showMessageDialog(this, cadena);

                String consulta = "SELECT * FROM Trabajadores" + " WHERE " + cadena;

                ResultSet resultSet = statement.executeQuery(consulta);

                while (modelo.getRowCount() > 0) {
                    modelo.removeRow(0);
                }

                while (resultSet.next()) {
                    int noControl = resultSet.getInt("no_Control");
                    String nombre = resultSet.getString("nombre");
                    String domicilio = resultSet.getString("domicilio");
                    String ciudad = resultSet.getString("ciudad");
                    int edad = resultSet.getInt("edad");
                    String oficio = resultSet.getString("oficio");

                    Object[] fila = {noControl, nombre, domicilio, ciudad, edad, oficio};
                    modelo.addRow(fila);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (statement != null) {
                        statement.close();
                    }
                    if (conexion != null) {
                        conexion.close();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

    }//GEN-LAST:event_simplesActionPerformed

    private void domicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_domicilioActionPerformed
        desactivar();
    }//GEN-LAST:event_domicilioActionPerformed

    private void ciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciudadActionPerformed
        desactivar();
    }//GEN-LAST:event_ciudadActionPerformed

    private void oficioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oficioActionPerformed
        desactivar();
    }//GEN-LAST:event_oficioActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        cargarTabla();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Fragmentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fragmentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fragmentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fragmentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fragmentacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup checkGroup;
    private javax.swing.JCheckBox ciudad;
    private javax.swing.JCheckBox domicilio;
    private javax.swing.JCheckBox edad;
    private javax.swing.JRadioButton igual;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton mayor;
    private javax.swing.JRadioButton mayorIgual;
    private javax.swing.JRadioButton menor;
    private javax.swing.JRadioButton menorIgual;
    private javax.swing.ButtonGroup minterminos;
    private javax.swing.JCheckBox noControl;
    private javax.swing.JCheckBox nombre;
    private javax.swing.JCheckBox oficio;
    private javax.swing.JButton simples;
    private javax.swing.JTable tableBD;
    private javax.swing.JTextField textField;
    // End of variables declaration//GEN-END:variables
}
