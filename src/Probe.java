/**
 * Se importa la libreria ArrayList.
 */
import java.util.ArrayList;

  /**
   * Representa la clase Probe que se implementa de la interfaz Iship.
   */
public class Probe extends Ship implements IShip{
    public static ArrayList<Probe> list = new ArrayList<>();
    public int orbitTime;
    public String explore;

      /**
       * Representa el constructor de la clase probe.
       * @param name heredado de la clase Ship.
       * @param weight heredado de la clase Ship.
       * @param power heredado de la clase Ship.
       * @param typeFuel heredado de la clase Ship.
       * @param motors heredado de la clase Ship.
       * @param shuttleVehicle heredado de la clase Ship.
       * @param orbitTime de la clase Probe.
       * @param explore de la clase Probe.
       */
    public Probe(String name, int weight, int power, String typeFuel, int motors, int shuttleVehicle, int orbitTime, String explore) {
        super(name, weight, power, typeFuel, motors, shuttleVehicle);
        this.orbitTime = orbitTime;
        this.explore = explore;
    }

      /**
       * Retorna un valor de tipo int.
       * @return orbiTime de la clase Probe
       */
    public int getOrbitTime() {
        return orbitTime;
    }

      /**
       * Asigna un valor de tipo int.
       * @param orbitTime a ingresar
       */
    public void setOrbitTime(int orbitTime) {
        this.orbitTime = orbitTime;
    }

      /**
       * Retorna un valor de tipo String.
       * @return explore de la clase Probe
       */
    public String getExplore() {
        return explore;
    }

      /**
       * Asigna un valor de tipo String.
       * @param explore a ingresar
       */
    public void setExplore(String explore) {
        this.explore = explore;
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

    @Override
    public float calculateVelocity() {
        float velocity = (float) (weight*9.8);
        return velocity;
    }

    public static Probe createProbe(String name, int weight, int power, String typeFuel, int motors, int shuttleVehicle, int orbitTime, String explore){
        Probe probe = new Probe(name, weight, power, typeFuel, motors, shuttleVehicle, orbitTime,  explore);
        list.add(probe);

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
            System.out.println("Tiempo en orbita: " + list.get(i).getOrbitTime());
            System.out.println("Exploracion: " + list.get(i).getExplore());
        }

        return probe;
    }
}
