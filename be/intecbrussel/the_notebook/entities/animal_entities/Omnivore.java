package be.intecbrussel.the_notebook.entities.animal_entities;

import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

import java.util.HashSet;
import java.util.Set;

public class Omnivore extends Animal{

    private Set<Plant> plantDiet = new HashSet<>();
    private double maxFoodSize;


    public Omnivore(String name) {
        super(name);
    }

    public Omnivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

    public void addPlantToDiet(Plant plant){
        this.plantDiet.add(plant);
    }

    @Override
    public String toString() {
        return "This omnivore is a " + getName() + ", this unique animal has weight of " + getWeight() + "kg, height of " +
                getHeight() + "cm, length of " + getLength() + "cm, it eats plants and animals. The plants are " + this.plantDiet
                + " and the biggest animal it can eat has a size of " + this.maxFoodSize + "cm";
    }
}
