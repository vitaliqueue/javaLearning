package CashBox;

import java.util.ArrayList;

public class Cash {
    public Integer speed;
    public Integer queue;
    public Integer customersHeap;

    public Cash(Integer speed, Integer queue, Integer customersHeap) {
        this.speed = speed;
        this.queue = queue;
        this.customersHeap = customersHeap;
    }

    public void serveCustomer (Customer customer) {
        if (customer.goodsAmount >= speed) {
            customer.goodsAmount = customer.goodsAmount - speed;
            customersHeap = customersHeap - speed;

        }
        else {
            customersHeap = customersHeap - customer.goodsAmount;
            customer.goodsAmount = 0;
        }

        if (customer.goodsAmount == 0) {
            customer.isServed = true;
            queue = queue - 1;
            System.out.println("(2)Another customer is served");
        }
    }
}
