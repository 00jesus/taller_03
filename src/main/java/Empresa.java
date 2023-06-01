import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private String rut;
    private String direccion;
    public ArrayList<Bus> buses;
    public ArrayList<String> redes;


    /*
    Agregar buses y conductores.
Asociar viajes a un bus en específico.
Obtener todos los buses que viajan en un determinado rango de tiempo a una ciudad de destino en específico.
Descontinuar un bus de acuerdo a la patente del vehículo.
     */

    public Empresa(String nombre, String rut, String direccion, ArrayList<Bus> buses, ArrayList<String> redes) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
        this.buses = buses;
        this.redes = redes;
    }
    public Empresa () {
        this.nombre = "";
        this.rut = "";
        this.direccion = "";
        this.buses = null;
        this.redes = null;
    }
    public void agregarRedes(String redSocial) {
        redes.add(redSocial);

    }

    public void agregarBus(Bus bus) {
        buses.add(bus);
    }
    public void agregarConductor (Bus bus, Conductor conductor) {
        bus.agregarConductor(conductor);
    }

    //asociar viaje
    public void agregarViajeParaBus(Bus bus, Viaje viaje) {
        bus.agregarViaje(viaje);
    }

    public void cantidadTotalBuses() {
        throw new UnsupportedOperationException();
    }

    public void cantidadTotalPasajeros() {
        throw new UnsupportedOperationException();
    }

    public void cantidadViajesTotales() {
        throw new UnsupportedOperationException();
    }

    public void obtenerBusesPorDestino() {
        throw new UnsupportedOperationException();
    }

    public void descontinuarBus() {
        throw new UnsupportedOperationException();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Bus> getBuses() {
        return buses;
    }

    public void setBuses(ArrayList<Bus> buses) {
        this.buses = buses;
    }

    public ArrayList<String> getRedes() {
        return redes;
    }

    public void setRedes(ArrayList<String> redes) {
        this.redes = redes;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", rut='" + rut + '\'' +
                ", direccion='" + direccion + '\'' +
                ", buses=" + buses +
                ", redes=" + redes +
                '}';
    }
}

