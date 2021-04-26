package be.intecbrussel.the_notebook.app;

import be.intecbrussel.the_notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.entities.plant_entities.*;
import be.intecbrussel.the_notebook.service.ForestNotebook;


public class NatureApp {

    public static void main(String[] args) {

        ForestNotebook natureBook = new ForestNotebook();

        //PLANTS
        Tree tree = new Tree("Willow", 400);
        tree.setLeafType(LeafType.ROUND);
        natureBook.addPlant(tree);

        Tree tree2 = new Tree("Maple", 500);
        tree2.setLeafType(LeafType.HAND);
        natureBook.addPlant(tree2);

        Flower flower = new Flower("Tulip", 30);
        flower.setSmell(Scent.SWEET);
        natureBook.addPlant(flower);

        Weed weed = new Weed("Nettle", 10);
        weed.setArea(50);
        natureBook.addPlant(weed);

        Bush bush = new Bush("Redberry bush", 80);
        bush.setFruit("Redberry");
        bush.setLeafType(LeafType.HEART);
        natureBook.addPlant(bush);


        //ANIMALS
        //omnivores
        Omnivore omnivore = new Omnivore("Grizzly Bear", 600,300,200);
        omnivore.setMaxFoodSize(100);
        omnivore.addPlantToDiet(bush);
        natureBook.addAnimal(omnivore);

        Omnivore omnivore2 = new Omnivore("Wild Boar",100,60,120);
        omnivore2.setMaxFoodSize(40);
        omnivore2.addPlantToDiet(weed);
        natureBook.addAnimal(omnivore2);

        Omnivore omnivore3 = new Omnivore("Raven",20,35,45);
        omnivore3.setMaxFoodSize(15);
        omnivore3.addPlantToDiet(flower);
        natureBook.addAnimal(omnivore3);


        //carnivores
        Carnivore carnivore = new Carnivore("Lion", 175,100,200);
        carnivore.setMaxFoodSize(80);
        natureBook.addAnimal(carnivore);

        Carnivore carnivore2 = new Carnivore("White Shark",1000,350,600);
        carnivore2.setMaxFoodSize(200);
        natureBook.addAnimal(carnivore2);

        Carnivore carnivore3 = new Carnivore("Piranha",5,15,40);
        carnivore3.setMaxFoodSize(25);
        natureBook.addAnimal(carnivore3);


        //herbivores
        Herbivore herbivore = new Herbivore("Giraffe",250,500,150);
        herbivore.addPlantToDiet(tree);
        natureBook.addAnimal(herbivore);

        Herbivore herbivore2 = new Herbivore("Elephant",5000,600,150);
        herbivore2.addPlantToDiet(bush);
        natureBook.addAnimal(herbivore2);

        Herbivore herbivore3 = new Herbivore("Rabbit",5,30,20);
        herbivore3.addPlantToDiet(flower);
        natureBook.addAnimal(herbivore3);

        System.out.println("** A visit in the dangerous forest of Australia **");

        System.out.println();

        System.out.println("In total, I have seen " + natureBook.getAnimalCount() + " animals.");
        System.out.println("In total, I have seen " + natureBook.getPlantCount() + " plants.");

        System.out.println();

        System.out.println("Glad we survived the trip, let's see what we've written down!");

        System.out.println();

        natureBook.printNotebook();

        System.out.println();

        System.out.println("A list of animals: ");

        natureBook.getCarnivores().forEach(c -> System.out.println(c.getName()));
        natureBook.getHerbivores().forEach(h -> System.out.println(h.getName()));
        natureBook.getOmnivores().forEach(o -> System.out.println(o.getName()));

        System.out.println();

        System.out.println("The notebook in chronological order: ");

        System.out.println();

        natureBook.sortAnimalsByName();
        natureBook.sortPlantsByName();

        natureBook.printNotebook();

        System.out.println();

        //BONUS
        System.out.println("The notebook in height order: ");
        natureBook.sortPlantsByHeight();
        natureBook.sortAnimalsByHeight();



    }
}
