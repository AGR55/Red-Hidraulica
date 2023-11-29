package app;

public class Compuestas extends Cisternas {
    private final int cantidadCompartimentos;

    public Compuestas(String id, int capacidad, String estado, String tipoAbasto, int cantidadCompartimentos) {
        super(id, capacidad, estado, tipoAbasto);
        this.cantidadCompartimentos = cantidadCompartimentos;
    }

    public int getCantidadCompartimentos() {
        return cantidadCompartimentos;
    }

    @Override
    public String clasificacion() {
        return "Compuesta";
    }
}
