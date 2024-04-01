package Animal_Farm_Zoo;

import java.util.*;

public class Zoo {

    private AnimalFactory animalFactory;
    private List<Animal> animalList;

    Zoo(AnimalFactory animalFactory){
        this.animalFactory = animalFactory;
        this.animalList = new ArrayList<>();
    }

    public void addAnimal(String type, String name){
        Animal animal = animalFactory.createAnimal(type, name);
        if(animal != null){
            animalList.add(animal);
        }
    }

    public String performConcert(){
        StringBuilder concert = new StringBuilder();
        for (int i = 0; i < animalList.size(); i++) {
            concert.append(animalList.get(i).makeSound());
            if (i < animalList.size() - 1) {
                concert.append("*");
            }
        }
        return concert.toString() + "*";
    }

    @Override
    public String toString() {
        return animalList.toString();
    }
}
