package be.intecbrussel.the_notebook.entities.plant_entities;


public class Tree extends Plant {

    private LeafType leafType;


    public Tree(String name) {
        super(name);
        this.setLeafType(LeafType.HEART);
    }

    public Tree(String name, double height) {
        super(name, height);
        this.setLeafType(LeafType.HEART);
    }

    public LeafType getLeafType() {
        return leafType;
    }

    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }

    @Override
    public String toString() {
        return "What a beautiful " + getName() + " tree" + ", with it's " + getHeight() + "cm height and " +
                this.leafType.toString().toLowerCase() + " types of leaf, it's a menace!";
    }
}
