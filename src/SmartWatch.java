public class SmartWatch extends SmartDevice{
    protected String nombre;
    protected boolean desperator;
    protected boolean reloj;

    public SmartWatch() {

    }

    public SmartWatch(String marca, int year, String nombre, boolean desperator, boolean reloj) {
        super(marca, year);
        this.nombre = nombre;
        this.desperator = desperator;
        this.reloj = reloj;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "nombre='" + nombre + '\'' +
                ", desperator=" + desperator +
                ", reloj=" + reloj +
                '}';
    }
}
