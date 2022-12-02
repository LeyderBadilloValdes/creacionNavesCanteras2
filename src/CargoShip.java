/**
 * Se importa la libreria ArrayList.
 */
import java.util.ArrayList;

/**
 * Representa la clase CargoShip que extiende de la clase Ship.
 */
public class CargoShip extends Ship {
    public static ArrayList<CargoShip> list = new ArrayList<>();
    public int capacity;
    public String solarPanel;

    /**
     *
     * @param name heredado de la clase Ship.
     * @param weight heredado de la clase Ship.
     * @param power heredado de la clase Ship.
     * @param typeFuel heredado de la clase Ship.
     * @param motors heredado de la clase Ship.
     * @param shuttleVehicle heredado de la clase Ship.
     * @param capacity de la clase CargoShip.
     * @param solarPanel de la clase CargoShip.
     */
    public CargoShip(String name, int weight, int power, String typeFuel, int motors, int shuttleVehicle, int capacity, String solarPanel) {
        super(name, weight, power, typeFuel, motors, shuttleVehicle);
        this.capacity = capacity;
        this.solarPanel = solarPanel;
    }


    /**
     * Retorna un valor de tipo int.
     * @return capacity de la clase CargoShip.
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Asigna un valor de tipo int.
     * @param capacity a ingresar
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Retorna un valor de tipo String.
     * @return solarPanel de la clase CargoShip.
     */
    public String getSolarPanel() {
        return solarPanel;
    }

    /**
     * Asigna un valor de tipo String.
     * @param solarPanel a ingresar.
     */
    public void setSolarPanel(String solarPanel) {
        this.solarPanel = solarPanel;
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

    public static CargoShip createCargoShip(String name, int weight, int power, String typeFuel, int motors, int shuttleVehicle, int capacity, String solarPanel){
        CargoShip cargoShip = new CargoShip(name, weight, power, typeFuel, motors, shuttleVehicle, capacity,  solarPanel);
        list.add(cargoShip);

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
            System.out.println("Capacidad: " + list.get(i).getCapacity());
            System.out.println("Panel solar: " + list.get(i).getSolarPanel());
        }

        return cargoShip;
    }
}
