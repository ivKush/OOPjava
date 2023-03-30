package homeLesson1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Temperature extends HotDrink {
    private String temperature45;
    private String temperature60;
    private String temperature85;

    public String getTemperature45() {
        temperature45 = "45";
        return temperature45;
    }
    public String getTemperature60() {
        temperature60 = "60";
        return temperature60;
    }
    public String getTemperature85() {
        temperature85 = "85";
        return temperature85;
    }

    List<String> start() {
        Temperature hotName = new Temperature();
        
        List<String> userProduct = new ArrayList<>();
        while (true) {
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("Нажмите нужную цифру: \n1 - кофе\n2 - чай\n3 - горячий шоколад");
                String n = sc.nextLine();
                
                if (n.equals(hotName.getCoffee()) || n.equals(hotName.getTea()) || n.equals(hotName.getHotChocolate())) {
                    userProduct.add(n);
                    break;
                } else {
                    System.out.println("Такого напитка нет.");
                }
            }
            System.out.println(" Введите необходимый объём в граммах: ");
            String v = sc.nextLine();
            userProduct.add(v);

            System.out.println("Введите желаемую температуру: \n45 \n60 \n85");
            while(true) {
                String t = sc.nextLine();
                if (t.equals(hotName.getTemperature45()) || t.equals(hotName.getTemperature60()) || t.equals(hotName.getTemperature85())) {
                    userProduct.add(t);
                    break;
                } else {
                    System.out.println("Выберите температуру из предложеных.");
                }
            }
            
            break;
        }
        return userProduct;
        
    }
     

}
