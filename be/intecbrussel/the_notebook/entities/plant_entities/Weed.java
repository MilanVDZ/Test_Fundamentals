package be.intecbrussel.the_notebook.entities.plant_entities;

public class Weed extends Plant {

    private double area;


    public Weed(String name) {
        super(name);
    }

    public Weed(String name, double height) {
        super(name, height);
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "I should've wore longer pants, there's a lot of " + getName() + " throughout the whole forest."
                + " Luckily the height is only " + getHeight() + "cm with an area of " + this.area + "cm².";
    }
}
