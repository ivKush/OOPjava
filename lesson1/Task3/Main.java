package lesson1.Task3;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("barsik");
        cat.setAge(4);
        cat.setInGoodMood(true);
        Dog dog = new Dog();
        dog.setName("sharik");
        dog.setAge(4);
        dog.setBreed("ovcharka");
        cat.tellAboutYOurself();
        dog.tellAboutYOurself();
    }
}
