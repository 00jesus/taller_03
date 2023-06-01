import java.util.ArrayList;

public class Viaje {
    private Ciudad origen;
    private Ciudad destino;
    private String horaSalida;
    private String horaLlegada;
    private int cantidadPasajeros;
    public ArrayList<Ciudad> ciudades = new ArrayList<Ciudad>();

    public Viaje(Ciudad origen, Ciudad destino, String horaSalida, String horaLlegada, int cantidadPasajeros, ArrayList<Ciudad> ciudades) {
        this.origen = origen;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.cantidadPasajeros = cantidadPasajeros;
        this.ciudades = null;
    }



    public Ciudad getOrigen() {
        return origen;
    }

    public void setOrigen(Ciudad origen) {
        this.origen = origen;
    }

    public Ciudad getDestino() {
        return destino;
    }

    public void setDestino(Ciudad destino) {
        this.destino = destino;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public ArrayList<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(ArrayList<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    @Override
    public String toString() {
        return "Viaje{" +
                "origen=" + origen +
                ", destino=" + destino +
                ", horaSalida='" + horaSalida + '\'' +
                ", horaLlegada='" + horaLlegada + '\'' +
                ", cantidadPasajeros=" + cantidadPasajeros +
                ", ciudades=" + ciudades +
                '}';
    }
}