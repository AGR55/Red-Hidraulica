package app;

import generate.Generadora;
import java.util.ArrayList;
import serializable.Serial;
import serializable.SerialDepositos;

/**
 * Clase controladora, se encarga de manejar todas las acciones que pueden realizarse
 * con los depositos y motores.
 * */
public class RedHidraulica {
    private final SerialDepositos serial=new SerialDepositos();
    private final ArrayList<Depositos> depositos;
    private final ArrayList<Motores> motores;


    /**
     * Cosntructor de la clase.
     * @param motores recibe por parametro los motores que usara en todo su cuerpo.
     * */
    public RedHidraulica(ArrayList<Motores> motores) {
        depositos = this.iniciarDepositos();
        this.motores = motores;
    }

    /**
     * Carga los depositos desde un archivo externo utilizando el metodo
     * cargar de la clase SerialDepositos, si este archivo no existe, entonces inicia los
     * depositos desde el metodo getDepositos de la clase Generadora.
     * @return Lista de depositos.
     * */
    public ArrayList<Depositos> iniciarDepositos(){
        ArrayList<Depositos> depositos1;

        try{
            depositos1 = serial.cargar();
        }catch(Exception e){
            Generadora genera = new Generadora();
            depositos1 = genera.getDepositos();
        }
        return depositos1;
    }

    /**
     * Comprueba en la lista de depositos cuales son cisternas.
     * @return lista de cisternas.
     * */
    public ArrayList<Cisternas> getCisternas() {
        ArrayList<Cisternas> cisternas = new ArrayList<>();

        for (Depositos deposito : depositos) {
            if (deposito instanceof Cisternas a) {
                cisternas.add(a);
            }
        }
        return cisternas;
    }

    /**
     * Comprueba en la lista de depositos cuales son tanques.
     * @return lista de tanques.
     * */
    public ArrayList<Tanques> getTanques() {
        ArrayList<Tanques> tanques = new ArrayList<>();

        for (Depositos deposito : depositos) {
            if (deposito instanceof Tanques a) {
                tanques.add(a);
            }
        }
        return tanques;
    }

    /**
     * Comprueba en la lista de motores cuales son turbinas.
     * @return lista de turbinas.
     * */
    public ArrayList<Turbinas> getTurbinas() {
        ArrayList<Turbinas> turbinas = new ArrayList<>();

        for (Motores motore : motores) {
            if (motore instanceof Turbinas a) {
                turbinas.add(a);
            }
        }
        return turbinas;
    }

    /**
     * Comprueba en la lista de motores cuales son bombas de agua.
     * @return lista de bombas de agua.
     * */
    public ArrayList<BombasDeAgua> getBombasDeAgua() {
        ArrayList<BombasDeAgua> bombas = new ArrayList<>();

        for (Motores motore : motores) {
            if (motore instanceof BombasDeAgua a) {
                bombas.add(a);
            }
        }
        return bombas;
    }

    /**
     * Agrega el deposito entrado por parametro a la lista de depositos y guarda dicha
     * lista en un fichero externo mediante el metodo guardar de la clase SerialDepositos.
     * @param dep nuevo deposito creado externamente.
     * */
    public void agregarDeposito(Depositos dep){
        this.depositos.add(dep);
        serial.guardar(depositos);
    }

    /**
     * Obtiene la informacion de los depositos que contengan un tipo de abasto
     * establecido por el usuario y esten en regular o mal estado, la muestra y guarda en un archivo externo
     * llamado "verificar.dat" haciendo uso del metodo guardarDepositosRegularOMalEstado de la clase Serial.
     * @return lista de depositos en condiciones especificadas.
     * @param tipoAbasto (gravedad, bombeo, camion cisterna, tuberias).
     * */
    public ArrayList<String> infoDepositos(String tipoAbasto) { // Inciso a-----------------------------------------------------------------------

        ArrayList<Depositos> lista=new ArrayList<>();
        Serial serial = new Serial();

        for (Depositos deposito : depositos) {
            if ((deposito.getEstado().equals("Malo") || deposito.getEstado().equals("Regular"))
                    && deposito.getTipoAbasto().equals(tipoAbasto)) {
                lista.add(deposito);
            }
        }
        return serial.guardarDepositosRegularOMalEstado(lista);
    }

    /**
     * Ordena tanto la lista de tanques como la de cisternas. La primera basandose
     * en el material (1ro Fibrocemento, 2do Metal, 3ro Plastico) y la segunda basandose
     * en su clasificacion (1ro Simple, 2do Compuesta).
     * @return lista de String de la forma: Tanques(ID, Capacidad, Material),
     * Cisternas(ID, Capacidad, Clasificacion).
     * */
    public ArrayList<String> capacidadOrdenada() { // Inciso b-----------------------------------------------------------------------
        ArrayList<Cisternas> auxCis = getCisternas();
        ArrayList<Tanques> auxTan = getTanques();
        ArrayList<String> capacidadOrdenada = new ArrayList<>();
        int cantidadCisternas = getCisternas().size();
        int cantidadTanques = getTanques().size();
        String[] orden = { "Fibrocemento", "Metal", "Plastico" };
        String[] clas = { "Simple", "Compuesta" };

        for (String s : orden) {
            for (int j = 0; j < cantidadTanques; j++) {
                if (auxTan.get(j).getMaterial().equals(s)) {
                    capacidadOrdenada.add("ID: " + auxTan.get(j).getId() + ", Capacidad: " + auxTan.get(j).getCapacidad()+ ", Material: "+auxTan.get(j).getMaterial());
                }
            }
        }
        for (String cla : clas) {
            for (int j = 0; j < cantidadCisternas; j++) {
                if (auxCis.get(j).clasificacion().equals(cla)) {
                    capacidadOrdenada.add("ID: " + auxCis.get(j).getId() + ", Capacidad: " + auxCis.get(j).getCapacidad()+ ", Clasificacion: "+auxCis.get(j).clasificacion());
                }
            }
        }
        return capacidadOrdenada;
    }

