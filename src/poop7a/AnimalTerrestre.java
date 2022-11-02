package poop7a;

public class AnimalTerrestre extends Animal {
    private int numPatas;

    public AnimalTerrestre() {
    }

    public AnimalTerrestre(String nombre, String lugarOrigen, String color, int numPatas) {
        super(nombre, lugarOrigen, color);
        this.numPatas = numPatas;
    }
    
    public void correr(){
        System.out.println("Corriendo por el campo");
    }
    
    @Override
    public void comer(){
        System.out.println("Comiendo sobre el nivel del mar");
    }
}
