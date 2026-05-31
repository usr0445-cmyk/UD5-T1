package net.salesianoslacuesta.Mago;
import net.salesianoslacuesta.Personaje.personaje;

public class mago extends personaje  {
    
    private String elemento;

    public mago(String nombre, int nivel, String elemento){
        super(nombre, nivel);
        this.elemento = elemento;
    }
}
