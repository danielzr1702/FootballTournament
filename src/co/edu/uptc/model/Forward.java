package co.edu.uptc.model;

public class Forward extends Player {
    
    private int goals;

    public Forward(String name, int age, int goals) {
        super(name, age, "Delantero");
        this.goals = goals;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }
    @Override
    public String showInfo() {
        return "Nombre: " + getName() + "\nEdad: " + getAge() + "\nPosicion: " + getPosition() + "\nGoles anotados: " + getGoals();
    }

}
