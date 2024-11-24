package co.edu.uptc.model;

public class Goalkeeper extends Player {
    
    private int saves;

    public Goalkeeper(String name, int age, int saves) {
        super(name, age, "Arquero");
        this.saves = saves;
    }

    public int getSaves() {
        return saves;
    }

    public void setSaves(int saves) {
        this.saves = saves;
    }
    @Override
    public String showInfo() {
        return "Nombre: " + getName() + "\nEdad: " + getAge() + "\nPosicion: " + getPosition() + "\nAtajadas: " + getSaves();
    }

}
