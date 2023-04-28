
package ventanas;

import com.mycompany.gestionvotantes.*;
import java.awt.Dimension;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.*;

/**
 *
 * @author esteb
 */
public class MostrarTodoVentana extends javax.swing.JDialog {

    /**
     * Creates new form MostrarTodoVentana
     */
    //declaration de variables
    
    private JFrame MenuPrincipal;
    private LugarVotacion valpo = new LugarVotacion();
    private DefaultTableModel modelo;
    private JTable tabla;
    private JScrollPane scrollPane;
    
    public MostrarTodoVentana(java.awt.Frame parent, boolean modal, LugarVotacion valparaiso) {
         super(parent, modal);
        MenuPrincipal = (JFrame) parent;
        valpo = valparaiso;
        initComponents();
        

        // Crear el modelo de tabla
        modelo = new DefaultTableModel();

        // Agregar las columnas al modelo
        modelo.addColumn("NOMBRE");
        modelo.addColumn("RUT");
        modelo.addColumn("N° MESA");

        // Crear la JTable con el modelo
        tabla = new JTable(modelo);

        // Crear el JScrollPane y agregar la JTable dentro de él
        scrollPane = new JScrollPane(tabla);
        //scrollPane.setPreferredSize(new Dimension(BackgroundMostrarTodo.getWidth(), BackgroundMostrarTodo.getHeight() - BotonVolver.getHeight() - LBLMostrarTodo.getHeight()));
        
        agregarVotantesAFila();
        //scrollPane.setPreferredSize(new Dimension(500, tabla.getPreferredSize().height));
        BackgroundMostrarTodo.add(scrollPane);
        
        
    }
        public void agregarVotantesAFila() {
            // Obtener el modelo de la tabla
            DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();

            // Limpiar las filas existentes en el modelo
            modelo.setRowCount(0);
                
            // Recorrer el HashMap y agregar los votantes a las filas del modelo
            valpo.recorrerHashmap(modelo);
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
        BackgroundMostrarTodo = new javax.swing.JPanel();
        LBLMostrarTodo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        BotonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackgroundMostrarTodo.setBackground(new java.awt.Color(0, 153, 204));

        LBLMostrarTodo.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        LBLMostrarTodo.setForeground(new java.awt.Color(0, 0, 0));
        LBLMostrarTodo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBLMostrarTodo.setText("MOSTRAR TODO");
        BackgroundMostrarTodo.add(LBLMostrarTodo);

        jPanel1.add(BackgroundMostrarTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 610, 540));

        jPanel3.setBackground(new java.awt.Color(0, 153, 204));

        BotonVolver.setText("VOLVER");
        BotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(BotonVolver)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(480, Short.MAX_VALUE)
                .addComponent(BotonVolver)
                .addGap(28, 28, 28))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    
       //
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundMostrarTodo;
    private javax.swing.JButton BotonVolver;
    private javax.swing.JLabel LBLMostrarTodo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
