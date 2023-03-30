import java.util.ArrayList;
import java.util.HashMap;

public class user extends admin {
    private ArrayList<HashMap<String,Integer>> history = new ArrayList<HashMap<String , Integer>>();
    private  HashMap<String,Integer> shopping_cart = new HashMap<String,Integer>();
                   //product
    private String phone;
    private String address;
    private double wallet=0.00;

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

    public HashMap<String, Integer> getShopping_cart() {
        return shopping_cart;
    }

    public void add_product(String name , int n){
        shopping_cart.put(name , n);
    }

    public void done(){
        history.add(shopping_cart);
        shopping_cart.clear();
    }

    public void show_cart(){
        if(shopping_cart.isEmpty()) {
            System.out.println("empty");
        }
        else {
            for (String i : shopping_cart.keySet()) {
                System.out.println("name: " + i + "    number: " + shopping_cart.get(i));
            }
            System.out.println("1.make change");
            System.out.println("2.Finalize the purchase");
        }
        System.out.println("0.back");
    }

}
