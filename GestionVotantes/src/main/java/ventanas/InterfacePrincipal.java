
package ventanas;

import com.mycompany.gestionvotantes.*;


/**
 *
 * @author esteb
 */
public class InterfacePrincipal extends javax.swing.JFrame {

    
    //Declaration de mapa para guardar todo;
    LugarVotacion valpo = new LugarVotacion();
    /**
     * Creates new form InterfacePrincipal
     */
    public InterfacePrincipal(LugarVotacion valparaiso) {
        initComponents();
        setResizable(false);
        //setSize(500,500);
        
        valpo = valparaiso;
        
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
        BotonCrearV = new javax.swing.JButton();
        BotonCrearMesa = new javax.swing.JButton();
        BotonMostraTodo = new javax.swing.JButton();
        BotonBuscarRut = new javax.swing.JButton();
        LBLtitle = new javax.swing.JLabel();
        LBLetiqueta = new javax.swing.JLabel();
        BackgroundItems2 = new javax.swing.JPanel();
        BotonEliminarRut = new javax.swing.JButton();
        BotonCambiarVotantePorVocal = new javax.swing.JButton();
        BotonEliminarMesa = new javax.swing.JButton();
        BotonCrearVocal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(0, 153, 204));

        BackgroundItems.setBackground(new java.awt.Color(64, 224, 208));

        BotonCrearV.setText("CREAR VOTANTE");
        BotonCrearV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonCrearVMouseClicked(evt);
            }
        });
        BotonCrearV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCrearVActionPerformed(evt);
            }
        });

        BotonCrearMesa.setText("CREAR MESA");
        BotonCrearMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCrearMesaActionPerformed(evt);
            }
        });

        BotonMostraTodo.setText("MOSTRAR TODO");
        BotonMostraTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMostraTodoActionPerformed(evt);
            }
        });

        BotonBuscarRut.setText("BUSCAR POR RUT");
        BotonBuscarRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarRutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackgroundItemsLayout = new javax.swing.GroupLayout(BackgroundItems);
        BackgroundItems.setLayout(BackgroundItemsLayout);
        BackgroundItemsLayout.setHorizontalGroup(
            BackgroundItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundItemsLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(BackgroundItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotonCrearMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonCrearV, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundItemsLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(BackgroundItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonBuscarRut, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonMostraTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        BackgroundItemsLayout.setVerticalGroup(
            BackgroundItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundItemsLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(BotonCrearV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(BotonCrearMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(BotonMostraTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119)
                .addComponent(BotonBuscarRut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LBLtitle.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        LBLtitle.setForeground(new java.awt.Color(0, 0, 0));
        LBLtitle.setText("GESTION DE VOTANTES");

        LBLetiqueta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LBLetiqueta.setForeground(new java.awt.Color(0, 0, 0));
        LBLetiqueta.setText("MODO ADMINITRADOR");

        BackgroundItems2.setBackground(new java.awt.Color(64, 224, 208));

        BotonEliminarRut.setText("ELIMINAR POR RUT");
        BotonEliminarRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarRutActionPerformed(evt);
            }
        });

        BotonCambiarVotantePorVocal.setText("CAMBIAR VOTANTE POR VOCAL");
        BotonCambiarVotantePorVocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCambiarVotantePorVocalActionPerformed(evt);
            }
        });

        BotonEliminarMesa.setText("ELIMINAR MESA");

        BotonCrearVocal.setText("CREAR VOCAL");
        BotonCrearVocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCrearVocalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackgroundItems2Layout = new javax.swing.GroupLayout(BackgroundItems2);
        BackgroundItems2.setLayout(BackgroundItems2Layout);
        BackgroundItems2Layout.setHorizontalGroup(
            BackgroundItems2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundItems2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotonEliminarRut, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(BackgroundItems2Layout.createSequentialGroup()
                .addGroup(BackgroundItems2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundItems2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BotonCambiarVotantePorVocal, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackgroundItems2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(BackgroundItems2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonCrearVocal, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonEliminarMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 23, Short.MAX_VALUE))
        );
        BackgroundItems2Layout.setVerticalGroup(
            BackgroundItems2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundItems2Layout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addComponent(BotonCrearVocal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(BotonEliminarMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(BotonCambiarVotantePorVocal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125)
                .addComponent(BotonEliminarRut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188))
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(BackgroundItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(LBLtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(LBLetiqueta)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BackgroundItems2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(417, 417, 417))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(LBLtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LBLetiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BackgroundItems, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BackgroundItems2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 838, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //declara el mapa a utilizar
    
    
    private void BotonEliminarRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarRutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonEliminarRutActionPerformed

    private void BotonBuscarRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarRutActionPerformed
        // TODO add your handling code here:
        BuscarPorRutVentana a = new BuscarPorRutVentana(this, true, valpo);
        this.setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_BotonBuscarRutActionPerformed

    private void BotonCrearVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCrearVMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonCrearVMouseClicked

    private void BotonCrearVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCrearVActionPerformed
    // TODO add your handling code here:
        CrearVotanteVentana a = new CrearVotanteVentana(this, true, valpo);
        //visibilidad de ventanas
        this.setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_BotonCrearVActionPerformed

    private void BotonCrearMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCrearMesaActionPerformed
        // TODO add your handling code here:
        CrearMesaVentana a = new CrearMesaVentana(this, true, valpo);
        //visibilidad de ventanas
        this.setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_BotonCrearMesaActionPerformed

    private void BotonMostraTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMostraTodoActionPerformed
        // TODO add your handling code here:
        MostrarTodoVentana a = new MostrarTodoVentana(this, true, valpo);
        //visibilidad de ventanas
        a.setBounds(0, 0, 750, 600);
        this.setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_BotonMostraTodoActionPerformed

    private void BotonCrearVocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCrearVocalActionPerformed
        // TODO add your handling code here:
        //CrearVocal a = new CrearVocal(this, true, valpo);
        
    }//GEN-LAST:event_BotonCrearVocalActionPerformed

    private void BotonCambiarVotantePorVocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCambiarVotantePorVocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonCambiarVotantePorVocalActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundItems;
    private javax.swing.JPanel BackgroundItems2;
    private javax.swing.JButton BotonBuscarRut;
    private javax.swing.JButton BotonCambiarVotantePorVocal;
    private javax.swing.JButton BotonCrearMesa;
    private javax.swing.JButton BotonCrearV;
    private javax.swing.JButton BotonCrearVocal;
    private javax.swing.JButton BotonEliminarMesa;
    private javax.swing.JButton BotonEliminarRut;
    private javax.swing.JButton BotonMostraTodo;
    private javax.swing.JLabel LBLetiqueta;
    private javax.swing.JLabel LBLtitle;
    private javax.swing.JPanel background;
    // End of variables declaration//GEN-END:variables
    
}
