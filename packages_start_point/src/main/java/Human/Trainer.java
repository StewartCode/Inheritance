package Human;

import Animal.Dog;

import Animal.Air.Bird;

public class Trainer {
    public void teach(Dog dog, Bird bird) {
        dog.name = "Pet";
        dog.bark();
    }
}
