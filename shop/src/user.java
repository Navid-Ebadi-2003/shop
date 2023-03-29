import java.util.ArrayList;
import java.util.HashMap;

public class user extends admin {

    private ArrayList<HashMap<String,Integer>> history = new ArrayList<HashMap<String , Integer>>();
    private  HashMap<String,Integer> shopping_cart = new HashMap<String,Integer>();
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

    public void add_product(String name , int n){
        shopping_cart.put(name , n);
    }

    public void done(){
        history.add(shopping_cart);
        shopping_cart.clear();
    }

}
