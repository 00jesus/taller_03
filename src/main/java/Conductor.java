public class Conductor {
    private String nombre;
    private String apellido;
    private String numeroContacto;
    private String licenciaConducir;
    public Bus bus;

    public Conductor(String nombre, String apellido, String numeroContacto, String licenciaConducir, Bus bus) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroContacto = numeroContacto;
        this.licenciaConducir = licenciaConducir;
        this.bus = bus;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public String getLicenciaConducir() {
        return licenciaConducir;
    }

    public void setLicenciaConducir(String licenciaConducir) {
        this.licenciaConducir = licenciaConducir;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    @Override
    public String toString() {
        return "Conductor{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", numeroContacto='" + numeroContacto + '\'' +
                ", licenciaConducir='" + licenciaConducir + '\'' +
                ", bus=" + bus +
                '}';
    }
}