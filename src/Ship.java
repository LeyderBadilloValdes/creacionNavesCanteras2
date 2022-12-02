/**
 * Representa una clase abstracta.
 */
public abstract class Ship {
    public String name;
    public int weight;
    public int power;
    public String typeFuel;
    public int motors;
    public int shuttleVehicle;


    /**
     *  Representa el constructor de la clase Ship.
     * @param name de la clase Ship.
     * @param weight de la clase Ship.
     * @param power de la clase Ship.
     * @param typeFuel de la clase Ship.
     * @param motors de la clase Ship.
     * @param shuttleVehicle de la clase Ship.
     */
    public Ship(String name, int weight, int power, String typeFuel, int motors, int shuttleVehicle) {
        this.name = name;
        this.weight = weight;
        this.power = power;
        this.typeFuel = typeFuel;
        this.motors = motors;
        this.shuttleVehicle = shuttleVehicle;
    }

    /**
     * Representa un metodo que retorna un valor de tipo String.
     * @return name de la Ship
     */
    public String getName() {
        return name;
    }

    /**
     * Asigna un valor de tipo String.
     * @param name a ingresar
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retorna un valor de tipo int.
     * @return weight de la Ship
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Asigna un valor de tipo int.
     * @param weight a ingresar
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * Retorna un valor de tipo int.
     * @return power de la Ship
     */
    public int getPower() {
        return power;
    }

    /**
     * Asigna un valor de tipo int.
     * @param power a ingresar
     */
    public void setPower(int power) {
        this.power = power;
    }

    /**
     * Retorna un valor de tipo String.
     * @return typeFuel de la Ship
     */
    public String getTypeFuel() {
        return typeFuel;
    }

    /**
     * Asigna un valor de tipo String.
     * @param typeFuel a ingresar
     */
    public void setTypeFuel(String typeFuel) {
        this.typeFuel = typeFuel;
    }

    /**
     * Retorna un valor de tipo int.
     * @return motor de la Ship
     */
    public int getMotors() {
        return motors;
    }

    /**
     * Asigna un valor de tipo int.
     * @param motors a ingresar
     */
    public void setMotors(int motors) {
        this.motors = motors;
    }

    /**
     * Retorna un valor de tipo int.
     * @return shuttleVehicle de la Ship
     */
    public int getShuttleVehicle() {
        return shuttleVehicle;
    }

    /**
     * Asigna un valor de tipo int.
     * @param shuttleVehicle a ingresar
     */
    public void setShuttleVehicle(int shuttleVehicle) {
        this.shuttleVehicle = shuttleVehicle;
    }

    public abstract void move();
    public abstract int propel();

}
