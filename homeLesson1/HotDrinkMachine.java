package homeLesson1;

public class HotDrinkMachine implements VendMachine {

    @Override
    public void getProduct(String name, String volume, String temperature) {

        if (name.equals("1")) {
            name = "кофе";
        } else if (name.equals("2")) {
            name = "чай";
        } else if (name.equals("3")) {
            name = "горячий шоколад";
        }
        System.out.printf("%s, объём %s, температура %s гадусов", name, volume, temperature);
    }
}
