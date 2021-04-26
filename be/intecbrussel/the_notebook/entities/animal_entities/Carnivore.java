package be.intecbrussel.the_notebook.entities.animal_entities;

public class Carnivore extends Animal{

    private double maxFoodSize;


    public Carnivore(String name) {
        super(name);
    }

    public Carnivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

    @Override
    public String toString() {
        return "This carnivore is a " + getName() + ", this unique animal has weight of " + getWeight() + "kg, height of " +
                getHeight() + "cm, length of " + getLength() + "cm, the biggest animal it can eat has a size of " + this.maxFoodSize + "cm";
    }
}
