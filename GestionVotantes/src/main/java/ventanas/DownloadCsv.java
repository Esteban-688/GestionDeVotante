
package ventanas;

/**
 *
 * @author esteb
 */
import com.mycompany.gestionvotantes.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DownloadCsv extends javax.swing.JDialog {
    //declaration variables
    private JFrame MenuPrincipal;
    private LugarVotacion valpo = new LugarVotacion();
    
    //constructor
    public DownloadCsv(java.awt.Frame parent, boolean modal, LugarVotacion valparaiso) {
        super(parent, modal);
        MenuPrincipal = (JFrame) parent;
        valpo = valparaiso;
        initComponents();
        setResizable(false);
    }
    
    private void initComponents(){
        setTitle("CSV Downloader");
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 153, 204));

        JButton downloadButton = new JButton("Descargar CSV");
        downloadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                downloadCSV();
            }
        });

        JButton backButton = new JButton("VOLVER");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                MenuPrincipal.setVisible(true);
            }
        });
        JLabel label = new JLabel("DESCARGAR CSV");
        label.setFont(new Font("Arial Black", Font.BOLD, 24));

        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.weightx = 0.0;
        gbc.weighty = 5.0;
        gbc.anchor = GridBagConstraints.PAGE_END;
        gbc.insets = new Insets(10, 10, 10, 10);
        panel.add(backButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.weightx = 0.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(downloadButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 0.0;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(label, gbc);

        getContentPane().add(panel);
        pack();
        setLocation(0, 0);
        setSize(400, 300);
    }
    
    private void downloadCSV() {
        List<String[]> datos = new ArrayList<>();
        datos.add(new String[]{"Nombre", "Rut", "Numero de Mesa"});
        valpo.recorrerHashmap(datos);
        
        StringBuilder csvContent = new StringBuilder();
        for (String[] row : datos) {
            csvContent.append(String.join(",", row)).append("\n");
        }
        
        JFileChooser fileChooser = new JFileChooser();
        int option = fileChooser.showSaveDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileChooser.getSelectedFile()))) {
                writer.write(csvContent.toString());
                writer.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
