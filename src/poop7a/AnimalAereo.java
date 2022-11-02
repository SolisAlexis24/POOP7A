package poop7a;

public class AnimalAereo extends Animal{
    private int numAlas;

    public AnimalAereo() {
    }

    
    public AnimalAereo(String nombre, String lugarOrigen, String color, int numAlas) {
        super(nombre, lugarOrigen, color);
        this.numAlas = numAlas;
    }
    
    public void volar(){
        System.out.println("Volandoooo");
    }
    
    @Override
    public void comer(){
        System.out.println("yomi yomi comiendo con mi pico");
    }
}
