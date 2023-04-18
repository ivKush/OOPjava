package homeLesson6.controller;
/*
 * Добавил контроллер, чтоб разбить связь с общей логикой
 */


import homeLesson6.model.DrinkMachine;
import homeLesson6.product.Drink;

public class UserController {

    private DrinkMachine products = new DrinkMachine();

    public void setProduct(Drink drink) {
        products.setProduct(drink);
    }

    public void allProduct() {
        products.allProduct();
    }

}
