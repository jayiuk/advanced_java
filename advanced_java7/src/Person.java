import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


class Person {
    private String name;
    private int height, weight;

    public Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name + "(" + height + ", " + weight + ")";
    }

    static List<Person> persons = Arrays.asList(
            new Person("황진이", 160, 45), new Person("이순신", 180, 80),
            new Person("김삿갓", 175, 65), new Person("홍길동", 170, 68),
            new Person("배장화", 155, 48)
    );
}