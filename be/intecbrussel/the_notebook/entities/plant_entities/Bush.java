package be.intecbrussel.the_notebook.entities.plant_entities;

public class Bush extends Plant {

    private String fruit;
    private LeafType leafType;


    public Bush(String name) {
        super(name);
    }

    public Bush(String name, double height) {
        super(name, height);

    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public LeafType getLeafType() {
        return leafType;
    }

    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }

    @Override
    public String toString() {
        return "This is a " + getName() + ", it has delicious " + this.fruit + " fruit" + " and beautiful " +
                this.leafType.toString().toLowerCase() + " leaf types." + " The height of the bush is " + getHeight() + "cm.";
    }
}