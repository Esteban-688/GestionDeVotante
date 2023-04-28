
package ventanas;

import com.mycompany.gestionvotantes.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author esteb
 */
public class CrearVotanteVentana extends javax.swing.JDialog {
    
    //declaration variables
    private JFrame MenuPrincipal;
    private LugarVotacion valpo = new LugarVotacion();
    
    
    public CrearVotanteVentana(java.awt.Frame parent, boolean modal, LugarVotacion valparaiso) {
        super(parent, modal);
        MenuPrincipal = (JFrame) parent;
        valpo = valparaiso;
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

        BackgroundCrearVotante = new javax.swing.JPanel();
        LBLcrearVotante = new javax.swing.JLabel();
        BotonVolver = new javax.swing.JButton();
        TextName = new javax.swing.JTextField();
        TextRut = new javax.swing.JTextField();
        TextNumeroMesa = new javax.swing.JTextField();
        LBLRut = new javax.swing.JLabel();
        LBLNumerodeMesa = new javax.swing.JLabel();
        LBLName = new javax.swing.JLabel();
        EnviarDatos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        BackgroundCrearVotante.setBackground(new java.awt.Color(0, 153, 204));
        BackgroundCrearVotante.setToolTipText("");

        LBLcrearVotante.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        LBLcrearVotante.setForeground(new java.awt.Color(0, 0, 0));
        LBLcrearVotante.setText("CREAR VOTANTE");

        BotonVolver.setText("VOLVER");
        BotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverActionPerformed(evt);
            }
        });

        TextName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNameActionPerformed(evt);
            }
        });

        TextRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextRutActionPerformed(evt);
            }
        });

        TextNumeroMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNumeroMesaActionPerformed(evt);
            }
        });

        LBLRut.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        LBLRut.setForeground(new java.awt.Color(0, 0, 0));
        LBLRut.setText("Rut:");

        LBLNumerodeMesa.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        LBLNumerodeMesa.setForeground(new java.awt.Color(0, 0, 0));
        LBLNumerodeMesa.setText("Número de Mesa:");

        LBLName.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        LBLName.setForeground(new java.awt.Color(0, 0, 0));
        LBLName.setText("Nombre: ");

        EnviarDatos.setText("CREAR");
        EnviarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackgroundCrearVotanteLayout = new javax.swing.GroupLayout(BackgroundCrearVotante);
        BackgroundCrearVotante.setLayout(BackgroundCrearVotanteLayout);
        BackgroundCrearVotanteLayout.setHorizontalGroup(
            BackgroundCrearVotanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundCrearVotanteLayout.createSequentialGroup()
                .addGroup(BackgroundCrearVotanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundCrearVotanteLayout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(LBLcrearVotante))
                    .addGroup(BackgroundCrearVotanteLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(BotonVolver))
                    .addGroup(BackgroundCrearVotanteLayout.createSequentialGroup()
                        .addGroup(BackgroundCrearVotanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackgroundCrearVotanteLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(LBLRut, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BackgroundCrearVotanteLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(LBLNumerodeMesa)))
                        .addGap(17, 17, 17)
                        .addGroup(BackgroundCrearVotanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextRut, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextName, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextNumeroMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(228, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundCrearVotanteLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(EnviarDatos)
                .addGap(171, 171, 171))
            .addGroup(BackgroundCrearVotanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BackgroundCrearVotanteLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(LBLName)
                    .addContainerGap(578, Short.MAX_VALUE)))
        );
        BackgroundCrearVotanteLayout.setVerticalGroup(
            BackgroundCrearVotanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundCrearVotanteLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(LBLcrearVotante, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(TextName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(BackgroundCrearVotanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextRut, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBLRut, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(BackgroundCrearVotanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextNumeroMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBLNumerodeMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(EnviarDatos)
                .addGap(14, 14, 14)
                .addComponent(BotonVolver)
                .addGap(31, 31, 31))
            .addGroup(BackgroundCrearVotanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BackgroundCrearVotanteLayout.createSequentialGroup()
                    .addGap(172, 172, 172)
                    .addComponent(LBLName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(304, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackgroundCrearVotante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackgroundCrearVotante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
        // TODO add your handling code here:
        
        //cerrar ventana de Dialoj
        this.dispose();
        //visibilidad de ventanas
        MenuPrincipal.setVisible(true);//con esto se hace visible la ventana principal                
    }//GEN-LAST:event_BotonVolverActionPerformed
    private boolean enviarDatos() {
        // Obtiene los valores de los campos de texto y realiza la acción para enviar los datos al programa
        String nombre = TextName.getText();
        String rut = TextRut.getText();
        int numeroMesa = Integer.parseInt(TextNumeroMesa.getText());
        // Realiza la acción con los datos (p. ej., enviar los valores al programa principal)
         
        //aca se rellena los datos para mandarlos al hashmap
            if(valpo.mesaExiste(numeroMesa) == false){
                
                JOptionPane.showMessageDialog(this, "Esa Mesa No existe", "NO EXISTE", JOptionPane.INFORMATION_MESSAGE);               
                   //throw ExceptionMesaNoCreada;
                //do{
                      TextNumeroMesa.setText("");
                      TextNumeroMesa.requestFocus();
                      return false;
                      // }while(valpo.mesaExiste(numeroMesa)==true);
                       // 
            }
         Votante votanteNuevo = new Votante(nombre,rut, numeroMesa);
         valpo.agregarPersonaAMesa(votanteNuevo, numeroMesa);
         
        JOptionPane.showMessageDialog(this, "Datos enviados con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        // Limpia los campos de texto
        TextName.setText("");
        TextRut.setText("");
        TextNumeroMesa.setText("");
        // Establece el enfoque en el primer campo de texto
        TextName.requestFocus();
        return true;
    }
    private void TextNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNameActionPerformed
        // TODO add your handling code here:
        TextRut.requestFocus();
    }//GEN-LAST:event_TextNameActionPerformed

    private void TextRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextRutActionPerformed
        // TODO add your handling code here:
        TextNumeroMesa.requestFocus();
    }//GEN-LAST:event_TextRutActionPerformed
        
    private void TextNumeroMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNumeroMesaActionPerformed
        // TODO add your handling code here:
        enviarDatos();
    }//GEN-LAST:event_TextNumeroMesaActionPerformed

    private void EnviarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarDatosActionPerformed
        // TODO add your handling code here:
        enviarDatos();
    }//GEN-LAST:event_EnviarDatosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundCrearVotante;
    private javax.swing.JButton BotonVolver;
    private javax.swing.JButton EnviarDatos;
    private javax.swing.JLabel LBLName;
    private javax.swing.JLabel LBLNumerodeMesa;
    private javax.swing.JLabel LBLRut;
    private javax.swing.JLabel LBLcrearVotante;
    private javax.swing.JTextField TextName;
    private javax.swing.JTextField TextNumeroMesa;
    private javax.swing.JTextField TextRut;
    // End of variables declaration//GEN-END:variables
}
