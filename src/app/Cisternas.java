package app;

public abstract class Cisternas extends Depositos {

    public Cisternas(String id, int capacidad, String estado, String tipoAbasto) {
        super(id, capacidad, estado, tipoAbasto);
    }

    public abstract String clasificacion();
}
