package app;

public class Tanques extends Depositos {
    private final String material;

    public Tanques(String id, int capacidad, String estado, String tipoAbasto, String material) {
        super(id, capacidad, estado, tipoAbasto);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}
