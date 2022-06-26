package CashBox;

import java.util.Random;

public class Customer {
    public Integer type;
    public Integer goodsAmount;
    public boolean isServed;
    public boolean isProceed;
    public Integer minArr = 0;
    public Integer chosenCash;

    public Customer(Integer type, Integer goodsAmount, boolean isServed, boolean isProceed, Integer chosenCash) {//0 - man, 1 - woman, 2 - child
        this.type = type;
        this.goodsAmount = goodsAmount;
        this.isServed = isServed;
        this.isProceed = isProceed;
        this.chosenCash = chosenCash;
    }

    public Integer chooseCash (Cash[] cash){
            switch (type){
            case 0:
                {
                    for (Integer i = 0; i < cash.length; i++) {
                        if (cash[i].customersHeap / cash[i].speed - cash[i].speed + cash[i].customersHeap < cash[minArr].customersHeap / cash[minArr].speed - cash[minArr].speed + cash[minArr].customersHeap) {
                            minArr = i;
                        }
                    }
                    cash[minArr].queue = cash[minArr].queue + 1;
                    cash[minArr].customersHeap += goodsAmount;
                    return minArr;
                }
            case 1:
                {

                    for (Integer i = 0; i < cash.length; i++)
                        if(cash[i].queue < minArr)   minArr = cash[i].queue;
                    cash[minArr].queue = cash[minArr].queue + 1;
                    cash[minArr].customersHeap += goodsAmount;
                    return minArr;
                }
            case 2:
                {
                    Random rand = new Random();
                    minArr = rand.nextInt(cash.length);
                    cash[minArr].queue = cash[minArr].queue + 1;
                    cash[minArr].customersHeap += goodsAmount;
                    return minArr;
                }

               default:
                    System.out.println("Something went wrong");
                    return 0;
            }
    }
}
