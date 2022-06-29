package Shop;

public class Woman extends Customer {

    public Woman(Integer goodsAmount){
        super(goodsAmount);
    }

    public Integer chooseCash (Cash [] cash){
        for (Integer i = 0; i < cash.length; i++)
            if(cash[i].queue < cash[cashIndex].queue)   cashIndex = i;
        cash[cashIndex].queue = cash[cashIndex].queue + 1;
        cash[cashIndex].customersHeap += goodsAmount;
        serviceStatus = 0; //cash is chosen
        return cashIndex;
    }
}