public class SmartPhone extends SmartDevice{

     protected String modelo;
     protected String color;
     protected double precio;
     protected boolean camara;

     public SmartPhone() {

     }

    public SmartPhone(String marca, int year, String modelo, String color, double precio, boolean camara) {
        super(marca, year);
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.camara = camara;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", precio=" + precio +
                ", camara=" + camara +
                '}';
    }
}
