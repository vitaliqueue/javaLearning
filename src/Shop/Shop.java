package Shop;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Shop {
    Random rand = new Random();
    //private final List<Cash> cashes = new ArrayList<>();

    Customer[] customerArray;
    Cash[] cashArray;
    Integer customersCounter;
    Integer chosenCash;

    public void Shop() {
    }



    public Cash[] createCashes(Integer cashAmount) {
        Cash[] cashArray = new Cash[cashAmount];
        System.out.println("Created cashes");
        for (Integer i = 0; i < cashAmount; i++) {
            cashArray[i] = new Cash(rand.nextInt(3) + 3);
            System.out.println("Cash # " + i + " speed = " + cashArray[i].speed);
        }
        System.out.println(" ");
        return cashArray;
    }

    public Customer[] createCustomers(Integer customersRandom, Integer customersMin, Integer goodsRandom, Integer goodsMin) {
        Integer type;
        Integer customersAmount = rand.nextInt(customersRandom) + customersMin;
        Customer[] customerArray = new Customer[customersAmount];

        for (Integer i = 0; i < customersAmount; i++) {
            type = rand.nextInt(3);
            Integer goodsAmount = rand.nextInt(goodsRandom) + goodsMin;

            switch (type) {
                case 0: {
                    customerArray[i] = new Man(goodsAmount);
                    System.out.println("Customer # " + i + " with type = Man and goods amount = " + customerArray[i].goodsAmount);
                    break;
                }
                case 1: {
                    customerArray[i] = new Woman(goodsAmount);
                    System.out.println("Customer # " + i + " with type = Woman and goods amount = " + customerArray[i].goodsAmount);
                    break;
                }
                case 2: {
                    customerArray[i] = new Child(goodsAmount);
                    System.out.println("Customer # " + i + " with type = Child and goods amount = " + customerArray[i].goodsAmount);
                    break;
                }
                default: System.out.println("Unexpected gender");
            }
        }
        System.out.println(" ");
        return customerArray;
    }

    public void work(Cash [] cashArray, Customer [] customerArray) {
        customersCounter = customerArray.length;
        while(customersCounter != 0) {
            for (Integer j = 0; j < customerArray.length; j++) {
                if (customerArray[j].serviceStatus == null) { // null = not in progress
                    customerArray[j].cashIndex = customerArray[j].chooseCash(cashArray);
                    System.out.println("\n" + "Customer # " + j + " chose the cash # " + customerArray[j].cashIndex);
                    customerArray[j].serviceStatus = 1; // 1 = in progress
                }
                if (customerArray[j].serviceStatus != 2) {
                    cashArray[customerArray[j].cashIndex].serveCustomer(customerArray[j]);
                    System.out.println("Cash " + customerArray[j].cashIndex + " has queue = " + cashArray[customerArray[j].cashIndex].queue + " and summary goods amount " + cashArray[customerArray[j].cashIndex].customersHeap);
                    System.out.println("\n"+"Customer # " + j + " after the cycle has goods amount " + customerArray[j].goodsAmount);
                } else if (customersCounter != 0 && customerArray[j].serviceStatus == 2) { // 2 = served
                    customersCounter = customersCounter - 1;
                }

            }
            System.out.println("\n" + "yet another cycle is over" + "\n" );
            if (customersCounter == 0) System.out.println("\n" + "Everyone is served");
        }
    }
}