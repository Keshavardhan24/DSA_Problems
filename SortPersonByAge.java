import java.util.Arrays;
import java.util.Comparator;
class Person{
    String name;
    int age;
    Person(String name , int age)
    {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString()
    {
        return name +"(" + age + ")";
    }

}

public class SortPersonByAge {
    public static void main(String[] args) {
        Person [] people =
        {
            new Person("Bob",30),
            new Person("Alice",25),
            new Person("Charlie",40)
        };
        Arrays.sort(people,Comparator.comparingInt(person -> person.age));
        System.out.println(Arrays.toString(people));
    }
    
}
