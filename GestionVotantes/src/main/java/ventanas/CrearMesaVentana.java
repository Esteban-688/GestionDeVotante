/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author esteb
 */
public class CrearMesaVentana extends javax.swing.JDialog {

    /**
     * Creates new form CrearMesaVentana
     */
    //declaration de variables
    private JFrame MenuPrincipal;
    
    
    
    public CrearMesaVentana(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        MenuPrincipal = (JFrame) parent;
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

        BackgroundCrearMesa = new javax.swing.JPanel();
        LBLcrearMesa = new javax.swing.JLabel();
        BOTONVOLVER = new javax.swing.JButton();
        textNumeroMesa = new javax.swing.JTextField();
        LBLNumeroMesa = new javax.swing.JLabel();
        BotonCrearMesa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        BackgroundCrearMesa.setBackground(new java.awt.Color(0, 153, 204));

        LBLcrearMesa.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        LBLcrearMesa.setForeground(new java.awt.Color(0, 0, 0));
        LBLcrearMesa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBLcrearMesa.setText("CREAR MESA");

        BOTONVOLVER.setText("VOLVER");
        BOTONVOLVER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTONVOLVERActionPerformed(evt);
            }
        });

        textNumeroMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNumeroMesaActionPerformed(evt);
            }
        });

        LBLNumeroMesa.setBackground(new java.awt.Color(0, 0, 0));
        LBLNumeroMesa.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        LBLNumeroMesa.setForeground(new java.awt.Color(0, 0, 0));
        LBLNumeroMesa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBLNumeroMesa.setText("Ingrese Numero de Mesa");

        BotonCrearMesa.setText("Crear Mesa");
        BotonCrearMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCrearMesaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackgroundCrearMesaLayout = new javax.swing.GroupLayout(BackgroundCrearMesa);
        BackgroundCrearMesa.setLayout(BackgroundCrearMesaLayout);
        BackgroundCrearMesaLayout.setHorizontalGroup(
            BackgroundCrearMesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundCrearMesaLayout.createSequentialGroup()
                .addGroup(BackgroundCrearMesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundCrearMesaLayout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(LBLcrearMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackgroundCrearMesaLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(BOTONVOLVER, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackgroundCrearMesaLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(LBLNumeroMesa))
                    .addGroup(BackgroundCrearMesaLayout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(textNumeroMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackgroundCrearMesaLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(BotonCrearMesa)))
                .addContainerGap(237, Short.MAX_VALUE))
        );
        BackgroundCrearMesaLayout.setVerticalGroup(
            BackgroundCrearMesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundCrearMesaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(LBLcrearMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123)
                .addComponent(LBLNumeroMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(textNumeroMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(BotonCrearMesa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addComponent(BOTONVOLVER, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundCrearMesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackgroundCrearMesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BOTONVOLVERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTONVOLVERActionPerformed
        // TODO add your handling code here:
        //cerrar ventana de Dialoj
        this.dispose();
        //visibilidad de ventanas
        MenuPrincipal.setVisible(true);//con esto se hace visible la ventana principal
    }//GEN-LAST:event_BOTONVOLVERActionPerformed
    private void enviarDatos() {
            // Obtiene los valores de los campos de texto y realiza la acción para enviar los datos al programa
            int NumeroMesa = Integer.parseInt(textNumeroMesa.getText());
            // Realiza la acción con los datos (p. ej., enviar los valores al programa principal)
             JOptionPane.showMessageDialog(this, "Datos enviados con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            // Limpia los campos de texto
            
            textNumeroMesa.setText("");
            // Establece el enfoque en el primer campo de texto
            textNumeroMesa.requestFocus();
        }
    private void textNumeroMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNumeroMesaActionPerformed
       // TODO add your handling code here:
       enviarDatos();
    }//GEN-LAST:event_textNumeroMesaActionPerformed

    private void BotonCrearMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCrearMesaActionPerformed
        // TODO add your handling code here:
        enviarDatos();
    }//GEN-LAST:event_BotonCrearMesaActionPerformed
    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOTONVOLVER;
    private javax.swing.JPanel BackgroundCrearMesa;
    private javax.swing.JButton BotonCrearMesa;
    private javax.swing.JLabel LBLNumeroMesa;
    private javax.swing.JLabel LBLcrearMesa;
    private javax.swing.JTextField textNumeroMesa;
    // End of variables declaration//GEN-END:variables
}
