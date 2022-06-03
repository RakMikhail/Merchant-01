package app;

public class ProductA extends Product implements Sales{

    int qnty;
    double price;

    public ProductA(String name, int qnty, double price) {
        super(name);
        this.qnty = qnty;
        this.price = price;
    }

    @Override
    public double calcSales(int quota, double price) {
        return quota * price;
    }


}
