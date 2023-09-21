package creational.pattern.builder;

public class PersonBuilder {

    String name;
    Integer age;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }
    public PersonBuilder setAge(Integer age) {
        this.age = age;
        return this;
    }

    public Person build() {
        return new Person(this.name, this.age);
    }
}
