/**
 * Se importa la libreria ArrayList.
 */
import java.util.ArrayList;

/**
 * Representa la clase MannedShip que extiende de Ship e implementa de Iship.
 */
public class MannedShip extends Ship implements IShip {
    public static ArrayList<MannedShip> list = new ArrayList<>();
    public int numberPassengers;
    public String category;

    /**
     * @param name heredado de la clase Ship.
     * @param weight heredado de la clase Ship.
     * @param power heredado de la clase Ship.
     * @param typeFuel heredado de la clase Ship.
     * @param motors heredado de la clase Ship.
     * @param shuttleVehicle heredado de la clase Ship.
     * @param numberPassengers de la clase MannedShip.
     * @param category de la clase MannedShip.
     */
    public MannedShip(String name, int weight, int power, String typeFuel, int motors, int shuttleVehicle, int numberPassengers, String category) {
        super(name, weight, power, typeFuel, motors, shuttleVehicle);
        this.numberPassengers = numberPassengers;
        this.category = category;
    }

    /**
     * Retorna un valor de tipo int.
     * @return numberPassengers de la clase MannedShip.
     */
    public int getNumberPassengers() {
        return numberPassengers;
    }

    /**
     * Asigna un valor de tipo int.
     * @param numberPassengers a ingresar
     */
    public void setNumberPassengers(int numberPassengers) {
        this.numberPassengers = numberPassengers;
    }

    /**
     * Retorna un valor de tipo String.
     * @return category de la clase MannedShip.
     */
    public String getCategory() {
        return category;
    }

    /**
     * Asigna un valor de tipo String.
     * @param category a ingresar
     */
    public void setCategory(String category) {
        this.category = category;
    }


    public boolean quota(int numberPassengers){
        if(numberPassengers <= 50){
            return true;
        }
        return false;
    }

    @Override
    public void move() {

    }

    @Override
    public int propel() {
        return 0;
    }

    /**
     * Representa un caso impootetico para calcular la velocidad de la sonda
     * @return velocity
     */
    @Override
    public float calculateVelocity() {
        float velocity = (float) (motors * weight * 9.8);
        return velocity;
    }

    public static MannedShip createMannedShip(String name, int weight, int power, String typeFuel, int motors, int shuttleVehicle, int numberPassengers, String category){
        MannedShip mannedShip = new MannedShip(name, weight, power, typeFuel, motors, shuttleVehicle, numberPassengers,  category);
        list.add(mannedShip);

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
            System.out.println("Pasajeros: " + list.get(i).getNumberPassengers());
            System.out.println("Categoria: " + list.get(i).getCategory());
        }

        return mannedShip;
    }
}
