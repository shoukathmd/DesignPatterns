package set;

import java.util.HashSet;
import java.util.Set;

public class SetCustomObjectDemoClient {


    public static void main(String... args) {
        Person p1 = new PersonBuilder().setAge(45).setName("ABC").build();
        Person p2 = new PersonBuilder().setAge(42).setName("ABC").build();
        Person p3 = new PersonBuilder().setAge(3).setName("ABC").build();
        Person p4 = new PersonBuilder().setAge(41).setName("ABC").build();

        Set<Person> set = new HashSet<>();
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);

       for (Person p : set) {
           System.out.println(p);
       }
    }
}
