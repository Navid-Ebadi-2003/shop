import java.util.ArrayList;

public class seller extends admin{

    private double wallet=0.00;

    public seller(String name, String pass, String email) {
        super(name, pass, email);
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }
}
