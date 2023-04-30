/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import com.mycompany.gestionvotantes.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author esteb
 */
public class CambiarVotanteAVocal extends javax.swing.JDialog {

    //declaration variables
    private JFrame MenuPrincipal;
    private LugarVotacion valpo = new LugarVotacion();
    
    
    public CambiarVotanteAVocal(java.awt.Frame parent, boolean modal, LugarVotacion valparaiso) {
        super(parent, modal);
        MenuPrincipal = (JFrame) parent;
        valpo = valparaiso;
        initComponents();
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundCambiarVotanteAVocal = new javax.swing.JPanel();
        backgroundTitulo = new javax.swing.JPanel();
        LBLTitulo = new javax.swing.JLabel();
        backgroundLeft = new javax.swing.JPanel();
        LBLRut = new javax.swing.JLabel();
        LBLNombre = new javax.swing.JLabel();
        LBLNMesa = new javax.swing.JLabel();
        LBLDatos = new javax.swing.JLabel();
        LBLRutSalida = new javax.swing.JLabel();
        BotonVolver = new javax.swing.JButton();
        TextEntradaRut = new javax.swing.JTextField();
        textSalidaNombre = new javax.swing.JTextField();
        textSalidaRut = new javax.swing.JTextField();
        textSalidaNMesa = new javax.swing.JTextField();
        TextSalidaExisteVocal = new javax.swing.JTextField();
        LBLExisteVocal = new javax.swing.JLabel();
        BotonGuardar = new javax.swing.JButton();
        textSalidaUsuario = new javax.swing.JTextField();
        LBLUsuario = new javax.swing.JLabel();
        LBLContraseña = new javax.swing.JLabel();
        jPasswordEntrada = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        BackgroundCambiarVotanteAVocal.setBackground(new java.awt.Color(0, 153, 204));
        BackgroundCambiarVotanteAVocal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backgroundTitulo.setBackground(new java.awt.Color(0, 153, 204));

        LBLTitulo.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        LBLTitulo.setForeground(new java.awt.Color(0, 0, 0));
        LBLTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBLTitulo.setText("CAMBIAR VOTANTE POR VOCAL");

        javax.swing.GroupLayout backgroundTituloLayout = new javax.swing.GroupLayout(backgroundTitulo);
        backgroundTitulo.setLayout(backgroundTituloLayout);
        backgroundTituloLayout.setHorizontalGroup(
            backgroundTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundTituloLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(LBLTitulo)
                .addContainerGap(401, Short.MAX_VALUE))
        );
        backgroundTituloLayout.setVerticalGroup(
            backgroundTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundTituloLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(LBLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        BackgroundCambiarVotanteAVocal.add(backgroundTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, -1));

        backgroundLeft.setBackground(new java.awt.Color(0, 153, 204));

        LBLRut.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        LBLRut.setForeground(new java.awt.Color(0, 0, 0));
        LBLRut.setText("INGRESE EL RUT DEL VOTANTE:");

        LBLNombre.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        LBLNombre.setForeground(new java.awt.Color(0, 0, 0));
        LBLNombre.setText("NOMBRE:");

        LBLNMesa.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        LBLNMesa.setForeground(new java.awt.Color(0, 0, 0));
        LBLNMesa.setText("N° MESA:");

        LBLDatos.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        LBLDatos.setForeground(new java.awt.Color(0, 0, 0));
        LBLDatos.setText("Datos: (Al usar Enter, se visualiza Votante)");

        LBLRutSalida.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        LBLRutSalida.setForeground(new java.awt.Color(0, 0, 0));
        LBLRutSalida.setText("RUT:");

        BotonVolver.setText("VOLVER");
        BotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverActionPerformed(evt);
            }
        });

        TextEntradaRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextEntradaRutActionPerformed(evt);
            }
        });

        textSalidaNombre.setEditable(false);

        textSalidaRut.setEditable(false);

        textSalidaNMesa.setEditable(false);

        TextSalidaExisteVocal.setEditable(false);
        TextSalidaExisteVocal.setText("SI EXISTE     /    NO EXISTE");
        TextSalidaExisteVocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextSalidaExisteVocalActionPerformed(evt);
            }
        });

        LBLExisteVocal.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        LBLExisteVocal.setForeground(new java.awt.Color(0, 0, 0));
        LBLExisteVocal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBLExisteVocal.setText("Existe vocal en la Mesa");

        javax.swing.GroupLayout backgroundLeftLayout = new javax.swing.GroupLayout(backgroundLeft);
        backgroundLeft.setLayout(backgroundLeftLayout);
        backgroundLeftLayout.setHorizontalGroup(
            backgroundLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroundLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(LBLRut)
                        .addComponent(TextEntradaRut, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LBLDatos)
                    .addGroup(backgroundLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, backgroundLeftLayout.createSequentialGroup()
                            .addComponent(LBLNMesa)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textSalidaNMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, backgroundLeftLayout.createSequentialGroup()
                            .addComponent(LBLRutSalida)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textSalidaRut, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, backgroundLeftLayout.createSequentialGroup()
                            .addComponent(LBLNombre)
                            .addGap(31, 31, 31)
                            .addComponent(textSalidaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(backgroundLeftLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(backgroundLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LBLExisteVocal)
                            .addGroup(backgroundLeftLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(TextSalidaExisteVocal, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(backgroundLeftLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(BotonVolver)))))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        backgroundLeftLayout.setVerticalGroup(
            backgroundLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LBLRut, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextEntradaRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(LBLDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textSalidaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLRutSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textSalidaRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLNMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textSalidaNMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(LBLExisteVocal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextSalidaExisteVocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(BotonVolver)
                .addGap(27, 27, 27))
        );

        BackgroundCambiarVotanteAVocal.add(backgroundLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 430));

        BotonGuardar.setText("CAMBIAR");
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });
        BackgroundCambiarVotanteAVocal.add(BotonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 440, -1, -1));

        textSalidaUsuario.setEditable(false);
        BackgroundCambiarVotanteAVocal.add(textSalidaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, 130, -1));

        LBLUsuario.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        LBLUsuario.setForeground(new java.awt.Color(0, 0, 0));
        LBLUsuario.setText("USUARIO");
        BackgroundCambiarVotanteAVocal.add(LBLUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, -1, 30));

        LBLContraseña.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        LBLContraseña.setForeground(new java.awt.Color(0, 0, 0));
        LBLContraseña.setText("Contraseña");
        BackgroundCambiarVotanteAVocal.add(LBLContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 120, 30));

        jPasswordEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordEntradaActionPerformed(evt);
            }
        });
        BackgroundCambiarVotanteAVocal.add(jPasswordEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 140, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundCambiarVotanteAVocal, javax.swing.GroupLayout.PREFERRED_SIZE, 682, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundCambiarVotanteAVocal, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean enviarDatos(){
        
        String rut = TextEntradaRut.getText();
       
        char[] password = jPasswordEntrada.getPassword();
        String contraseña = new String(password);
        
       valpo.cambiaVotantePorVocal(rut, contraseña);
       valpo.eliminarPorRut(rut, true);
       JOptionPane.showMessageDialog(this, "se cambio correctamente el votante", "Excelent", JOptionPane.INFORMATION_MESSAGE);
        //volver a cero
        TextEntradaRut.setText("");
        textSalidaNombre.setText("");
        textSalidaRut.setText("");
        textSalidaNMesa.setText("");
        textSalidaUsuario.setText("");
        jPasswordEntrada.setText("");
        TextSalidaExisteVocal.setText("SI EXISTE /  NO EXISTE");
        //volver curson al inicio
       TextEntradaRut.requestFocus();
        return true;
    }
    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
        // TODO add your handling code here:
        //cerrar ventana de Dialoj
        this.dispose();
        //visibilidad de ventanas
        MenuPrincipal.setVisible(true);//con esto se hace visible la ventana principal  
    }//GEN-LAST:event_BotonVolverActionPerformed

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
        // TODO add your handling code here:
        enviarDatos();
    }//GEN-LAST:event_BotonGuardarActionPerformed
    private boolean mostrarPersonaPorElRut(){
        
        String rut = TextEntradaRut.getText();
         if(valpo.buscarRut(rut, true) == null){
             JOptionPane.showMessageDialog(this, "No se encontro resultado", "NO EXISTE", JOptionPane.INFORMATION_MESSAGE);
            TextEntradaRut.setText("");
            TextEntradaRut.requestFocus();
        }
        textSalidaNombre.setText(valpo.buscarRut(rut, true).getName());
        textSalidaRut.setText(valpo.buscarRut(rut, true).getRut());
        textSalidaNMesa.setText(Integer.toString(valpo.buscarRut(rut, true).getNMesa()));
        textSalidaUsuario.setText(valpo.buscarRut(rut, true).getRut());
       
        
        int id = Integer.parseInt(textSalidaNMesa.getText());
        if(valpo.vocalEnMesa(id)){
            //si es true existe vocal
            TextSalidaExisteVocal.setText("SI EXISTE");
        }else{
            TextSalidaExisteVocal.setText("NO EXISTE");
        }
        
        jPasswordEntrada.requestFocus();
        
        return true;
    }
    private void TextEntradaRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextEntradaRutActionPerformed
       mostrarPersonaPorElRut();
    }//GEN-LAST:event_TextEntradaRutActionPerformed

    private void jPasswordEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordEntradaActionPerformed
        // TODO add your handling code here:
        enviarDatos();
    }//GEN-LAST:event_jPasswordEntradaActionPerformed

    private void TextSalidaExisteVocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextSalidaExisteVocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextSalidaExisteVocalActionPerformed

   
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundCambiarVotanteAVocal;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonVolver;
    private javax.swing.JLabel LBLContraseña;
    private javax.swing.JLabel LBLDatos;
    private javax.swing.JLabel LBLExisteVocal;
    private javax.swing.JLabel LBLNMesa;
    private javax.swing.JLabel LBLNombre;
    private javax.swing.JLabel LBLRut;
    private javax.swing.JLabel LBLRutSalida;
    private javax.swing.JLabel LBLTitulo;
    private javax.swing.JLabel LBLUsuario;
    private javax.swing.JTextField TextEntradaRut;
    private javax.swing.JTextField TextSalidaExisteVocal;
    private javax.swing.JPanel backgroundLeft;
    private javax.swing.JPanel backgroundTitulo;
    private javax.swing.JPasswordField jPasswordEntrada;
    private javax.swing.JTextField textSalidaNMesa;
    private javax.swing.JTextField textSalidaNombre;
    private javax.swing.JTextField textSalidaRut;
    private javax.swing.JTextField textSalidaUsuario;
    // End of variables declaration//GEN-END:variables
}
