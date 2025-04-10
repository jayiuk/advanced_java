import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class PersonTest {
    public static void main(String[] args) {
        System.out.println("201914111 전영욱 hw10_3 람다식");
        System.out.println("평균 신장 : " + average(Person.persons, p -> p.getHeight()));
        System.out.println("평균 체중 : " + average(Person.persons, p -> p.getWeight()));
    }

    public static double average(List<Person> list, Function<Person, Integer> f) {
        double sum = 0;
        for (Person p : list) {
            sum += f.apply(p);
        }
        return sum / list.size();
    }
}