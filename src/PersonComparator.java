import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    private int wordCount;

    public PersonComparator(int wordCount) {

        this.wordCount = wordCount;
    }

    @Override
    public int compare(Person o1, Person o2) {
        int lengnthSureNameFirsPerson = o1.getSurname().split("[ \\n]").length;
        int lengthSurnameSecondPerson = o2.getSurname().split("[ \\n]").length;

        if (lengnthSureNameFirsPerson == lengthSurnameSecondPerson) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
        return lengnthSureNameFirsPerson > lengthSurnameSecondPerson ? 1 : -1;
    }
}
