package co.edu.uptc.model;

public class Defender extends Player{
    
    private int tackles;

    public Defender(String name, int age, int tackles) {
        super(name, age, "Defensa");
        this.tackles = tackles;
    }

    public int getTackles() {
        return tackles;
    }

    public void setTackles(int tackles) {
        this.tackles = tackles;
    }
    @Override
    public String showInfo() {
        return "Nombre: " + getName() + "\nEdad: " + getAge() + "\nPosicion: " + getPosition() + "\nEntradas realizadas: " + getTackles();
    }

}
