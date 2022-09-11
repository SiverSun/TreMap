import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Petr", "Ivanov Rolikov", 25));
        people.add(new Person("Oleg", "Petrov Korsak Mladshiy", 40));
        people.add(new Person("Katerina", "Volkova", 18));

        Comparator<Person> comparator = (p1, p2) -> p1.getSurname().length() - p2.getSurname().length();
        people.sort(comparator.reversed());

        System.out.println("Отсортированный список: " + people);
    }

}