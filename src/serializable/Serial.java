package serializable;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import app.Cisternas;
import app.Compuestas;
import app.Depositos;
import app.Simples;
import app.Tanques;

public class Serial {

    public Serial() {
    }

    public ArrayList<String> guardarDepositosRegularOMalEstado(ArrayList<Depositos> depositos) {
        ArrayList<String> info = new ArrayList<>();
        try {
            FileWriter oos = new FileWriter("verificar.dat");
            String line = "";
            for (Depositos deposito : depositos) {
                if (deposito instanceof Tanques auxTanques) {
                    line = "<<Tanque>> Capacidad: " + auxTanques.getCapacidad() + ", Estado: " + auxTanques.getEstado()
                            + ", Tipo de abasto: " + auxTanques.getTipoAbasto() + ", Material: " + auxTanques.getMaterial();
                } else if (deposito instanceof Cisternas) {
                    if (deposito instanceof Simples simplesAux) {
                        line = "<<Cisterna simple>> Capacidad: " + simplesAux.getCapacidad() + ", Estado: "
                                + simplesAux.getEstado() + ", Tipo de abasto: " + simplesAux.getTipoAbasto()
                                + ", Material: " + simplesAux.getForma();
                    } else {
                        Compuestas compuestasAux = (Compuestas) deposito;
                        line = "<<Cisterna compuesta>> Capacidad: " + compuestasAux.getCapacidad() + ", Estado: "
                                + compuestasAux.getEstado() + ", Tipo de abasto: " + compuestasAux.getTipoAbasto()
                                + ", Material: " + compuestasAux.getCantidadCompartimentos();
                    }
                }
                info.add(line);
                oos.write(line + "\n");
            }
            oos.close();
            return info;
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error");
            return null;
        }
    }

    public void conocerCapacidadTotalCisternasInfo(ArrayList<Cisternas> cisternas) {
        try {
            FileWriter oos = new FileWriter("cisternas.dat");
            String line = "";
            for (Cisternas cisterna : cisternas) {
                if (cisterna != null) {
                    line = "ID: " + cisterna.getId() + " Capacidad: " + cisterna.getCapacidad();
                }
                oos.write(line + "\n");
            }
            oos.close();
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error");
        }
    }
}