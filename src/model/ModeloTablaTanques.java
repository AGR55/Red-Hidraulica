package model;

import app.Tanques;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ModeloTablaTanques extends AbstractTableModel {
    private final ArrayList<Tanques> tanques;
    private final String[] titulos={"ID", "Capacidad", "Estado", "Tipo de abasto", "Material"};

    public ModeloTablaTanques(ArrayList<Tanques> tanques) {
        this.tanques = tanques;
    }

    @Override
    public int getRowCount() {
        return tanques.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Tanques tanque=tanques.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> tanque.getId();
            case 1 -> tanque.getCapacidad();
            case 2 -> tanque.getEstado();
            case 3 -> tanque.getTipoAbasto();
            case 4 -> tanque.getMaterial();
            default -> null;
        };
    }

    public void updateData(ArrayList<Tanques> tan){
        this.tanques.clear();
        this.tanques.addAll(tan);
        this.fireTableDataChanged();
    }

    public String getColumnName(int colums){
        return titulos[colums];
    }
}