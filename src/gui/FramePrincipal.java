package gui;

import app.*;
import generate.Generadora;
import model.ModeloTablaCisternas;
import model.ModeloTablaTanques;
import serializable.SerialMotores;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

public class FramePrincipal extends javax.swing.JFrame {

    private final SerialMotores serialM;
    private final ArrayList<Motores> motores;
    private final RedHidraulica red;
    private final ModeloTablaCisternas modeloCisternas;
    private final ModeloTablaTanques modeloTanques;

    public FramePrincipal() {
        serialM= new SerialMotores();
        motores=this.iniciarMotores();
        red = new RedHidraulica(motores);
        modeloCisternas= new ModeloTablaCisternas(red.getCisternas());
        modeloTanques= new ModeloTablaTanques(red.getTanques());

        initComponents();
    }

    public ArrayList<Motores> iniciarMotores(){
        ArrayList<Motores> motores1;
        try {
            motores1 = serialM.cargar();
        } catch (Exception e) {
            Generadora genera = new Generadora();
            motores1 = genera.getMotores();
        }
        return motores1;
    }

    public RedHidraulica getRed() {
        return red;
    }

    public void agregarMotores(Motores mot) {
        motores.add(mot);
        serialM.guardar(motores);
    }

    public ArrayList<Motores> getMotores() {
        return motores;
    }

    private void initComponents() {

        JMenuItem jMenuItem2 = new JMenuItem();
        JLabel jLabel1 = new JLabel();
        JScrollPane jScrollPane1 = new JScrollPane();
        JTable tablaCisternas = new JTable();
        JLabel jLabel2 = new JLabel();
        JScrollPane jScrollPane2 = new JScrollPane();
        JTable tablaTanques = new JTable();
        JPanel jPanel1 = new JPanel();
        JLabel jLabel10 = new JLabel();
        JLabel jLabel4 = new JLabel();
        JLabel jLabel3 = new JLabel();
        JLabel jLabel5 = new JLabel();
        JLabel jLabel6 = new JLabel();
        JLabel jLabel7 = new JLabel();
        botonDepositos = new javax.swing.JToggleButton();
        JLabel jLabel8 = new JLabel();
        botonTipoCisternas = new javax.swing.JToggleButton();
        JLabel jLabel9 = new JLabel();
        id = new javax.swing.JTextField();
        estado = new javax.swing.JComboBox<>();
        tipoAbasto = new javax.swing.JComboBox<>();
        forma = new javax.swing.JComboBox<>();
        compartimentos = new javax.swing.JSpinner(new SpinnerNumberModel(1, 0, 20, 1));
        material = new javax.swing.JComboBox<>();
        capacidad = new javax.swing.JSpinner(new SpinnerNumberModel(100, 100, 2000, 50));
        JButton agnadir = new JButton();
        JSeparator jSeparator1 = new JSeparator();
        JMenuBar jMenuBar1 = new JMenuBar();
        JMenu jMenu1 = new JMenu();
        JMenuItem jMenuItem1 = new JMenuItem();
        JMenuItem jMenuItem3 = new JMenuItem();
        JMenuItem jMenuItem4 = new JMenuItem();
        JMenuItem jMenuItem5 = new JMenuItem();
        JMenuItem jMenuItem6 = new JMenuItem();
        JMenuItem jMenuItem7 = new JMenuItem();
        JMenuItem jMenuItem8 = new JMenuItem();
        JMenu jMenu3 = new JMenu();
        JMenuItem jMenuItem9 = new JMenuItem();
        JMenu jMenu2 = new JMenu();
        JMenuItem jMenuItem10 = new JMenuItem();

        jMenuItem2.setText("jMenuItem2");
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        try {
            ImageIcon image=new ImageIcon(Objects.requireNonNull(getClass().getResource("/resources/blood.png")));
            setIconImage(image.getImage());
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "No se encuentra el icono");
        }

        setTitle("Red Hidraulica");
        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Arial", Font.PLAIN, 10));
        setForeground(java.awt.Color.black);

