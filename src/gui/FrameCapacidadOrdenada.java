package gui;

import app.RedHidraulica;
import javax.swing.*;
import java.awt.*;
import java.util.Objects;

/**
 *
 * @author A-GORE
 */
@SuppressWarnings({ "unchecked", "rawtypes" })
public class FrameCapacidadOrdenada extends javax.swing.JFrame {
    private final DefaultListModel modelo = new DefaultListModel();

    public FrameCapacidadOrdenada() {
        modelo.clear();
        FramePrincipal frame = new FramePrincipal();
        RedHidraulica red = frame.getRed();
        modelo.addAll(red.capacidadOrdenada());
        initComponents();
    }

    private void initComponents() {

        JScrollPane jScrollPane1 = new JScrollPane();
        JList<String> jList1 = new JList<>();
        JLabel jLabel1 = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        try {
            ImageIcon image=new ImageIcon(Objects.requireNonNull(getClass().getResource("/resources/blood.png")));
            setIconImage(image.getImage());
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "No se encuentra el icono");
        }
        setTitle("Capacidad Ordenada");

        jList1.setModel(modelo);
        jScrollPane1.setViewportView(jList1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 18));
        jLabel1.setText("Capacidad ordenada");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                .addContainerGap()));

        pack();
    }
}