import base.Person;
import game.Character;

public class App {

    static void playWithPersons() {
        Person person1 = new Person("Pepe", 22);
        // Person.countInstances++;

        // person1.name = "Ramon";
        // person1.age = 20;
        person1.greetings();
        person1.setAge(23);
        person1.greetings();

        Person person2 = new Person("Juan", 25);
        // Person.countInstances++;

        // person2.name = "Juan";
        // person2.age = 25;
        person2.greetings();
        System.out.println(Person.countInstances);
    }

    static void prepareGame() {
        Character char1 = new Character("Pepe", 'H', 0, 0, "Mago", false);
        char1.showCharacter();
    }

    public static void main(String[] args) {

        // playWithPersons();
        prepareGame();

    }
}
