/*
Реализуйте класс Товар, содержащий данные о товаре, 
и ТорговыйАвтомат, содержащий в себе 
методы getProductsByname и getProductsByPrice
*/
public class Task1 {
    public static void main(String[] args) {
        VendingMachine m = new VendingMachine();
        m.addProduct("Coca-cola", 100);
        m.addProduct("Snikers", 50);
        System.out.println(m.getProductByPrice(50));
        System.out.println(m.getProductByname("Coca-cola"));
    }
}
