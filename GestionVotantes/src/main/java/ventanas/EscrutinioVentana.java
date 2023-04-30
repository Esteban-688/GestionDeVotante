/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import com.mycompany.gestionvotantes.*;
import javax.swing.JFrame;

/**
 *
 * @author esteb
 */
public class EscrutinioVentana extends javax.swing.JDialog {

   //declaration variables
    private JFrame Login;
    private LugarVotacion valpo = new LugarVotacion();
    private Persona vocal = new Vocal("", "", 0, "");
    
    public EscrutinioVentana(java.awt.Frame parent, boolean modal, LugarVotacion valparaiso, Persona vocalLogin) {
        super(parent, modal);
        Login = (JFrame) parent;
        valpo = valparaiso;
        vocal = vocalLogin;
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

        background = new javax.swing.JPanel();
        LBLTitulo = new javax.swing.JLabel();
        LBLModoVotante = new javax.swing.JLabel();
        textEntradaSi = new javax.swing.JTextField();
        LBLInformacion = new javax.swing.JLabel();
        LBLVotosSI = new javax.swing.JLabel();
        LBLVotosNo = new javax.swing.JLabel();
        textEntradaNo = new javax.swing.JTextField();
        textEntradaNulos = new javax.swing.JTextField();
        LBLVotosSI1 = new javax.swing.JLabel();
        textSalidaNombreVocal = new javax.swing.JTextField();
        textSalidaNumeroMesa = new javax.swing.JTextField();
        LBLInformacionNombre = new javax.swing.JLabel();
        LBLInformacionNMESA = new javax.swing.JLabel();
        botonEnviar = new javax.swing.JButton();
        botonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        background.setBackground(new java.awt.Color(0, 153, 204));

        LBLTitulo.setFont(new java.awt.Font("Arial Black", 1, 19)); // NOI18N
        LBLTitulo.setForeground(new java.awt.Color(0, 0, 0));
        LBLTitulo.setText("GESTION DE VOTANTES");

        LBLModoVotante.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        LBLModoVotante.setForeground(new java.awt.Color(0, 0, 0));
        LBLModoVotante.setText("Modo Vocal");

        LBLInformacion.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        LBLInformacion.setForeground(new java.awt.Color(0, 0, 0));
        LBLInformacion.setText("Porfavor Rellene los siguientes Datos");

        LBLVotosSI.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        LBLVotosSI.setForeground(new java.awt.Color(0, 0, 0));
        LBLVotosSI.setText("Cantidad Votos \"SI\"");

        LBLVotosNo.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        LBLVotosNo.setForeground(new java.awt.Color(0, 0, 0));
        LBLVotosNo.setText("Cantidad Votos \"NO\"");

        textEntradaNulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEntradaNulosActionPerformed(evt);
            }
        });

        LBLVotosSI1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        LBLVotosSI1.setForeground(new java.awt.Color(0, 0, 0));
        LBLVotosSI1.setText("Cantidad Votos \"NULOS/BLANCOS\"");

        textSalidaNombreVocal.setEditable(false);

        textSalidaNumeroMesa.setEditable(false);

        LBLInformacionNombre.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        LBLInformacionNombre.setForeground(new java.awt.Color(0, 0, 0));
        LBLInformacionNombre.setText("Nombre");

        LBLInformacionNMESA.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        LBLInformacionNMESA.setForeground(new java.awt.Color(0, 0, 0));
        LBLInformacionNMESA.setText("Numero de Mesa");

        botonEnviar.setText("ENVIAR");
        botonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEnviarActionPerformed(evt);
            }
        });

        botonVolver.setText("VOLVER");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(LBLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LBLInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonVolver)
                            .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textEntradaSi, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LBLVotosSI, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LBLVotosNo, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textEntradaNo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LBLVotosSI1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textEntradaNulos, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                                    .addComponent(botonEnviar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                                            .addComponent(LBLInformacionNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(56, 56, 56))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                                            .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(textSalidaNumeroMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(LBLInformacionNMESA, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(textSalidaNombreVocal, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(32, 32, 32))))))))
                .addGap(0, 25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LBLModoVotante, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(LBLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LBLInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LBLVotosSI, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textEntradaSi, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LBLVotosNo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textEntradaNo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LBLVotosSI1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textEntradaNulos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(LBLInformacionNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textSalidaNombreVocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botonEnviar))
                .addGap(18, 18, 18)
                .addComponent(LBLInformacionNMESA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textSalidaNumeroMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBLModoVotante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addComponent(botonVolver)
                        .addGap(22, 22, 22))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        // TODO add your handling code here:
        this.dispose();
        //visibilidad de ventanas
        Login.setVisible(true);
    }//GEN-LAST:event_botonVolverActionPerformed

    private void botonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEnviarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEnviarActionPerformed

    private void textEntradaNulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEntradaNulosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEntradaNulosActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBLInformacion;
    private javax.swing.JLabel LBLInformacionNMESA;
    private javax.swing.JLabel LBLInformacionNombre;
    private javax.swing.JLabel LBLModoVotante;
    private javax.swing.JLabel LBLTitulo;
    private javax.swing.JLabel LBLVotosNo;
    private javax.swing.JLabel LBLVotosSI;
    private javax.swing.JLabel LBLVotosSI1;
    private javax.swing.JPanel background;
    private javax.swing.JButton botonEnviar;
    private javax.swing.JButton botonVolver;
    private javax.swing.JTextField textEntradaNo;
    private javax.swing.JTextField textEntradaNulos;
    private javax.swing.JTextField textEntradaSi;
    private javax.swing.JTextField textSalidaNombreVocal;
    private javax.swing.JTextField textSalidaNumeroMesa;
    // End of variables declaration//GEN-END:variables
}
