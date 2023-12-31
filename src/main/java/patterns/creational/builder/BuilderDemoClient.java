package patterns.creational.builder;

import java.util.*;

public class BuilderDemoClient {


    public static void main(String... args) {
        Person p1 = new PersonBuilder().setAge(25).setName("Testing").build();
        Person p2 = new PersonBuilder().setName("Mohammed").setAge(40).build();
        Person p3 = new PersonBuilder().setName("SMohammed").setAge(20).build();
        Person p4 = new PersonBuilder().setName("AMohammed").setAge(45).build();


        List<Person> personList = new ArrayList<>();
        personList.addAll(Arrays.asList(p1, p2, p3, p4));
//        System.out.println(personList);
//        personList.sort((o1, o2) -> o2.getAge() - o1.getAge());
//        System.out.println(personList);
//
//        personList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
//
//        System.out.println(personList);
//
//        personList.sort((o1, o2) -> o2.getName().compareTo(o1.getName()));
//
//        System.out.println(personList);

//        personList.sort(Comparator.comparing(Person :: getAge).reversed().thenComparing(Person :: getName));
//        System.out.println(personList);

        //personList.stream().map(SerializationUtils::clone).collect(Collectors.toList());
        Collections.sort(personList);
        System.out.println(personList);

    }
}
