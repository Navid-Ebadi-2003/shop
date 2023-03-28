import java.util.ArrayList;

public class seller extends admin{

    private double wallet=0;

    private ArrayList<String> products = new ArrayList<String>();

    public seller(String name, String pass, String email) {
        super(name, pass, email);
    }

    public void add_product(String nameOfP){
        products.add(nameOfP);
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }
}
