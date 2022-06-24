package CashBox;

import java.util.Random;

public class Customer {
    public Integer type;
    public Integer goodsAmount;
    public boolean isServed;
    public boolean isProceed;
    public Integer minArr = 0;
    public Customer(Integer type, Integer goodsAmount, boolean isServed, boolean isProceed) {//0 - man, 1 - woman, 2 - child
        this.type = type;
        this.goodsAmount = goodsAmount;
        this.isServed = isServed;
        this.isServed = isProceed;
    }

    public Integer chooseCash (Cash[] cash){
            switch (type){
            case 0:
                {
                    for (Integer i = 0; i < cash.length; i++) {
                        if ((cash[i].speed > cash[minArr].speed) && (cash[i].customersHeap == 0)) {
                            minArr = i;
                        }
                        else if (cash[i].customersHeap / cash[i].speed > cash[minArr].speed) {
                            minArr = i;
                        }
                    }
                    cash[minArr].queue = cash[minArr].queue + 1;
                    cash[minArr].customersHeap += goodsAmount;
                    System.out.println("queue " + cash[minArr].queue + " heap " + cash[minArr].customersHeap);
                    return minArr;
                }
            case 1:
                {

                    for (Integer i = 0; i < cash.length; i++)
                        if(cash[i].queue < minArr)   minArr = cash[i].queue;
                    cash[minArr].queue = cash[minArr].queue + 1;
                    cash[minArr].customersHeap += goodsAmount;
                    System.out.println("queue " + cash[minArr].queue + " heap " + cash[minArr].customersHeap);
                    return minArr;
                }
            case 2:
                {
                    Integer randArr;
                    Random rand = new Random();
                    randArr = rand.nextInt(cash.length);
                    cash[randArr].queue = cash[randArr].queue + 1;
                    cash[randArr].customersHeap += goodsAmount;
                    System.out.println("queue " + cash[randArr].queue + " heap " + cash[randArr].customersHeap);
                    return randArr;
                }

                default:
                    return 0;
            }
    }
}
