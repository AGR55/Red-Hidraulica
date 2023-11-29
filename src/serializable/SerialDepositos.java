package serializable;

import app.Depositos;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class SerialDepositos {

    public SerialDepositos() {
    }

    public void guardar(ArrayList<Depositos> dep){
        try {
            ObjectOutputStream guardar=new ObjectOutputStream(new FileOutputStream("Depositos.dat"));
            guardar.writeObject(dep);
            guardar.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al guardar");
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Depositos> cargar(){
        ArrayList<Depositos> dep;
        try {
            ObjectInputStream cargar=new ObjectInputStream(new FileInputStream("Depositos.dat"));
            //noinspection unchecked
            dep=(ArrayList<Depositos>)cargar.readObject();
            cargar.close();
            return dep;
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}