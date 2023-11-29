package app;

public class Simples extends Cisternas {
    private final String forma;

    public Simples(String id, int capacidad, String estado, String tipoAbasto, String forma) {
        super(id, capacidad, estado, tipoAbasto);
        this.forma = forma;
    }

    public String getForma() {
        return forma;
    }

    @Override
    public String clasificacion() {
        return "Simple";
    }
}
