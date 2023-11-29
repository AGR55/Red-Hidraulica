package model;

import app.BombasDeAgua;
import app.Motores;
import app.Turbinas;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ModeloTablaMotores extends AbstractTableModel {
    private final ArrayList<Motores> motores;
    private final String[] titulos={"ID", "Estado", "Regimen", "Tiempo de Bombeo", "Fuerza"};

    public ModeloTablaMotores(ArrayList<Motores> motores) {
        this.motores = motores;
    }

    @Override
    public int getRowCount() {
        return motores.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Motores motor=motores.get(rowIndex);
        switch (columnIndex){
            case 0: return motor.getId();
            case 1: return motor.getEstado();
            case 2: return motor.getRegimen();
            case 3: if(motor instanceof BombasDeAgua) return ((BombasDeAgua)motor).getTiempoBombeo(); else return null;
            case 4: if(motor instanceof Turbinas) return ((Turbinas)motor).getFuerza(); else return null;
            default: return null;
        }
    }

    public String getColumnName(int colums){
        return titulos[colums];
    }
}
