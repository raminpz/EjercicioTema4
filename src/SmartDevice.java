public class SmartDevice {

    protected String marca;
    protected int year;

    public SmartDevice() {
    }

    public SmartDevice(String marca, int year) {
        this.marca = marca;
        this.year = year;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "marca='" + marca + '\'' +
                ", year=" + year +
                '}';
    }
}
