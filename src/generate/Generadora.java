package generate;

import app.BombasDeAgua;
import app.Cisternas;
import app.Compuestas;
import app.Depositos;
import app.Motores;
import app.Simples;
import app.Tanques;
import app.Turbinas;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author A-GORE
 */
public class Generadora {
    private final ArrayList<Motores> motores;
    private final ArrayList<Depositos> depositos;

    public Generadora() {
        this.motores =new ArrayList<>();
        this.depositos =new ArrayList<>();
        Turbinas turbina5 = new Turbinas("M204", "Bueno", 400, 350);
        Turbinas turbina4 = new Turbinas("M203", "Regular", 550, 450);
        Turbinas turbina3 = new Turbinas("M202", "Regular", 300, 250);
        Turbinas turbina2 = new Turbinas("M201", "Bueno", 1150, 900);
        Turbinas turbina1 = new Turbinas("M200", "Malo", 700, 650);
        BombasDeAgua bomba4 = new BombasDeAgua("M103", "Malo", 550, 20);
        BombasDeAgua bomba3 = new BombasDeAgua("M102", "Bueno", 350, 36);
        BombasDeAgua bomba2 = new BombasDeAgua("M101", "Regular", 400, 54);
        BombasDeAgua bomba1 = new BombasDeAgua("M100", "Bueno", 700, 34);
        motores.addAll(Arrays.asList(bomba1, turbina1, turbina2, turbina3, bomba2, turbina4, bomba3, bomba4, turbina5));
        Tanques tanque4 = new Tanques("A203", 500, "Regular", "Tuberias", "Metal");
        Tanques tanque3 = new Tanques("A202", 750, "Malo", "Bombeo", "Plastico");
        Tanques tanque2 = new Tanques("A201", 1500, "Bueno", "Bombeo", "Fibrocemento");
        Tanques tanque1 = new Tanques("A200", 1000, "Bueno", "Gravedad", "Plastico");
        Cisternas cisterna5 = new Compuestas("A104", 1600, "Regular", "Bombeo", 2);
        Cisternas cisterna4 = new Compuestas("A103", 700, "Buena", "Tuberias", 4);
        Cisternas cisterna3 = new Simples("A102", 1200, "Malo", "Camion cisterna", "Cubica");
        Cisternas cisterna2 = new Simples("A101", 800, "Regular", "Gravedad", "Cilindrica");
        Cisternas cisterna1 = new Simples("A100", 600, "Regular", "Tuberias", "Cubica");
        depositos.addAll(Arrays.asList(cisterna1, cisterna2, tanque1, tanque2, cisterna3, tanque3, tanque4, cisterna4, cisterna5));
    }

    public ArrayList<Motores> getMotores() {
        return motores;
    }

    public ArrayList<Depositos> getDepositos() {
        return depositos;
    }

}