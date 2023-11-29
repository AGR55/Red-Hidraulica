package app;

public class Turbinas extends Motores {
    private final int fuerza;

    public Turbinas(String id, String estado, double regimen, int fuerza) {
        super(id, estado, regimen);
        this.fuerza = fuerza;
    }

    public int getFuerza() {
        return fuerza;
    }
}
