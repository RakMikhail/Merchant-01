package app;

//Class for describing the merchant`s
public class Merchant {

    private final String name;
    private final String phone;

    public Merchant(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
