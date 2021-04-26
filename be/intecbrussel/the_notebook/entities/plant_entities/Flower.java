package be.intecbrussel.the_notebook.entities.plant_entities;

public class Flower extends Plant {

    private Scent smell;


    public Flower(String name) {
        super(name);
    }

    public Flower(String name, double height) {
        super(name, height);
    }

    public Scent getSmell() {
        return smell;
    }

    public void setSmell(Scent smell) {
        this.smell = smell;
    }

    public Flower withSmell(Scent smell){
        this.setSmell(smell);
        return this;
    }

    @Override
    public String toString() {
        return "This flower is called a " + getName() + ". It smells like " + this.smell.toString().toLowerCase() +
                " and has a height of " +  getHeight() + "cm.";
    }
}
