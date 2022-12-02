/**
 * Se importa la libreria ArrayList.
 */
import java.util.ArrayList;

/**
 * Representa la clase MaintenanceShip que extiende de la clase Ship.
 */
public class MaintenanceShip extends Ship {
    public static ArrayList<MaintenanceShip> list = new ArrayList<>();
    public int numRoboticArms;
    public String typesensors;

    /**
     * @param name heredado de la clase Ship.
     * @param weight heredado de la clase Ship.
     * @param power heredado de la clase Ship.
     * @param typeFuel heredado de la clase Ship.
     * @param motors heredado de la clase Ship.
     * @param shuttleVehicle heredado de la clase Ship.
     * @param numRoboticArms de la clase MaintenanceShip.
     * @param typesensors de la clase MaintenanceShip.
     */
    public MaintenanceShip(String name, int weight, int power, String typeFuel, int motors, int shuttleVehicle, int numRoboticArms, String typesensors) {
        super(name, weight, power, typeFuel, motors, shuttleVehicle);
        this.numRoboticArms = numRoboticArms;
        this.typesensors = typesensors;
    }

    /**
     * Retorna un valor de tipo int.
     * @return numRoboticArms de la clase MaintenanceShip
     */
    public int getNumRoboticArms() {
        return numRoboticArms;
    }

    /**
     * Asigna un valor de tipo int.
     * @param numRoboticArms a ingresar
     */
    public void setNumRoboticArms(int numRoboticArms) {
        this.numRoboticArms = numRoboticArms;
    }

    /**
     * Retorna un valor de tipo String.
     * @return typesensors de la clase MaintenanceShip
     */
    public String getTypeSensors() {
        return typesensors;
    }

    /**
     * Asigna un valor de tipo String.
     * @param typesensors a ingresar
     */
    public void setTypeSensors(String typesensors) {
        this.typesensors = typesensors;
    }

    /**
     * Sobreescritura de metodos.
     */
    @Override
    public void move() {
    }

    @Override
    public int propel() {
        return 0;
    }

    public static MaintenanceShip createMaintenanceShip(String name, int weight, int power, String typeFuel, int motors, int shuttleVehicle, int numRoboticArms, String typesensors){
        MaintenanceShip maintenanceShip = new MaintenanceShip(name, weight, power, typeFuel, motors, shuttleVehicle, numRoboticArms,  typesensors);
        list.add(maintenanceShip);

        /**
         * Representa un arreglo que después retorna una informacion al usuario.
         */
        for (int i=0; i< list.size(); i++){
            System.out.println("Nombre: " + list.get(i).getName());
            System.out.println("Peso: " + list.get(i).getWeight());
            System.out.println("Potencia: " + list.get(i).getPower());
            System.out.println("Combustible: " + list.get(i).getTypeFuel());
            System.out.println("Motores: " + list.get(i).getMotors());
            System.out.println("Vehiculos de lanzadera: " + list.get(i).getShuttleVehicle());
            System.out.println("Brazos roboticos: " + list.get(i).getNumRoboticArms());
            System.out.println("Sensor: " + list.get(i).getTypeSensors());
        }

        return maintenanceShip;
    }
}
