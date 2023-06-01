import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class testEmpresa {


    @Test
    void agregarRedesSociales (){
        ArrayList<String> redes = new ArrayList<>();
        Empresa transportes = new Empresa("", "", "", null, redes);
        transportes.agregarRedes("facebook");
        String esperado = "["+"facebook"+"]";
        String resultado = String.valueOf(transportes.getRedes());
        Assertions.assertEquals(esperado, resultado);
    }
    @Test
    void agregarBusesTEST () {
        ArrayList<Bus> buses = new ArrayList<>();
        Empresa transportes = new Empresa("", "", "", buses, null);
        Bus bus = new Bus("TH-CK-04", "Mercedes-Benz", "C100", null, null);
        transportes.agregarBus(bus);
        String resultado = String.valueOf(transportes.getBuses());
        String esperado = "["+bus.toString()+"]";
        Assertions.assertEquals(esperado, resultado);
    }

    @Test
    void agregarConductorTEST () {
        Empresa transportes = new Empresa("", "", "", null, null);
        Bus bus = new Bus("", "", "", null, null);
        Conductor conductor1 = new Conductor("Juan", "Perez", "933334444", "A2", null);
        transportes.agregarConductor(bus, conductor1);
        String resultado = String.valueOf(conductor1);
        String esperado = String.valueOf(bus.getConductor());
        Assertions.assertEquals(esperado, resultado);
    }

    @Test
    void asociarViajeTEST (){
        ArrayList <Viaje> viajes = new ArrayList<>();
        Ciudad ciudad1 = new Ciudad("temuco");
        Ciudad ciudad2 = new Ciudad("arica");
        Bus bus = new Bus("", "", "", null, viajes);
        Viaje arica = new Viaje(ciudad1, ciudad2, "1900", "2100", 2, null);
        bus.agregarViaje(arica);
        String esperado = String.valueOf(arica);
        String resultado = String.valueOf(bus.getViajes());
        Assertions.assertEquals(esperado, resultado);
    }
    // no supe como hacer que comparara el resultado y no comparara el objeto tal cual
}
