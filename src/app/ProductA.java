package app;

public class ProductA extends Product {

    int qnty;
    double price;

    public ProductA(String name, int qnty, double price) {
        super(name);
        this.qnty = qnty;
        this.price = price;
    }

}
