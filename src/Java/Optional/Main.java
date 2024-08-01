package Java.Optional;

import java.util.Optional;

class Human {
    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        Optional<Human> optionalHuman = getHumanByName("Evans");
        System.out.println(optionalHuman.orElseGet(() -> new Human("Anthony", 25)).getName());

        System.out.println(optionalHuman.map(_ -> new Human("Tony", 52)).orElse(new Human("Wayne", 26)).getName());

        System.out.println(optionalHuman.map(Human::getAge).orElse(43));
    }

    public static Optional<Human> getHumanByName(String name) {
        Human human = new Human(name, 25);
        return Optional.ofNullable(null);
    }
}
