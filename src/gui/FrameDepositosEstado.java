package gui;

import app.RedHidraulica;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author A-GORE
 */
public class FrameDepositosEstado extends javax.swing.JFrame {
    private final FramePrincipal frame = new FramePrincipal();
    private final RedHidraulica red = frame.getRed();
    @SuppressWarnings("rawtypes")
    private final DefaultListModel modelo=new DefaultListModel();

    public FrameDepositosEstado() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        javax.swing.JButton infoButton = new javax.swing.JButton();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        abasto = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        try {
            ImageIcon image=new ImageIcon(getClass().getResource("/resources/blood.png"));
            setIconImage(image.getImage());
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "No se encuentra el icono");
        }
        setTitle("Informacion de depositos");

        jLabel1.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 18)); // NOI18N
        jLabel1.setText("Informacion sobre depositos en regular o mal estado");

        jLabel2.setText("Tipo de abasto");

        infoButton.setText("Mostrar");
        infoButton.addActionListener(evt -> InfoButtonActionPerformed());

        jList1.setModel( modelo
        );
        jScrollPane1.setViewportView(jList1);

        abasto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gravedad", "Bombeo", "Camion cisterna", "Tuberias" }));
        abasto.addActionListener(evt -> abastoActionPerformed());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(abasto, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(infoButton)
                                                .addGap(0, 493, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(197, 197, 197)
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(infoButton)
                                        .addComponent(abasto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
    }

    private void InfoButtonActionPerformed() {

        String tipoAbasto=(String) abasto.getSelectedItem();
        modelo.clear();
        ArrayList<String> infoDepositos=red.infoDepositos(tipoAbasto);
        for (String infoDeposito : infoDepositos) {
            modelo.addElement(infoDeposito);
            jList1.revalidate();
        }
    }

    private void abastoActionPerformed() {

    }

    private javax.swing.JComboBox<String> abasto;
    private javax.swing.JList<String> jList1;

}