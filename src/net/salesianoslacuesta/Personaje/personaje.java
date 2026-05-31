package net.salesianoslacuesta.Personaje;

public class personaje {
    
    private String nombre;
    private int nivel;
    private int energia;

    public personaje(String nombre, int nivel, int energia){
        this.nombre = nombre;
        this.nivel = nivel;
        this.energia = 100;
    }

    public String getNombre() {
        return nombre;
    }

    public void SetNombre(String nombre) {
        this.nombre = nombre;
    }


    public int setNivel() {
        return energia;
    }

    public int getNivel(){
        return nivel;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }
    
}
