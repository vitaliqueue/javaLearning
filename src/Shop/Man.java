package Shop;

public class Man extends Customer {
    public Integer cashIndex;

    public Man(Integer goodsAmount){
        super(goodsAmount);
    }

    public Integer chooseCash (Cash [] cash){
        cashIndex = 0;
        for (Integer i = 0; i < cash.length; i++) {
            if (cash[i].customersHeap / cash[i].speed - cash[i].speed + cash[i].customersHeap < cash[cashIndex].customersHeap / cash[cashIndex].speed - cash[cashIndex].speed + cash[cashIndex].customersHeap) {
                cashIndex = i;
            }
        }
        cash[cashIndex].queue = cash[cashIndex].queue + 1;
        cash[cashIndex].customersHeap += goodsAmount;
        serviceStatus = 0; //cash is chosen
        return cashIndex;
    }
}
