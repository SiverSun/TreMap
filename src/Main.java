import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;


public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Petr", "Ivanov", 25));
        people.add(new Person("Oleg", "Petrov", 40));
        people.add(new Person("Katerina", "Volkova", 19));
        people.add(new Person("Ivan", "Turikov", 15));
        people.add(new Person("Nikolay", "Sokolov", 12));

        people.removeIf(x -> x.getAge() < 18);

        PersonComparator personComparator = new PersonComparator(7);
        Collections.sort(people, personComparator);
        System.out.println("Отсортированный список: " + people);
    }

}