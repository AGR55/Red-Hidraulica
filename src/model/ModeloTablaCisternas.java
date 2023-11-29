package model;

import app.Cisternas;
import app.Compuestas;
import app.Simples;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ModeloTablaCisternas extends AbstractTableModel {
    private final ArrayList<Cisternas> cisternas;
    private final String[] titulos = { "ID", "Capacidad", "Estado", "Tipo de abasto", "Forma",
            "Cantidad de compartimentos" };

    public ModeloTablaCisternas(ArrayList<Cisternas> cisternas) {
        this.cisternas = cisternas;
    }

    @Override
    public int getRowCount() {
        return cisternas.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cisternas cisterna = cisternas.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return cisterna.getId();
            case 1:
                return cisterna.getCapacidad();
            case 2:
                return cisterna.getEstado();
            case 3:
                return cisterna.getTipoAbasto();
            case 4:
                if (cisterna instanceof Simples a)
                    return a.getForma();
                else
                    return null;
            case 5:
                if (cisterna instanceof Compuestas b)
                    return b.getCantidadCompartimentos();
                else
                    return null;
            default:
                return null;
        }
    }

    public void updateData(ArrayList<Cisternas> cis){
        this.cisternas.clear();
        this.cisternas.addAll(cis);
        this.fireTableDataChanged();
    }

    public String getColumnName(int colums) {
        return titulos[colums];
    }
}