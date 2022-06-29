package Shop;

import java.util.*;

public class Cash {
    public Integer speed;
    public Integer queue = 0;
    public Integer customersHeap = 0;

    public Cash(Integer speed) {
        this.speed = speed;
    }

    public void serveCustomer (Customer customer){
        if (customer.goodsAmount >= speed) {
            customer.goodsAmount = customer.goodsAmount - speed;
            customersHeap = customersHeap - speed;

        }
        else {
            customersHeap = customersHeap - customer.goodsAmount;
            customer.goodsAmount = 0;
        }

        if (customer.goodsAmount == 0) {
            customer.serviceStatus = 2;// served
            queue = queue - 1;
        }
    }
}
