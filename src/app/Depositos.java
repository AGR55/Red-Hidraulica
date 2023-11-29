package app;

import java.io.Serializable;

public abstract class Depositos implements Serializable{
    protected final String id;
    protected final int capacidad;
    protected final String estado;
    protected final String tipoAbasto;

    public Depositos(String id, int capacidad, String estado, String tipoAbasto) {
        this.id=id;
        this.capacidad = capacidad;
        this.estado = estado;
        this.tipoAbasto = tipoAbasto;
    }

    public String getId() {
        return id;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getEstado() {
        return estado;
    }

    public String getTipoAbasto() {
        return tipoAbasto;
    }
}
