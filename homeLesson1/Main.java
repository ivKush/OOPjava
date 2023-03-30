package homeLesson1;

import java.util.ArrayList;
import java.util.List;

/*
 * Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
 * Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат 
 *  и реализовать перегруженный метод getProduct(int name, int volume, int temperature) 
 *  выдающий продукт соответствующий имени, объему и температуре.
 * В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат 
 *  и воспроизвести логику заложенную в программе.
 * Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
 */
public class Main {
    public static void main(String[] args) {
        Temperature temp = new Temperature();

        // System.out.println(temp.start());
        List<String> readyDrink = new ArrayList<>();
        readyDrink = temp.start();
        HotDrinkMachine drink = new HotDrinkMachine();
        drink.getProduct(readyDrink.get(0), readyDrink.get(1), readyDrink.get(2));
    }
    
}
