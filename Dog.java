package Animal_Farm_Zoo;

public class Dog extends Animal {

    public Dog(String name) {
        super("Dog:" + name);
    }
    @Override
    public String makeSound() {
        return getName() + " says Woof";
    }
}
