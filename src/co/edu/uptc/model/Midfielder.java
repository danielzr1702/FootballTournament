package co.edu.uptc.model;

public class Midfielder extends Player {
    
    private int assists;

    public Midfielder(String name, int age, int assists) {
        super(name, age, "Mediocentro");
        this.assists = assists;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }
    @Override
    public String showInfo() {
        return "Nombre: " + getName() + "\nEdad: " + getAge() + "\nPosicion: " + getPosition() + "\nAsistencias: " + getAssists();
    }

}
