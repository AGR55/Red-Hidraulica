package gui;

import app.RedHidraulica;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Objects;
import javax.swing.*;

/**
 *
 * @author A-GORE
 */
public class FrameGuardarCapacidadCisternas extends javax.swing.JFrame {
    private final FramePrincipal frame = new FramePrincipal();
    private final RedHidraulica red = frame.getRed();

    public FrameGuardarCapacidadCisternas() {
        initComponents();
    }

    private void initComponents() {

        JLabel f1 = new JLabel();
        JLabel f2 = new JLabel();
        forma = new javax.swing.JComboBox<>();
        JButton jButton1 = new JButton();
        JLabel jLabel1 = new JLabel();
        compartimentos = new javax.swing.JSpinner(new SpinnerNumberModel(1, 0, 20, 1));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        try {
            ImageIcon image=new ImageIcon(Objects.requireNonNull(getClass().getResource("/resources/blood.png")));
            setIconImage(image.getImage());
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "No se encuentra el icono");
        }
        setTitle("Guardar capacidad");

        f1.setText("Forma");

        f2.setText("Cantidad de compartimentos");

        forma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cubica", "Cilindrica"}));

        jButton1.setText("Guardar");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jLabel1.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 18));
        jLabel1.setText("Guardar capacidad de las cisternas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(f2)
                                                        .addComponent(f1))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(forma, 0, 128, Short.MAX_VALUE)
                                                        .addComponent(compartimentos))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jLabel1)
                                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(11, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(f1)
                                        .addComponent(forma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(f2)
                                        .addComponent(compartimentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addComponent(jButton1)
                                .addContainerGap())
        );

        pack();
    }

    private void jButton1ActionPerformed(ActionEvent actionEvent) {
        int ccompartimentos=(int) compartimentos.getValue();
        String cforma=(String) forma.getSelectedItem();

        red.guardarCapacidadCisternas(ccompartimentos, cforma);
        JOptionPane.showMessageDialog(this, "Guardado con exito");
        dispose();
    }

    private javax.swing.JSpinner compartimentos;
    private javax.swing.JComboBox<String> forma;
}