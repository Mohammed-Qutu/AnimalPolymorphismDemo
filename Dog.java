public class Dog extends Animal {
    @Override
    public void showSpecies() {
        System.out.println("I'm a dog.");
    }

    @Override
    public void makeSound() {
        System.out.println("Woof Woof!");
    }
}
