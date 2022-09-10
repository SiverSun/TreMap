import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Petr", "Ivanov", 25));
        people.add(new Person("Oleg", "Petrov", 40));
        people.add(new Person("Katerina", "Volkova", 18));

        people.sort((Person o1, Person o2) -> o1.getSurname().compareTo(o2.getSurname()));
        System.out.println("Отсортированный список: " + people);
    }

}