/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import dao.ListaRespuestaDAO;
import entidades.Persona;
import entidades.Respuesta;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static vistas.FormularioConsultarDatosDos.txaDescripcionProyecto4;
import static vistas.FormularioConsultarDatosDos.txtNombreProyecto2;

/**
 *
 * @author Cactus
 */
public class FormularioConsultarDatosTres extends javax.swing.JFrame {

    /**
     * Creates new form FormularioConsultarDatosTres
     */
    public FormularioConsultarDatosTres() {
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

        jPanel1 = new javax.swing.JPanel();
        lblB1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaResCanvas1 = new javax.swing.JTextArea();
        lblB2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaResCanvas2 = new javax.swing.JTextArea();
        lblB3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txaResCanvas3 = new javax.swing.JTextArea();
        lblB4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txaResCanvas4 = new javax.swing.JTextArea();
        lblB5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txaResCanvas5 = new javax.swing.JTextArea();
        lblB6 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txaResCanvas6 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        lblB7 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txaResCanvas7 = new javax.swing.JTextArea();
        lblB8 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        txaResCanvas8 = new javax.swing.JTextArea();
        lblB9 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        txaResCanvas9 = new javax.swing.JTextArea();
        lblB10 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        txaResCanvas10 = new javax.swing.JTextArea();
        lblB11 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        txaResCanvas11 = new javax.swing.JTextArea();
        lblB12 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        txaResCanvas12 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        lblB13 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        txaResCanvas13 = new javax.swing.JTextArea();
        lblB14 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        txaResCanvas14 = new javax.swing.JTextArea();
        lblB15 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        txaResCanvas15 = new javax.swing.JTextArea();
        lblB16 = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        txaResCanvas16 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtBuscarPorId = new javax.swing.JTextField();
        btnBuscarPorId = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblB1.setText("Quienes son los clientes a los que esta entregando valor?");

        txaResCanvas1.setColumns(20);
        txaResCanvas1.setRows(5);
        jScrollPane1.setViewportView(txaResCanvas1);

        lblB2.setText("Cuales son los segmentos mas importantes de clientes a los que apuesta nuestro negocio?");

        txaResCanvas2.setColumns(20);
        txaResCanvas2.setRows(5);
        jScrollPane2.setViewportView(txaResCanvas2);

        lblB3.setText("Por que deberia preferirme el segmento de clientes al que apuesta mi idea de negocio y no quedarse con la competencia?");

        txaResCanvas3.setColumns(20);
        txaResCanvas3.setRows(5);
        jScrollPane3.setViewportView(txaResCanvas3);

        lblB4.setText("A traves de que canales llego a mis clientes?");

        txaResCanvas4.setColumns(20);
        txaResCanvas4.setRows(5);
        jScrollPane4.setViewportView(txaResCanvas4);

        lblB5.setText("Cuales son los canales que funcionan mejor de acuerdo a mi segmento de clientes?");

        txaResCanvas5.setColumns(20);
        txaResCanvas5.setRows(5);
        jScrollPane5.setViewportView(txaResCanvas5);

        lblB6.setText("Cuales son los canales mas rentables de mi modelo de negocio?");

        txaResCanvas6.setColumns(20);
        txaResCanvas6.setRows(5);
        jScrollPane6.setViewportView(txaResCanvas6);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                        .addComponent(lblB1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblB2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(lblB3)
                    .addComponent(lblB4)
                    .addComponent(lblB5)
                    .addComponent(lblB6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblB1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblB2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblB3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lblB4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblB5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lblB6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        lblB7.setText("Que relacion espero tener con cada segmento de clientes descrito?");

        txaResCanvas7.setColumns(20);
        txaResCanvas7.setRows(5);
        jScrollPane7.setViewportView(txaResCanvas7);

        lblB8.setText("Cual es el costo de cada una de las formas de relacionarme con cada segmento?");

        txaResCanvas8.setColumns(20);
        txaResCanvas8.setRows(5);
        jScrollPane9.setViewportView(txaResCanvas8);

        lblB9.setText("Porque está dispuesto a pagar nuestro diferente segmento de clientes?");

        txaResCanvas9.setColumns(20);
        txaResCanvas9.setRows(5);
        jScrollPane10.setViewportView(txaResCanvas9);

        lblB10.setText("Por qué pagan actualmente nuestro segmento de clientes potenciales?");

        txaResCanvas10.setColumns(20);
        txaResCanvas10.setRows(5);
        jScrollPane11.setViewportView(txaResCanvas10);

        lblB11.setText("Por qué medio prefiere pagar cada segmento de clientes");

        txaResCanvas11.setColumns(20);
        txaResCanvas11.setRows(5);
        jScrollPane12.setViewportView(txaResCanvas11);

        lblB12.setText("Que recurso clave se debe gestionar para que nuestra oferta de valor llegue a los distintos?");

        txaResCanvas12.setColumns(20);
        txaResCanvas12.setRows(5);
        jScrollPane13.setViewportView(txaResCanvas12);

        lblB13.setText("Segmentos de clientes definidos en el modelo de negocios?");

        txaResCanvas13.setColumns(20);
        txaResCanvas13.setRows(5);
        jScrollPane14.setViewportView(txaResCanvas13);

        lblB14.setText("<html>Que actividades clave se desarrollan para que nuestro efecto de valor llegue a los distintos segmentos de clientes<p>definido por nuestro modelo de negocio?<html>");

        txaResCanvas14.setColumns(20);
        txaResCanvas14.setRows(5);
        jScrollPane15.setViewportView(txaResCanvas14);

        lblB15.setText("<html>Defina cuales son los costos (fijos y variables) en que debe incurrir su negocio a traves de actividad y<p>recursos claves para llegar a sus clientes con oferta de valor?</html>");

        txaResCanvas15.setColumns(20);
        txaResCanvas15.setRows(5);
        jScrollPane16.setViewportView(txaResCanvas15);

        lblB16.setText("Cuales son alianzas gestionada para mejorar la satisfaccion de los clientes a traves de la oferta de valor?");

        txaResCanvas16.setColumns(20);
        txaResCanvas16.setRows(5);
        jScrollPane17.setViewportView(txaResCanvas16);

        jButton1.setText("ATRAS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblB13)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblB14)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblB15)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblB16)
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblB13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lblB14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lblB15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lblB16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblB7)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblB8)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblB9)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblB10)
                    .addComponent(lblB11)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblB12)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblB7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lblB8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblB9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblB10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lblB11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblB12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.setText("Buscar por ID:");

        btnBuscarPorId.setText("Buscar");
        btnBuscarPorId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPorIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscarPorId, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarPorId)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtBuscarPorId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarPorId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        FormularioConsultarDatosDos abrir = new FormularioConsultarDatosDos();
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnBuscarPorIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPorIdActionPerformed
        // TODO add your handling code here:
        
        
        Persona p = new Persona();
        Respuesta r = new Respuesta();
        ListaRespuestaDAO lrDAO = new ListaRespuestaDAO();

        if (txtBuscarPorId.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Debe ingresar un id", "ERROR", JOptionPane.WARNING_MESSAGE);

        } else {

            p.setIdPersona(Integer.parseInt(txtBuscarPorId.getText()));

            try {

                ArrayList<String> resp = null;

                resp = lrDAO.listarRespuestaPorId(r, p);
                if (resp.size() == 0) {

                    JOptionPane.showMessageDialog(null, "No se encontraron respuestas con el ID ingresado", "ERROR", JOptionPane.WARNING_MESSAGE);

                    
                }

                
                txaResCanvas1.setText(resp.get(19));
                txaResCanvas2.setText(resp.get(20));
                txaResCanvas3.setText(resp.get(21));
                txaResCanvas4.setText(resp.get(22));
                txaResCanvas5.setText(resp.get(23));
                txaResCanvas6.setText(resp.get(24));
                txaResCanvas7.setText(resp.get(25));
                txaResCanvas8.setText(resp.get(26));
                txaResCanvas9.setText(resp.get(27));
                txaResCanvas10.setText(resp.get(28));
                txaResCanvas11.setText(resp.get(29));
                txaResCanvas12.setText(resp.get(30));
                txaResCanvas13.setText(resp.get(31));
                txaResCanvas14.setText(resp.get(32));
                txaResCanvas15.setText(resp.get(33));
                txaResCanvas16.setText(resp.get(34));

            } catch (Exception e) {

                System.out.println("ERROR: " + e.getMessage());

            }
        }
        
        
    }//GEN-LAST:event_btnBuscarPorIdActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioConsultarDatosTres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioConsultarDatosTres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioConsultarDatosTres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioConsultarDatosTres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioConsultarDatosTres().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarPorId;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel lblB1;
    private javax.swing.JLabel lblB10;
    private javax.swing.JLabel lblB11;
    private javax.swing.JLabel lblB12;
    private javax.swing.JLabel lblB13;
    private javax.swing.JLabel lblB14;
    private javax.swing.JLabel lblB15;
    private javax.swing.JLabel lblB16;
    private javax.swing.JLabel lblB2;
    private javax.swing.JLabel lblB3;
    private javax.swing.JLabel lblB4;
    private javax.swing.JLabel lblB5;
    private javax.swing.JLabel lblB6;
    private javax.swing.JLabel lblB7;
    private javax.swing.JLabel lblB8;
    private javax.swing.JLabel lblB9;
    public static javax.swing.JTextArea txaResCanvas1;
    public static javax.swing.JTextArea txaResCanvas10;
    public static javax.swing.JTextArea txaResCanvas11;
    public static javax.swing.JTextArea txaResCanvas12;
    public static javax.swing.JTextArea txaResCanvas13;
    public static javax.swing.JTextArea txaResCanvas14;
    public static javax.swing.JTextArea txaResCanvas15;
    public static javax.swing.JTextArea txaResCanvas16;
    public static javax.swing.JTextArea txaResCanvas2;
    public static javax.swing.JTextArea txaResCanvas3;
    public static javax.swing.JTextArea txaResCanvas4;
    public static javax.swing.JTextArea txaResCanvas5;
    public static javax.swing.JTextArea txaResCanvas6;
    public static javax.swing.JTextArea txaResCanvas7;
    public static javax.swing.JTextArea txaResCanvas8;
    public static javax.swing.JTextArea txaResCanvas9;
    private javax.swing.JTextField txtBuscarPorId;
    // End of variables declaration//GEN-END:variables
}