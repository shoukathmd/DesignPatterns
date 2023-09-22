package set;

import java.util.Objects;

public class Person {
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    String name;
    Integer age;

    public Person(String name, Integer age) {
        this.age = age;
        this.name = name;
    }

//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        return Objects.equals(this.name, ((Person) o).name) && Objects.equals(age, ((Person) o).age);
//    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return Objects.equals(this.name, ((Person) o).name);
    }

//    public int hashCode() {
//        return Objects.hash(name, age);
//    }

    public int hashCode() {
        return Objects.hash(name);
    }
}
