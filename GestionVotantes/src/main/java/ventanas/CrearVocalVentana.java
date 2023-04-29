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
public class CrearVocalVentana extends javax.swing.JDialog {

    //declaration variable 
    
    private JFrame MenuPrincipal;
    private LugarVotacion valpo = new LugarVotacion();
    
    
    public CrearVocalVentana(java.awt.Frame parent, boolean modal,LugarVotacion valparaiso) {
        super(parent, modal);
        MenuPrincipal = (JFrame) parent;
        valpo = valparaiso;
        initComponents();
        setResizable(false);
        TextEntradaNombre.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundCrearVocal = new javax.swing.JPanel();
        PanelTitulo = new javax.swing.JPanel();
        LBLTitulo = new javax.swing.JLabel();
        LBLNombre = new javax.swing.JLabel();
        TextEntradaNombre = new javax.swing.JTextField();
        LBLRut = new javax.swing.JLabel();
        LBLMesa = new javax.swing.JLabel();
        TextEntradaRut = new javax.swing.JTextField();
        TextEntradaNumeroMesa = new javax.swing.JTextField();
        PanelUsuario = new javax.swing.JPanel();
        TextSalidaUsuario = new javax.swing.JTextField();
        LBLUsuario = new javax.swing.JLabel();
        LBLContraseña = new javax.swing.JLabel();
        jPasswordEntrada = new javax.swing.JPasswordField();
        BotonVolver = new javax.swing.JButton();
        BotonGuardar = new javax.swing.JButton();
        TextSalidaExisteVocal = new javax.swing.JTextField();
        LBLExisteVocal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        BackgroundCrearVocal.setBackground(new java.awt.Color(0, 153, 204));

        PanelTitulo.setBackground(new java.awt.Color(0, 153, 204));

        LBLTitulo.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        LBLTitulo.setForeground(new java.awt.Color(0, 0, 0));
        LBLTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBLTitulo.setText("CREAR VOCAL");

        javax.swing.GroupLayout PanelTituloLayout = new javax.swing.GroupLayout(PanelTitulo);
        PanelTitulo.setLayout(PanelTituloLayout);
        PanelTituloLayout.setHorizontalGroup(
            PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(LBLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelTituloLayout.setVerticalGroup(
            PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(LBLTitulo)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        LBLNombre.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        LBLNombre.setForeground(new java.awt.Color(0, 0, 0));
        LBLNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBLNombre.setText("NOMBRE:");

        TextEntradaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextEntradaNombreActionPerformed(evt);
            }
        });

        LBLRut.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        LBLRut.setForeground(new java.awt.Color(0, 0, 0));
        LBLRut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBLRut.setText("RUT:");

        LBLMesa.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        LBLMesa.setForeground(new java.awt.Color(0, 0, 0));
        LBLMesa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBLMesa.setText("NUMERO DE MESA:");

        TextEntradaRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextEntradaRutActionPerformed(evt);
            }
        });

        TextEntradaNumeroMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextEntradaNumeroMesaActionPerformed(evt);
            }
        });

        PanelUsuario.setBackground(new java.awt.Color(0, 153, 204));

        TextSalidaUsuario.setEditable(false);

        LBLUsuario.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        LBLUsuario.setForeground(new java.awt.Color(0, 0, 0));
        LBLUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBLUsuario.setText("USUARIO");

        LBLContraseña.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        LBLContraseña.setForeground(new java.awt.Color(0, 0, 0));
        LBLContraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBLContraseña.setText("CONTRASEÑA");

        jPasswordEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordEntradaActionPerformed(evt);
            }
        });

        BotonVolver.setText("VOLVER");
        BotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverActionPerformed(evt);
            }
        });

        BotonGuardar.setText("Guardar");
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelUsuarioLayout = new javax.swing.GroupLayout(PanelUsuario);
        PanelUsuario.setLayout(PanelUsuarioLayout);
        PanelUsuarioLayout.setHorizontalGroup(
            PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUsuarioLayout.createSequentialGroup()
                .addGroup(PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelUsuarioLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextSalidaUsuario)
                            .addComponent(jPasswordEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelUsuarioLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BotonVolver)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelUsuarioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotonGuardar)
                .addGap(49, 49, 49))
            .addGroup(PanelUsuarioLayout.createSequentialGroup()
                .addGroup(PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelUsuarioLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(LBLContraseña))
                    .addGroup(PanelUsuarioLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(LBLUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        PanelUsuarioLayout.setVerticalGroup(
            PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelUsuarioLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(LBLUsuario)
                .addGap(18, 18, 18)
                .addComponent(TextSalidaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(LBLContraseña)
                .addGap(18, 18, 18)
                .addComponent(jPasswordEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(BotonVolver)
                .addContainerGap())
        );

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

        javax.swing.GroupLayout BackgroundCrearVocalLayout = new javax.swing.GroupLayout(BackgroundCrearVocal);
        BackgroundCrearVocal.setLayout(BackgroundCrearVocalLayout);
        BackgroundCrearVocalLayout.setHorizontalGroup(
            BackgroundCrearVocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BackgroundCrearVocalLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(BackgroundCrearVocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundCrearVocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(TextEntradaNumeroMesa)
                        .addComponent(LBLMesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LBLNombre)
                        .addComponent(LBLRut)
                        .addComponent(TextSalidaExisteVocal))
                    .addComponent(TextEntradaRut, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBLExisteVocal)
                    .addComponent(TextEntradaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        BackgroundCrearVocalLayout.setVerticalGroup(
            BackgroundCrearVocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundCrearVocalLayout.createSequentialGroup()
                .addComponent(PanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(BackgroundCrearVocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundCrearVocalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(BackgroundCrearVocalLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(LBLNombre)
                        .addGap(18, 18, 18)
                        .addComponent(TextEntradaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(LBLRut)
                        .addGap(18, 18, 18)
                        .addComponent(TextEntradaRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(LBLMesa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TextEntradaNumeroMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LBLExisteVocal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TextSalidaExisteVocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundCrearVocal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundCrearVocal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
        
        //cerrar ventana de Dialoj
        this.dispose();
        //visibilidad de ventanas
        MenuPrincipal.setVisible(true);//con esto se hace visible la ventana principal
    }//GEN-LAST:event_BotonVolverActionPerformed

    private void TextEntradaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextEntradaNombreActionPerformed
        // TODO add your handling code here:
        TextSalidaUsuario.setText(TextEntradaNombre.getText());
        TextEntradaRut.requestFocus();
        
    }//GEN-LAST:event_TextEntradaNombreActionPerformed

    private void TextEntradaRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextEntradaRutActionPerformed
        // TODO add your handling code here:
        TextEntradaNumeroMesa.requestFocus();
    }//GEN-LAST:event_TextEntradaRutActionPerformed

    private void jPasswordEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordEntradaActionPerformed
        // TODO add your handling code here:
        enviarDatos();
    }//GEN-LAST:event_jPasswordEntradaActionPerformed

    private void TextEntradaNumeroMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextEntradaNumeroMesaActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(TextEntradaNumeroMesa.getText());
        if(valpo.vocalEnMesa(id)){
            //si es true existe vocal
            TextSalidaExisteVocal.setText("SI EXISTE");
        }else{
            TextSalidaExisteVocal.setText("NO EXISTE");
        }
        jPasswordEntrada.requestFocus();
    }//GEN-LAST:event_TextEntradaNumeroMesaActionPerformed

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
        // TODO add your handling code here:
        enviarDatos();
    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void TextSalidaExisteVocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextSalidaExisteVocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextSalidaExisteVocalActionPerformed
    public boolean enviarDatos(){
        //declaration variable
        // Obtiene los valores de los campos de texto y realiza la acción para enviar los datos al programa
        String nombre = TextEntradaNombre.getText();
        String rut = TextEntradaRut.getText();
        int numeroMesa = Integer.parseInt(TextEntradaNumeroMesa.getText());
        // Realiza la acción con los datos (p. ej., enviar los valores al programa principal)
         
        //aca se rellena los datos para mandarlos al hashmap
            if(valpo.mesaExiste(numeroMesa) == false){
                
                JOptionPane.showMessageDialog(this, "Esa Mesa No existe", "NO EXISTE", JOptionPane.INFORMATION_MESSAGE);               
                   //throw ExceptionMesaNoCreada;
                //do{
                      TextEntradaNumeroMesa.setText("");
                      TextEntradaNumeroMesa.requestFocus();
                      return false;
                      // }while(valpo.mesaExiste(numeroMesa)==true);
                       // 
            }
            //para obtener la contraseña
        char[] password = jPasswordEntrada.getPassword();
        String contraseña = new String(password);
        
         Vocal nuevoVocal = new Vocal(nombre,rut, numeroMesa,contraseña);
         valpo.agregarPersonaAMesa(nuevoVocal, numeroMesa);
         
        JOptionPane.showMessageDialog(this, "Datos enviados con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        // Limpia los campos de texto
        TextEntradaNombre.setText("");
        TextEntradaRut.setText("");
        TextEntradaNumeroMesa.setText("");
        TextSalidaUsuario.setText("");
        jPasswordEntrada.setText("");
        TextSalidaExisteVocal.setText("SI EXISTE /  NO EXISTE");
        // Establece el enfoque en el primer campo de texto
        TextEntradaNombre.requestFocus();
        return true;
    }
    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundCrearVocal;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonVolver;
    private javax.swing.JLabel LBLContraseña;
    private javax.swing.JLabel LBLExisteVocal;
    private javax.swing.JLabel LBLMesa;
    private javax.swing.JLabel LBLNombre;
    private javax.swing.JLabel LBLRut;
    private javax.swing.JLabel LBLTitulo;
    private javax.swing.JLabel LBLUsuario;
    private javax.swing.JPanel PanelTitulo;
    private javax.swing.JPanel PanelUsuario;
    private javax.swing.JTextField TextEntradaNombre;
    private javax.swing.JTextField TextEntradaNumeroMesa;
    private javax.swing.JTextField TextEntradaRut;
    private javax.swing.JTextField TextSalidaExisteVocal;
    private javax.swing.JTextField TextSalidaUsuario;
    private javax.swing.JPasswordField jPasswordEntrada;
    // End of variables declaration//GEN-END:variables
}
