package Animal_Farm_Zoo;

public class Cow extends Animal {
    public Cow(String name) {
        super("Cow:" + name);
    }
    @Override
    public String makeSound() {
        return getName() + " says Moo Moo";
    }
}
