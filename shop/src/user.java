public class user extends admin {

    private String phone;
    private String address;
    private double wallet=0.0;

    public user(String name, String pass, String email , String phone, String address ) {
        super(name, pass, email);
        this.phone = phone;
        this.address = address;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }
}
