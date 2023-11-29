package app;

public class BombasDeAgua extends Motores {
    private final int tiempoBombeo;

    public BombasDeAgua(String id, String estado, double regimen, int tiempoBombeo) {
        super(id, estado, regimen);
        this.tiempoBombeo = tiempoBombeo;
    }

    public int getTiempoBombeo() {
        return tiempoBombeo;
    }
}
