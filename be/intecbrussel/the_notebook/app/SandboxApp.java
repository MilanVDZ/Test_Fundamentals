public class SandboxApp {

    public static void main(String[] args) {

        ForestNotebook natureBook = new ForestNotebook();

        // carnivores
        Carnivore carnivore = new Carnivore("Lion", 175, 100, 200);
        carnivore.setMaxFoodSize(80);

        Carnivore carnivore2 = new Carnivore("White Shark", 1000, 350, 600);
        carnivore2.setMaxFoodSize(200);

        List<Carnivore> animals = new ArrayList<>();
        animals.add(carnivore, carnivore2);

        natureBook.setCarnivores(animals);
        natureBook.getAnimalCount();
            


    }

}
