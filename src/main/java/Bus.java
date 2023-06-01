import java.util.ArrayList;

public class Bus {
    private String patente;
    private String marca;
    private String modelo;
    public Conductor conductor;
    public ArrayList<Viaje> viajes;

    public Bus() {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.conductor = conductor;
        this.viajes = null;
    }

    public Bus(String patente, String marca, String modelo, Conductor conductor, ArrayList<Viaje> viajes) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.conductor = conductor;
        this.viajes = viajes;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Conductor getConductor() {
        return conductor;
    }
    public void agregarViaje (Viaje viaje) {
        viajes.add(viaje);
    }

    public void agregarConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public ArrayList<Viaje> getViajes() {
        return viajes;
    }

    public void setViajes(ArrayList<Viaje> viajes) {
        this.viajes = viajes;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "patente='" + patente + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", conductor=" + conductor +
                ", viajes=" + viajes +
                '}';
    }
}