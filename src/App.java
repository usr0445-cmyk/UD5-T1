import net.salesianoslacuesta.Guerrero.guerrero;
import net.salesianoslacuesta.Mago.mago;
import net.salesianoslacuesta.Personaje.personaje;

public class App {
    public static void main(String[] args) throws Exception {

        personaje viajero = new personaje("Eldrin", 3, 30);
        viajero.entrenar(4);
        viajero.gastarEnergia(30);
        viajero.mostrarInfo();


        guerrero thorak = new guerrero("Thorak", 5, "Hacha doble");
        thorak.ataquePesado();
        thorak.mostrarInfo();
        thorak.descansar(10);
    }

  
}