        jLabel1.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 18));
        jLabel1.setText("Cisternas");

        tablaCisternas.setModel(modeloCisternas);
        jScrollPane1.setViewportView(tablaCisternas);

        jLabel2.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 18));
        jLabel2.setText("Tanques");

        tablaTanques.setModel(modeloTanques);
        jScrollPane2.setViewportView(tablaTanques);

        jLabel10.setText("Material");

        jLabel4.setText("ID");

        jLabel3.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 18));
        jLabel3.setText("Agregar Depositos");

        jLabel5.setText("Capacidad");

        jLabel6.setText("Estado");

        jLabel7.setText("Tipo de abasto");

        botonDepositos.setText("Cisternas");
        botonDepositos.addActionListener(evt -> botonDepositosActionPerformed());

        jLabel8.setText("Forma");

        botonTipoCisternas.setText("Simples");
        botonTipoCisternas.addActionListener(evt -> botonTipoCisternasActionPerformed());

        jLabel9.setText("Cantidad de compartimentos");

        estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bueno", "Regular", "Malo" }));

        tipoAbasto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gravedad", "Bombeo", "Camion cisterna", "Tuberias" }));

        forma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cilindrica", "Cubica"}));

        compartimentos.setEnabled(false);

        material.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fibrocemento", "Metal", "Plastico" }));
        material.setEnabled(false);

        agnadir.setText("Añadir");
        agnadir.addActionListener(evt -> agnadirActionPerformed());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel8)
                                                                        .addComponent(jLabel9)
                                                                        .addComponent(jLabel7)
                                                                        .addComponent(jLabel6)
                                                                        .addComponent(jLabel5)
                                                                        .addComponent(jLabel4)
                                                                        .addComponent(jLabel10)
                                                                        .addComponent(botonDepositos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(id)
                                                                        .addComponent(estado, 0, 127, Short.MAX_VALUE)
                                                                        .addComponent(tipoAbasto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(forma, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(compartimentos)
                                                                        .addComponent(material, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(botonTipoCisternas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(capacidad)))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(agnadir))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(72, 72, 72)
                                                .addComponent(jLabel3)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(botonDepositos)
                                        .addComponent(botonTipoCisternas))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(capacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(tipoAbasto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(forma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(compartimentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10)
                                        .addComponent(material, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(agnadir)
                                .addContainerGap())
        );

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jMenu1.setText("Acciones");

        jMenuItem1.setText("1. Informacion de depositos en regular y mal estado");
        jMenuItem1.addActionListener(evt -> jMenuItem1ActionPerformed());
        jMenu1.add(jMenuItem1);

        jMenuItem3.setText("2. Capacidad de depositos ordenados");
        jMenuItem3.addActionListener(evt -> jMenuItem3ActionPerformed());
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("3. Cantidad de depositos y motores");
        jMenuItem4.addActionListener(evt -> jMenuItem4ActionPerformed());
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("4. Motores con mejor regimen de bombeo");
        jMenuItem5.addActionListener(evt -> jMenuItem5ActionPerformed());
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText("5. Tiempo promedio de bombas en buen estado");
        jMenuItem6.addActionListener(evt -> jMenuItem6ActionPerformed());
        jMenu1.add(jMenuItem6);

        jMenuItem7.setText("6. Estado de las turbinas de mayor fuerza");
        jMenuItem7.addActionListener(evt -> jMenuItem7ActionPerformed());
        jMenu1.add(jMenuItem7);

        jMenuItem8.setText("7. Capacidad total de las cisternas");
        jMenuItem8.addActionListener(evt -> jMenuItem8ActionPerformed());
        jMenu1.add(jMenuItem8);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Motores");

        jMenuItem9.setText("Motores");
        jMenuItem9.addActionListener(evt -> jMenuItem9ActionPerformed());
        jMenu3.add(jMenuItem9);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Info");

        jMenuItem10.setText("Guia");
        jMenuItem10.addActionListener(evt -> jMenuItem10ActionPerformed());
        jMenu2.add(jMenuItem10);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(376, 376, 376)
                                                .addComponent(jLabel2))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 823, Short.MAX_VALUE)
                                                        .addComponent(jScrollPane1)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(374, 374, 374)
                                                .addComponent(jLabel1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );

        pack();
    }

    private void botonDepositosActionPerformed() {
        // TODO add your handling code here:
        if(botonDepositos.isSelected()){
            botonDepositos.setText("Tanques");
            botonTipoCisternas.setEnabled(false);
            forma.setEnabled(false);
            compartimentos.setEnabled(false);
            material.setEnabled(true);
        }else{
            botonDepositos.setText("Cisternas");
            botonTipoCisternas.setEnabled(true);
            if(botonTipoCisternas.isSelected()){
                compartimentos.setEnabled(true);
                forma.setEnabled(false);
            }else{
                forma.setEnabled(true);
                compartimentos.setEnabled(false);
            }
            material.setEnabled(false);
        }
    }

    private void botonTipoCisternasActionPerformed() {
        if(botonTipoCisternas.isSelected()){
            botonTipoCisternas.setText("Compuestas");
            compartimentos.setEnabled(true);
            forma.setEnabled(false);
        }else{
            botonTipoCisternas.setText("Simples");
            forma.setEnabled(true);
            compartimentos.setEnabled(false);
        }
    }

    private void agnadirActionPerformed() {
        int ccapacidad=(int) capacidad.getValue();
        String cestado=(String)estado.getSelectedItem();
        String ctipoAbasto=(String) tipoAbasto.getSelectedItem();

        if(!id.getText().isBlank()) {
            String cid=id.getText();
            boolean esLetra=Character.isLetter(cid.charAt(0));
            if (esLetra) {
                if (!botonDepositos.isSelected()) {
                    if (botonTipoCisternas.isEnabled() && !botonTipoCisternas.isSelected()) {
                        String cforma=(String) forma.getSelectedItem();
                        red.agregarDeposito(new Simples(cid, ccapacidad, cestado, ctipoAbasto, cforma));
                        JOptionPane.showMessageDialog(this, "Cisterna simple agregada con exito");
                        modeloCisternas.updateData(red.getCisternas());

                    } else if(botonTipoCisternas.isEnabled() && botonTipoCisternas.isSelected()){
                        int ccompartimentos=(int) compartimentos.getValue();
                        red.agregarDeposito(new Compuestas(cid, ccapacidad, cestado, ctipoAbasto, ccompartimentos));
                        JOptionPane.showMessageDialog(this, "Cisterna compuesta agregada con exito");
                        modeloCisternas.updateData(red.getCisternas());
                    }
                } else {
                    String cmaterial=(String) material.getSelectedItem();
                    red.agregarDeposito(new Tanques(cid, ccapacidad, cestado, ctipoAbasto, cmaterial));
                    JOptionPane.showMessageDialog(this, "Tanque agregado con exito");
                    modeloTanques.updateData(red.getTanques());
                }
            }else{
                JOptionPane.showMessageDialog(this, "Ha introducido un ID invalido, pruebe empezar con una letra");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Ha dejado un campo vacio");
        }
        id.setText("");
    }

    private void jMenuItem1ActionPerformed() {
        FrameDepositosEstado info = new FrameDepositosEstado();
        info.setVisible(true);
    }

    private void jMenuItem3ActionPerformed() {
        FrameCapacidadOrdenada orden = new FrameCapacidadOrdenada();
        orden.setVisible(true);
    }

    private void jMenuItem4ActionPerformed() {
        String[] aux = red.cantidadMedios();
        JOptionPane.showMessageDialog(this, aux);
    }

    private void jMenuItem6ActionPerformed() {
        JOptionPane.showMessageDialog(this,
                "El tiempo promedio de bombeo de las bombas de agua que estan en buen estado es de "
                        + red.tiempoPromedio() + " minutos");
    }

    private void jMenuItem8ActionPerformed() {
        FrameGuardarCapacidadCisternas frame = new FrameGuardarCapacidadCisternas();
        frame.setVisible(true);
    }

    private void jMenuItem5ActionPerformed() {
        FrameMejorRegimenBombeo frame = new FrameMejorRegimenBombeo();
        frame.setVisible(true);
    }

    private void jMenuItem7ActionPerformed() {
        FrameMayorFuerza frame = new FrameMayorFuerza();
        frame.setVisible(true);
    }

    private void jMenuItem9ActionPerformed() {
        FrameMotores frame = new FrameMotores();
        frame.setVisible(true);
    }

    private void jMenuItem10ActionPerformed() {

        FrameGuia guia = new FrameGuia();
        guia.setVisible(true);

    }

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(new com.formdev.flatlaf.themes.FlatMacDarkLaf());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se encuentra el tema");
        }
        FramePrincipal frame=new FramePrincipal();
        frame.setVisible(true);
    }

    private javax.swing.JToggleButton botonDepositos;
    private javax.swing.JToggleButton botonTipoCisternas;
    private javax.swing.JSpinner capacidad;
    private javax.swing.JSpinner compartimentos;
    private javax.swing.JComboBox<String> estado;
    private javax.swing.JComboBox<String> forma;
    private javax.swing.JTextField id;
    private javax.swing.JComboBox<String> material;
    private javax.swing.JComboBox<String> tipoAbasto;
}