package app;

public class MerchantA extends Merchant {

    String email;

    public MerchantA(String name, String phone, String email) {
        super(name, phone);
        this.email = email;
    }

    public String infoMerchant() {
        String name = getName();
        String phone = getPhone();
        return "\nMerchant: " + name + ", " + phone + ", " + email + "\n";
    }
}
