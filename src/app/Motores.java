package app;

import java.io.Serializable;

public class Motores implements Serializable {
    protected final String id;
    protected final String estado;
    protected final double regimen;

    public Motores(String id, String estado, double regimen) {
        this.id=id;
        this.estado = estado;
        this.regimen = regimen;
    }

    public String getId() {
        return id;
    }

    public double getRegimen() {
        return regimen;
    }

    public String getEstado() {
        return estado;
    }
}
