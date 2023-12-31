package gui;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

/**
 *
 * @author A-GORE
 */
@SuppressWarnings("DuplicatedCode")
public class FrameGuia extends javax.swing.JFrame {

    public FrameGuia() {
        initComponents();
    }

    private void initComponents() {

        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel7 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel8 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel9 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel10 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel11 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel12 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel13 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel14 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel15 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel16 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel17 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel18 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        try {
            ImageIcon image=new ImageIcon(Objects.requireNonNull(getClass().getResource("/resources/blood.png")));
            setIconImage(image.getImage());
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "No se encuentra el icono");
        }
        setTitle("Guia");

        jLabel2.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 24));
        jLabel2.setText("Red Hidraulica");

        jLabel1.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 14));
        jLabel1.setText("Frame Principal:");

        jLabel3.setText("Es el encargado de mostrar todos los depositos existentes (cisternas y tanques) y los menus que representan las acciones que se pueden desarrolllar ");

        jLabel4.setText("a partir de los mismos. Ademas permite agregar nuevos depositos.");

        jLabel5.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 14));
        jLabel5.setText("Menu de Acciones:");

        jLabel6.setText("1. Se encarga de mostrar y guardar en un fichero externo de nombre \"verificar\" y extension .dat la informacion de las cisternas y tanques en regular");

        jLabel7.setText("o mal estado y que su tipo de abasto sea el especificado por el usuario.");

        jLabel8.setText("2. Muestra la capacidad de los tanques ordenados por material (1ro los de fibrocemento, 2do los de metal, 3ro los de plástico)  y la capacidad de las");

        jLabel9.setText("cisternas ordenadas por su clasificación (1ro las simples y después las compuestas).");

        jLabel10.setText("3. Permite conocer la cantidad de bombas, turbinas, cisternas y tanques disponibles.");

        jLabel11.setText("4. Muestra de las bombas y turbinas la(s) que tiene el mejor régimen de bombeo.");

        jLabel12.setText("5. Permite conocer el tiempo promedio de bombeo de las bombas que están en buen estado. ");

        jLabel13.setText("6. Da a conocer el estado de la(s) turbina de mayor fuerza.");

        jLabel14.setText("7. Determina las cisternas que tengan la cantidad de compartimentos y/o forma especificada por el usuario y guarda su capacidad en un fichero de");

        jLabel15.setText("texto llamado \"cisternas\" con extension .dat.");

        jLabel16.setFont(new java.awt.Font("Rockwell", Font.BOLD | Font.ITALIC, 12));
        jLabel16.setText("Creado por AGR55");

        jLabel18.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 14));
        jLabel18.setText("Menu de Motores:");

        jLabel19.setText("Muestra los motores (bombas de agua, turbinas) de la red hidraulica y permite agregar mas de estos.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel3))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel4))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel5))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel6))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel7))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel8))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel9))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel10))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel11))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel12))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel13))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel15))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel16)
                                                        .addComponent(jLabel14)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(305, 305, 305)
                                                .addComponent(jLabel2))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel18))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel19)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                .addComponent(jLabel16)
                                .addContainerGap())
        );

        pack();
    }
}