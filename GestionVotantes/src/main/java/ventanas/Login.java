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
public class Login extends javax.swing.JFrame {

    //Declaration de mapa para guardar todo;
    LugarVotacion valpo = new LugarVotacion();
    private JFrame MenuPrincipal;
    
    public Login(LugarVotacion valparaiso, java.awt.Frame parent) {
        valpo = valparaiso;
        MenuPrincipal = (JFrame) parent;
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

        BackgroundLogin = new javax.swing.JPanel();
        panelContenido = new javax.swing.JPanel();
        LBLtitulo = new javax.swing.JLabel();
        LBLUsuario = new javax.swing.JLabel();
        LBLUsuario1 = new javax.swing.JLabel();
        textEntradaUsuario = new javax.swing.JTextField();
        jPasswordEntrada = new javax.swing.JPasswordField();
        panelMODOADMIN = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackgroundLogin.setBackground(new java.awt.Color(0, 153, 204));

        panelContenido.setBackground(new java.awt.Color(0, 153, 204));

        LBLtitulo.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        LBLtitulo.setForeground(new java.awt.Color(0, 0, 0));
        LBLtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBLtitulo.setText("LOGIN");

        LBLUsuario.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        LBLUsuario.setForeground(new java.awt.Color(0, 0, 0));
        LBLUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBLUsuario.setText("USUARIO");

        LBLUsuario1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        LBLUsuario1.setForeground(new java.awt.Color(0, 0, 0));
        LBLUsuario1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBLUsuario1.setText("CONTRASEÑA");

        javax.swing.GroupLayout panelContenidoLayout = new javax.swing.GroupLayout(panelContenido);
        panelContenido.setLayout(panelContenidoLayout);
        panelContenidoLayout.setHorizontalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenidoLayout.createSequentialGroup()
                .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelContenidoLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(LBLUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelContenidoLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(LBLtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelContenidoLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textEntradaUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                            .addComponent(jPasswordEntrada)))
                    .addGroup(panelContenidoLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(LBLUsuario1)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        panelContenidoLayout.setVerticalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenidoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(LBLtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addComponent(LBLUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textEntradaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(LBLUsuario1)
                .addGap(18, 18, 18)
                .addComponent(jPasswordEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        panelMODOADMIN.setBackground(new java.awt.Color(0, 153, 204));

        jButton1.setText("MODO ADMIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMODOADMINLayout = new javax.swing.GroupLayout(panelMODOADMIN);
        panelMODOADMIN.setLayout(panelMODOADMINLayout);
        panelMODOADMINLayout.setHorizontalGroup(
            panelMODOADMINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMODOADMINLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        panelMODOADMINLayout.setVerticalGroup(
            panelMODOADMINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMODOADMINLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout BackgroundLoginLayout = new javax.swing.GroupLayout(BackgroundLogin);
        BackgroundLogin.setLayout(BackgroundLoginLayout);
        BackgroundLoginLayout.setHorizontalGroup(
            BackgroundLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLoginLayout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(panelContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(253, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelMODOADMIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        BackgroundLoginLayout.setVerticalGroup(
            BackgroundLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelContenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(panelMODOADMIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        MenuPrincipal.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundLogin;
    private javax.swing.JLabel LBLUsuario;
    private javax.swing.JLabel LBLUsuario1;
    private javax.swing.JLabel LBLtitulo;
    private javax.swing.JButton jButton1;
    private javax.swing.JPasswordField jPasswordEntrada;
    private javax.swing.JPanel panelContenido;
    private javax.swing.JPanel panelMODOADMIN;
    private javax.swing.JTextField textEntradaUsuario;
    // End of variables declaration//GEN-END:variables
}