    /**
     * Comprueba la cantidad de medios, tanto depositos como motores que hay en todo momento.
     * @return arreglo de String con la cantidad de bombas de agua, turbinas, cisternas y tanques.
     * */
    public String[] cantidadMedios() { //Inciso c-----------------------------------------------------------------------
        String[] medios = { "Bombas", "Turbinas", "Cisternas", "Tanques" };
        int[] cantidades = { getBombasDeAgua().size(), getTurbinas().size(), getCisternas().size(),
                getTanques().size() };
        String[] info = new String[medios.length];

        for (int i = 0; i < medios.length; i++) {
            info[i] = "La cantidad de " + medios[i] + " es " + cantidades[i];
        }
        return info;
    }

    /**
     * Analiza en la lista de motores cual o cuales de ellos tienen el mejor regimen.
     * En caso de que haya mas de uno con el mismo regimen y esos sean los mayores se
     * iran agregando a la lista.
     * @return lista con el o los motores de mejor regimen.
     * */
    public ArrayList<Motores> mejorRegimen(){ //Inciso d
        ArrayList<Motores> aux=new ArrayList<>();
        int indice=0;
        double mayor=0;

        for (int i = 0; i < motores.size(); i++) {
            if(motores.get(i).getRegimen()>mayor){
                mayor=motores.get(i).getRegimen();
                indice=i;
            }
        }
        aux.add(motores.get(indice));

        for (int i = 0; i < motores.size(); i++) {
            if(motores.get(i).getRegimen()==mayor && i!=indice){
                aux.add(motores.get(i));
            }
        }
        return aux;
    }

    /**
     * Analiza el tiempo promedio de las bombas de agua que se encuentran en buen estado.
     * @return tiempo promedio.
     * */
    public double tiempoPromedio() { //Inciso e-----------------------------------------------------------------------
        int tiempo = 0;
        int cantidad=0;

        for (Motores motore : motores) {
            if (motore instanceof BombasDeAgua a) {
                if (a.getEstado().equals("Bueno")) {
                    tiempo += (a.getTiempoBombeo());
                    cantidad++;
                }
            }
        }
        return (double) tiempo / cantidad;
    }

    /**
     * Recorre la lista de turbinas para buscar la de mayor fuerza, añade
     * a una lista de Strings tanto su ID como su estado y vuelve a recorrer
     * para determinar si existen mas que iguales a esta en fuerza, de ser asi
     * tambien añade a la lista la informacion de esta o estas.
     * @return lista de Strings con IDs y estados de las turbinas de mayor fuerza.
     * */
    public ArrayList<String> estadoTurbinas() { // Inciso f-----------------------------------------------------------------------
        ArrayList<String> estados = new ArrayList<>();
        ArrayList<Turbinas> turbinasAux = getTurbinas();
        int indice = 0;
        int mayor = 0;

        for (int i = 0; i < turbinasAux.size(); i++) {
            if (turbinasAux.get(i).getFuerza() > mayor) {
                mayor = turbinasAux.get(i).getFuerza();
                indice = i;
            }
        }
        estados.add("ID: "+turbinasAux.get(indice).getId()+", Estado: "+turbinasAux.get(indice).getEstado());

        for (int i = 0; i < turbinasAux.size(); i++) {
            if (turbinasAux.get(i).getFuerza() == mayor && i!=indice) {
                estados.add("ID: "+turbinasAux.get(i).getId()+", Estado: "+turbinasAux.get(i).getEstado());
            }
        }
        return estados;
    }

    /**
     * Determina segun la forma de las cisternas simples y la cantidad de compartimentos de
     * las compuestas si estas son iguales a los entrados por el usuario, si lo son guarda
     * en una lista dichas cisternas y mediante el metodo conocerCapacidadTotalCisternasInfo
     * de la clase Serial almacena esa informacion en un archivo externo llamado ¨cisternas.dat¨.
     * @param compartimentos cantidad de compartimentos de la cisterna compuesta.
     * @param forma forma que debe tener la cisterna simple (cubica, cilindrica).
     * */
    public void guardarCapacidadCisternas(int compartimentos, String forma) { // Inciso g-----------------------------------------------------------------------
        ArrayList<Cisternas> cisternasAux = getCisternas();
        ArrayList<Cisternas> lista=new ArrayList<>();
        Serial serial = new Serial();

        for (Cisternas aux : cisternasAux) {
            if (aux instanceof Simples a) {
                if (a.getForma().equals(forma)) {
                    lista.add(aux);
                }
            } else {
                if (((Compuestas) aux).getCantidadCompartimentos() == compartimentos) {
                    lista.add(aux);
                }
            }
        }
        serial.conocerCapacidadTotalCisternasInfo(lista);
    }
}
