package Shop;

public abstract class Customer {
    public Integer goodsAmount;
    public Integer serviceStatus = null;
    public Integer cashIndex = 0;

    public Customer(Integer goodsAmount){
        this.goodsAmount = goodsAmount;
    }

    public Integer chooseCash (Cash[] cash) {
        return cashIndex;
    };

}
