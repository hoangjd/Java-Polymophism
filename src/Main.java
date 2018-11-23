public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal carnivore = new Carnivore();
        Animal lion = new Lion();
        Carnivore alligator = new Alligator();

        animal.eat();
        carnivore.eat();
        lion.eat();
        alligator.eat();

        animal.born();
        carnivore.born();
        lion.born();
        alligator.born();

        animal.die();
        carnivore.die();
        lion.die();
        alligator.die();
    }
}
