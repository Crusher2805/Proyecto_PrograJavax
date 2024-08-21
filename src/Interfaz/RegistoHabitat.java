/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author gaort
 */
public class RegistoHabitat extends javax.swing.JFrame {

    private int contador = 0;
    private String[] nombres = new String[100];
    private String[] tipoAmbiente = new String[100];
    private int[] capacidadd = new int[100];

    /**
     * Creates new form RegistoHabitat
     */
    public RegistoHabitat() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Regresar3 = new javax.swing.JButton();
        capacidadtxt = new javax.swing.JTextField();
        ambientetxt = new javax.swing.JTextField();
        nombretxt = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 102, 0));

        jLabel1.setBackground(new java.awt.Color(51, 102, 0));
        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registro De Habitats");

        jLabel2.setBackground(new java.awt.Color(0, 102, 51));
        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setBackground(new java.awt.Color(0, 102, 51));
        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel3.setText("Tipo De Ambiente");

        jLabel4.setBackground(new java.awt.Color(0, 102, 51));
        jLabel4.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel4.setText("Capacidad");

        jButton1.setBackground(new java.awt.Color(0, 204, 102));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Registrar Habitat");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 204, 102));
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Consultar Información");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Regresar3.setBackground(new java.awt.Color(204, 0, 0));
        Regresar3.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        Regresar3.setText("Regresar");
        Regresar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Regresar3ActionPerformed(evt);
            }
        });

        nombretxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombretxtActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 204, 102));
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Buscar información");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 204, 102));
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Eliminar información");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 204, 102));
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setText("Modificar información");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombretxt)
                            .addComponent(ambientetxt)
                            .addComponent(capacidadtxt)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(183, 183, 183))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Regresar3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addComponent(nombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ambientetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(15, 15, 15)
                .addComponent(capacidadtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(121, 121, 121)
                .addComponent(Regresar3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(258, 258, 258))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        Habitat habitat = new Habitat();
        habitat.opcion();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String eliminar = JOptionPane.showInputDialog(null, "Ingrese el nombre del habitat que desea eliminar");
        eliminarHabitat(eliminar);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String buscar = JOptionPane.showInputDialog(null, "Ingrese el nombre del habitat que desea buscar");
        buscarHabitat(buscar);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void nombretxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombretxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombretxtActionPerformed

    private void Regresar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Regresar3ActionPerformed
        Ventana1 ventana = new Ventana1();

        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Regresar3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        imprimir();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nombre = nombretxt.getText();
        String ambiente = ambientetxt.getText();
        String capacidad = capacidadtxt.getText();
        if (nombre.isEmpty() || ambiente.isEmpty() || capacidad.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error, complete todos los campos");
        } else if (ent(capacidad) && str(nombre) && str(ambiente)) {
            int capacidadInt = Integer.parseInt(capacidad);

            if (contador < nombres.length) {
                nombres[contador] = nombre;
                tipoAmbiente[contador] = ambiente;
                capacidadd[contador] = capacidadInt;

                contador++;

                nombretxt.setText("");
                ambientetxt.setText("");
                capacidadtxt.setText("");

                JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error, No hay espacio para más animales");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error, no se permiten los datos ingresados ");
        }
        }

        private void imprimir() {
            if (contador == 0) {
                JOptionPane.showMessageDialog(null, "No hay habitats en el registro");
            } else {
                String mensaje = "";
                for (int i = 0; i < contador; i++) {
                    mensaje += "Nombre: " + nombres[i] + "\n";
                    mensaje += "Ambiente: " + tipoAmbiente[i] + "\n";
                    mensaje += "Capacidad: " + capacidadd[i] + "\n";

                }
                JOptionPane.showMessageDialog(null, mensaje);
            }
        }

        private void buscarHabitat (String nombre) {
            boolean encontrado = false;

            for (int i = 0; i < contador; i++) {
                if (nombres[i].equalsIgnoreCase(nombre)) {
                    JOptionPane.showMessageDialog(null, "Habitat encontrado \nNombre: " + nombres[i]
                        + "\nAmbiente: " + tipoAmbiente[i]
                        + "\nCapacidad: " + capacidadd[i]);
                    encontrado = true;
                    break;
                }

            }

            if (!encontrado) {
                JOptionPane.showMessageDialog(null, "Habitat no encontrada");
            }
        }

        private void eliminarHabitat(String nombre) {
            boolean encontrado = false;

            for (int i = 0; i < contador; i++) {
                if (nombres[i].equalsIgnoreCase(nombre)) {
                    for (int j = i; j < contador -1; j++) {
                        nombres[j] = nombres[j + 1];
                        tipoAmbiente[j] = tipoAmbiente[j + 1];
                        capacidadd[j] = capacidadd[j + 1];

                    }
                    contador--;
                    encontrado = true;
                    JOptionPane.showMessageDialog(null, "Habitat eliminado correctamente");
                    break;
                }

            }

            if (!encontrado) {
                JOptionPane.showMessageDialog(null, "Habitat no encontrado");
            }
        }

        private boolean str(String valor) {
            return valor.matches("[a-zA-Z]+");
        }

        private boolean ent(String valor) {
            if (valor.matches("\\d+")) {
                return true;
            } else {
                return false;
            }

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(RegistoHabitat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistoHabitat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistoHabitat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistoHabitat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistoHabitat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Regresar3;
    private javax.swing.JTextField ambientetxt;
    private javax.swing.JTextField capacidadtxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nombretxt;
    // End of variables declaration//GEN-END:variables
}
