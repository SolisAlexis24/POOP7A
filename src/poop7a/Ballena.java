package poop7a;

public class Ballena extends AnimalAcuatico{
    private int largo;

    public Ballena() {
    }

    public Ballena(String nombre, String lugarOrigen, String color, int numeroAletas, int largo) {
        super(nombre, lugarOrigen, color, numeroAletas);
        this.largo = largo;
    }
    
    public void pelearConPinocho(){
        System.out.println("AAAA te pasaste de rosca, Pinocho");
    }
    
    
}
