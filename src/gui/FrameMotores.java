package gui;

import app.BombasDeAgua;
import app.Motores;
import app.Turbinas;
import model.ModeloTablaMotores;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author A-GORE
 */
public class FrameMotores extends javax.swing.JFrame {
    private final FramePrincipal frame;
    private final ModeloTablaMotores modelo;

    public FrameMotores() {
        frame = new FramePrincipal();
        ArrayList<Motores> motores = frame.getMotores();
        modelo = new ModeloTablaMotores(motores);
        initComponents();
    }

    private void initComponents() {

        JLabel jLabel1 = new JLabel();
        JScrollPane jScrollPane1 = new JScrollPane();
        JTable tabla = new JTable();
        JSeparator jSeparator1 = new JSeparator();
        JPanel jPanel1 = new JPanel();
        JLabel jLabel7 = new JLabel();
        boton = new javax.swing.JToggleButton();
        JLabel jLabel2 = new JLabel();
        JLabel jLabel3 = new JLabel();
        JLabel jLabel4 = new JLabel();
        id = new javax.swing.JTextField();
        estado = new javax.swing.JComboBox<>();
        JLabel jLabel5 = new JLabel();
        JLabel jLabel6 = new JLabel();
        JButton jButton1 = new JButton();
        fuerza = new javax.swing.JSpinner(new SpinnerNumberModel(250, 200, 1500, 50));
        regimen = new javax.swing.JSpinner(new SpinnerNumberModel(250, 200, 1500, 50));
        tiempoBombeo = new javax.swing.JSpinner(new SpinnerNumberModel(20, 20, 60, 2));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        try {
            ImageIcon image=new ImageIcon(Objects.requireNonNull(getClass().getResource("/resources/blood.png")));
            setIconImage(image.getImage());
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "No se encuentra el icono");
        }
        setTitle("Motores");

        jLabel1.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 18));
        jLabel1.setText("Motores");

        tabla.setModel(modelo);
        jScrollPane1.setViewportView(tabla);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel7.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 18));
        jLabel7.setText("Agregar Motores");

        boton.setText("Turbina");
        boton.addActionListener(evt -> botonActionPerformed());

        jLabel2.setText("ID");

        jLabel3.setText("Estado");

        jLabel4.setText("Regimen");

        estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bueno", "Malo", "Regular" }));

        jLabel5.setText("Tiempo de bombeo");

        jLabel6.setText("Fuerza");

        jButton1.setText("Añadir");
        jButton1.addActionListener(evt -> jButton1ActionPerformed());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(boton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(18, 18, 18)
                                                .addComponent(tiempoBombeo))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(68, 68, 68)
                                                .addComponent(jLabel6)
                                                .addGap(18, 18, 18)
                                                .addComponent(fuerza)))
                                .addGap(6, 6, 6))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addContainerGap())
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(estado, 0, 133, Short.MAX_VALUE)
                                        .addComponent(id)
                                        .addComponent(regimen))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(boton)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(regimen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(tiempoBombeo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(fuerza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(321, 321, 321)
                                                .addComponent(jLabel1)
                                                .addGap(354, 354, 354))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)))
                                .addContainerGap())
        );

        pack();
    }

    private void botonActionPerformed() {
        if (boton.isSelected()) {
            boton.setText("Bomba de Agua");
            tiempoBombeo.setEnabled(true);
            fuerza.setEnabled(false);
        }
        else {
            boton.setText("Turbina");
            tiempoBombeo.setEnabled(false);
            fuerza.setEnabled(true);
        }
    }

    private void jButton1ActionPerformed() {
        String cid;
        String cestado= (String) estado.getSelectedItem();
        double cregimen= (int) regimen.getValue();

        if (!id.getText().isBlank()) {
            cid = id.getText();
            boolean esLetra=Character.isLetter(cid.charAt(0));

            if (!boton.isSelected()) {
                int cfuerza= (int) fuerza.getValue();

                if(esLetra){
                    frame.agregarMotores(new Turbinas(cid, cestado, cregimen, cfuerza));
                    id.setText("");
                    JOptionPane.showMessageDialog(this, "Turbina introducida con exito");
                    modelo.fireTableDataChanged();
                }else{
                    JOptionPane.showMessageDialog(this, "Ha introducido un ID incorrecto, prueba empezar con una letra");
                }
            } else {
                int ctiempoBombeo= (int) tiempoBombeo.getValue();

                if(esLetra) {
                    frame.agregarMotores(new BombasDeAgua(cid, cestado, cregimen, ctiempoBombeo));
                    id.setText("");
                    JOptionPane.showMessageDialog(this, "Bomba de agua introducida con exito");
                    modelo.fireTableDataChanged();
                }else{
                    JOptionPane.showMessageDialog(this, "Ha introducido un ID incorrecto, prueba empezar con una letra");
                }
            }
        }else {
            JOptionPane.showMessageDialog(this, "Ha dejado un campo vacio");
        }
    }

    private javax.swing.JToggleButton boton;
    private javax.swing.JComboBox<String> estado;
    private javax.swing.JSpinner fuerza;
    private javax.swing.JTextField id;
    private javax.swing.JSpinner regimen;
    private javax.swing.JSpinner tiempoBombeo;
}