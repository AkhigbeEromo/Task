import enums.Gender;
import enums.Religion;

public abstract class Person {
    public String name;
    public int age;
    public Gender gender;
    public Religion religion;




    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", religion=" + religion +
                '}';
    }
}
