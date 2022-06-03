package app;

public class MerchantA extends Merchant {

    String email;

    public MerchantA(String name, String phone, String email) {
        super(name, phone);
        this.email = email;
    }
}
