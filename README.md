# AnimalPolymorphismDemo

## Description
This Java project demonstrates the concept of polymorphism by creating a base class `Animal` and two derived classes: `Dog` and `Cat`. The project showcases how an `Animal` reference can refer to different types of objects (Dog, Cat) and call the specific implementation of their methods, such as `showSpecies()` and `makeSound()`.

## Author
Written by Mohammed Qutu.

## Requirements
- Java 21.0.2 or later

## Usage
To run the program, compile the `SimplePolyDemo.java`, `Animal.java`, `Dog.java`, and `Cat.java` files, and execute the `SimplePolyDemo` class. The program will show how polymorphism works by calling methods on an `Animal` reference that points to different objects.

### Example Output
I'm just a regular animal Grrrrrrrrrrrrr I'm a dog. Woof Woof! I'm a cat. Meow

### Classes:
- **`Animal`**: Base class with generic methods `showSpecies()` and `makeSound()`.
- **`Dog`**: Inherits from `Animal` and overrides `showSpecies()` and `makeSound()`.
- **`Cat`**: Inherits from `Animal` and overrides `showSpecies()` and `makeSound()`.

### Key Features:
- Demonstrates polymorphism in Java.
- Method overriding to provide specific implementations for Dog and Cat.

