package lesson6.cat;

public class Main {
    public static void main(String[] args) {
        Cat cat = CatBuilder.getInstance().setName("Мурзик").setBreed("персидский").setAge(3).build();
        System.out.println(cat.toString());
    }
}
