
//***********************************************************************
// Title : A java programme to demonstrate Liskov Substitution Principle.
// Author : Radhika Chowdhury, Undergrduate student, Khulna University.
//***********************************************************************

/**
 * Interface representing a basic animal.
 */
interface Animal {
    /**
     * Method to make the animal sound.
     */
    void makeSound();
}

/**
 * Interface representing a walking animal.
 */
interface WalkingAnimal {
    /**
     * Method for walking.
     */
    void walk();
}

/**
 * Interface representing a jumping animal.
 */
interface JumpingAnimal {
    /**
     * Method for jumping.
     */
    void jump();
}
// Interface representing the ability to swim
interface Swimmable {
    void swim();
}


/**
 * Class representing a dog.
 */
class Dog implements Animal, WalkingAnimal {
    @Override
    public void makeSound() {
        System.out.println("Woof woof!");
    }
    
    @Override
    public void walk() {
        System.out.println("Dog walking...");
    }
}
//Class representing an Elephant.
class Elephant implements Animal,swimmable{
    @Override
    public void makeSound() {
        System.out.println("Pawooooo!!");
    }
    @Override
    public void swim(){
        System.out.println("The Elephant can swim.");
    }
    @Override
    public void walk() {
        System.out.println("Elephant walking...");
    }
}

/**
 * Class representing a kangaroo.
 */
class Kangaroo implements Animal, WalkingAnimal, JumpingAnimal {
    @Override
    public void makeSound() {
        System.out.println("Boing boing!");
    }
    
    @Override
    public void walk() {
        System.out.println("Kangaroo walking...");
    }
    
    @Override
    public void jump() {
        System.out.println("Kangaroo jumping...");
    }
}

/**
 * Interface_Segregattion_Principle class to demonstrate Interface Segregation Principle with animals' movements.
 */
public class Interface_Segregattion_Principle {
    /**
     * Method to interact with an animal.
     * @param animal The animal to interact with.
     */
    public static void interactWithAnimal(Animal animal) {
        animal.makeSound();
        if (animal instanceof WalkingAnimal) {
            ((WalkingAnimal) animal).walk();
        }
        if (animal instanceof JumpingAnimal) {
            ((JumpingAnimal) animal).jump();
        }
        if(animal instance of swimmable){
            ((swimmable) animal.swim());
        }
    }

    public static void main(String[] args) {
        // Creating a dog
        Animal dog = new Dog();
        System.out.println("Interacting with dog:");
        interactWithAnimal(dog);

        // Creating a LabeoRohita
        swimmable e=new Elephant();
        System.out.println("\nInteracting with elephant:");
        interactWithAnimal(e);
        
        // Creating a kangaroo
        Animal kangaroo = new Kangaroo();
        System.out.println("\nInteracting with kangaroo:");
        interactWithAnimal(kangaroo);
        
    }
}
/**
 * In the above programme there are four interfaces for specific tasks like
 * Animal,WalkingAnimal,JumpingAnimal,swimmable instead of a fat interface containing all 
 * the four tasks. As a result the kangaroo class can implement specific interfaces
 * like animal and WalkingAnimal,JumpingAnimal and simillarly the elephant class can use the specific
 * Swimmable class.
 */