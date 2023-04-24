/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gestionvotantes;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.HashMap;

/**
 *
 * @author esteb
 */
public class InterfacePrincipal extends javax.swing.JFrame {

    /**
     * Creates new form InterfacePrincipal
     */
    public InterfacePrincipal() {
        initComponents();
        //setSize(500,500);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        BackgroundItems = new javax.swing.JPanel();
        BotonAgregarV = new javax.swing.JButton();
        BotonMostrarTodo = new javax.swing.JButton();
        BotonMostraPorMesa = new javax.swing.JButton();
        BotonBuscarRut = new javax.swing.JButton();
        BotonEliminarRut = new javax.swing.JButton();
        BotonEliminarMesa = new javax.swing.JButton();
        LBLtitle = new javax.swing.JLabel();
        LBLetiqueta = new javax.swing.JLabel();
        BackgroundItems2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(0, 153, 204));

        BackgroundItems.setBackground(new java.awt.Color(64, 224, 208));

        javax.swing.GroupLayout BackgroundItemsLayout = new javax.swing.GroupLayout(BackgroundItems);
        BackgroundItems.setLayout(BackgroundItemsLayout);
        BackgroundItemsLayout.setHorizontalGroup(
            BackgroundItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
        );
        BackgroundItemsLayout.setVerticalGroup(
            BackgroundItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 584, Short.MAX_VALUE)
        );

        BotonAgregarV.setText("Agregar Votante");
        BotonAgregarV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonAgregarVMouseClicked(evt);
            }
        });
        BotonAgregarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarVActionPerformed(evt);
            }
        });

        BotonMostrarTodo.setText("Mostrar Todas las Mesas");

        BotonMostraPorMesa.setText("Mostrar Por Mesa");

        BotonBuscarRut.setText("Buscar por RUT");
        BotonBuscarRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarRutActionPerformed(evt);
            }
        });

        BotonEliminarRut.setText("Eliminar por RUT");
        BotonEliminarRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarRutActionPerformed(evt);
            }
        });

        BotonEliminarMesa.setText("Eliminar Mesa");

        LBLtitle.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        LBLtitle.setForeground(new java.awt.Color(0, 0, 0));
        LBLtitle.setText("GESTION DE VOTANTES");

        LBLetiqueta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LBLetiqueta.setForeground(new java.awt.Color(0, 0, 0));
        LBLetiqueta.setText("MODO ADMINITRADOR");

        BackgroundItems2.setBackground(new java.awt.Color(64, 224, 208));

        javax.swing.GroupLayout BackgroundItems2Layout = new javax.swing.GroupLayout(BackgroundItems2);
        BackgroundItems2.setLayout(BackgroundItems2Layout);
        BackgroundItems2Layout.setHorizontalGroup(
            BackgroundItems2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
        );
        BackgroundItems2Layout.setVerticalGroup(
            BackgroundItems2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(BackgroundItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(LBLtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BotonMostraPorMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonBuscarRut, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BotonAgregarV, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BotonMostrarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(200, 200, 200)
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BotonEliminarMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BotonEliminarRut, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(30, 30, 30))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LBLetiqueta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(BackgroundItems2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(LBLtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonAgregarV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonEliminarRut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonMostrarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonEliminarMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addComponent(BotonMostraPorMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(BotonBuscarRut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LBLetiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BackgroundItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackgroundItems2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonEliminarRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarRutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonEliminarRutActionPerformed

    private void BotonBuscarRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarRutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonBuscarRutActionPerformed

    private void BotonAgregarVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonAgregarVMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonAgregarVMouseClicked

    private void BotonAgregarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarVActionPerformed
            // TODO add your handling code here:
    }//GEN-LAST:event_BotonAgregarVActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundItems;
    private javax.swing.JPanel BackgroundItems2;
    private javax.swing.JButton BotonAgregarV;
    private javax.swing.JButton BotonBuscarRut;
    private javax.swing.JButton BotonEliminarMesa;
    private javax.swing.JButton BotonEliminarRut;
    private javax.swing.JButton BotonMostraPorMesa;
    private javax.swing.JButton BotonMostrarTodo;
    private javax.swing.JLabel LBLetiqueta;
    private javax.swing.JLabel LBLtitle;
    private javax.swing.JPanel background;
    // End of variables declaration//GEN-END:variables
    
}