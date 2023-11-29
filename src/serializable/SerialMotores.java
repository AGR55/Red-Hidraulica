package serializable;

import app.Motores;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class SerialMotores {

    public SerialMotores() {
    }

    public void guardar(ArrayList<Motores> mot){
        try {
            ObjectOutputStream guardar=new ObjectOutputStream(new FileOutputStream("Motores.dat"));
            guardar.writeObject(mot);
            guardar.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al guardar");
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Motores> cargar(){
        ArrayList<Motores> mot;
        try {
            ObjectInputStream cargar=new ObjectInputStream(new FileInputStream("Motores.dat"));
            //noinspection unchecked
            mot=(ArrayList<Motores>)cargar.readObject();
            cargar.close();
            return mot;
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}