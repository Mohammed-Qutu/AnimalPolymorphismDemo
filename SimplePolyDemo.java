public class SimplePolyDemo {
    public static void main(String[] args) {
        // Declare an Animal reference variable.
        Animal myAnimal;

        // Reference an Animal object.
        myAnimal = new Animal();
        myAnimal.showSpecies();
        myAnimal.makeSound();

        // Reference a Dog object.
        myAnimal = new Dog();
        myAnimal.showSpecies();
        myAnimal.makeSound();

        // Reference a Cat object.
        myAnimal = new Cat();
        myAnimal.showSpecies();
        myAnimal.makeSound();
    }
}
