package poop7a;

public class AnimalAcuatico extends Animal {
    private int numeroAletas;

    public AnimalAcuatico() {
    }

    public AnimalAcuatico(String nombre, String lugarOrigen, String color, int numeroAletas) {
        super(nombre, lugarOrigen, color);
        this.numeroAletas = numeroAletas;
    }
    
    public void nadar(){
        System.out.println("Estoy nadandooo");
    }
    
    @Override
    public void comer(){
        System.out.println("Yomi yomi, comiendo bajo el mar");
    }
}
