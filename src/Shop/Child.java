package Shop;

import java.util.Random;

public class Child extends Customer {


    public Child(Integer goodsAmount){
        super(goodsAmount);
    }

    public Integer chooseCash (Cash [] cash){
        Random rand = new Random();
        cashIndex = rand.nextInt(cash.length);
        cash[cashIndex].queue = cash[cashIndex].queue + 1;
        cash[cashIndex].customersHeap += goodsAmount;
        serviceStatus = 0; //cash is chosen
        return cashIndex;
    }
}