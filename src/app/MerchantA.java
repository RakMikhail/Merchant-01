package app;

public class MerchantA extends  Merchant {

    String email;

    public MerchantA(String name,String surname, String phone, String email) {
        super(name, surname, phone);
        this.email = email;
    }

}
