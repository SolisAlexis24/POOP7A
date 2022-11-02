package poop7a;

public class Perro extends AnimalTerrestre{
    private String colorCollar;

    public Perro() {
    }

    public Perro(String colorCollar, String nombre, String lugarOrigen, String color, int numPatas) {
        super(nombre, lugarOrigen, color, numPatas);
        this.colorCollar = colorCollar;
    }
    
    public void hacerTrucos(){
        System.out.println("Procede a hacer un mortal hacia atrás mientras lee a Neruda");
    }
}
