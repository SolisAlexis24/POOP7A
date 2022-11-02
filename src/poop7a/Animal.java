package poop7a;

public class Animal {
    private String nombre, lugarOrigen, color;

    public Animal() {
    }

    public Animal(String nombre, String lugarOrigen, String color) {
        this.nombre = nombre;
        this.lugarOrigen = lugarOrigen;
        this.color = color;
    }
    
    public void sonido(String sonido){
        System.out.println("Soy un animal y hago este sonido: " + sonido);
    }
    public void comer(){
        System.out.println("Yomi yomi comida");
    }
}
