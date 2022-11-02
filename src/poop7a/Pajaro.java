package poop7a;

public class Pajaro extends AnimalAereo{
    private String tipoPico;

    public Pajaro() {
    }

    public Pajaro(String tipoPico, String nombre, String lugarOrigen, String color, int numAlas) {
        super(nombre, lugarOrigen, color, numAlas);
        this.tipoPico = tipoPico;
    }
    
    public void recolectarRamas(){
        System.out.println("Recolectando ramas para mi nido");
    }
}
