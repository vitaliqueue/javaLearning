package Shop;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
    //  dz#3

        Shop shop = new Shop();
        Cash[] cashArray = shop.createCashes(4);
        Customer [] customerArray = shop.createCustomers(10, 5, 10, 2);

        shop.work(cashArray, customerArray);
    }
}