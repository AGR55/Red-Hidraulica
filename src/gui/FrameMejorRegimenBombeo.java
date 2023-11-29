package gui;

import app.Motores;
import app.RedHidraulica;
import model.ModeloTablaMotores;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author A-GORE
 */
public class FrameMejorRegimenBombeo extends javax.swing.JFrame {
    private final FramePrincipal frame=new FramePrincipal();
    private final RedHidraulica red=frame.getRed();
    private final ArrayList<Motores> motores=red.mejorRegimen();

    public FrameMejorRegimenBombeo() {
        initComponents();
    }

    private void initComponents() {

        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        javax.swing.JTable jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        try {
            ImageIcon image=new ImageIcon(Objects.requireNonNull(getClass().getResource("/resources/blood.png")));
            setIconImage(image.getImage());
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "No se encuentra el icono");
        }
        setTitle("Motores de mejor regimen");

        jLabel1.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 18));
        jLabel1.setText("Motores con mejor regimen de bombeo");

        jTable1.setModel(new ModeloTablaMotores(motores));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }
}