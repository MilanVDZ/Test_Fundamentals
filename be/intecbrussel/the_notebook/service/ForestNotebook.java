package be.intecbrussel.the_notebook.service;

import be.intecbrussel.the_notebook.entities.animal_entities.Animal;
import be.intecbrussel.the_notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ForestNotebook {

    private List<Carnivore> carnivores = new LinkedList<>();
    private List<Omnivore> omnivores = new LinkedList<>();
    private List<Herbivore> herbivores = new LinkedList<>();
    private int plantCount;
    private int animalCount;
    private List<Animal> animals = new LinkedList<>();
    private List<Plant> plants = new LinkedList<>();


    public ForestNotebook() {
    }

    public List<Carnivore> getCarnivores() {
        return carnivores;
    }

    public void setCarnivores(List<Carnivore> carnivores) {
        this.carnivores = carnivores;
    }

    public List<Omnivore> getOmnivores() {
        return omnivores;
    }

    public void setOmnivores(List<Omnivore> omnivores) {
        this.omnivores = omnivores;
    }

    public List<Herbivore> getHerbivores() {
        return herbivores;
    }

    public void setHerbivores(List<Herbivore> herbivores) {
        this.herbivores = herbivores;
    }

    public int getPlantCount() {
        plantCount = plants.size();
        return plantCount;
    }

    public int getAnimalCount() {
        animalCount = animals.size();
        return animalCount;
    }

    public void addAnimal(Animal animal){
        if(animal instanceof Carnivore){
            this.carnivores.add((Carnivore) animal);
        } else if(animal instanceof Herbivore){
            this.herbivores.add((Herbivore) animal);
        } else if(animal instanceof Omnivore) {
            this.omnivores.add((Omnivore) animal);
        }
        this.animals.add(animal);
    }

    public void addPlant(Plant plant){
        this.plants.add(plant);
    }

    public void printNotebook(){
        plants.forEach(System.out::println);
        animals.forEach(System.out::println);
    }

    public void sortAnimalsByName(){
        animals.sort(Comparator.comparing(Animal::getName));
    }

    public void sortPlantsByName(){
        plants.sort(Comparator.comparing(Plant::getName));
    }

    //BONUS
    public void sortAnimalsByHeight(){
        animals.sort(Comparator.comparing(Animal::getHeight));
        animals.forEach(h -> System.out.println(h.getName()));
    }

    public void sortPlantsByHeight(){
        plants.sort(Comparator.comparing(Plant::getHeight));
        plants.forEach(h -> System.out.println(h.getName()));
    }
}
