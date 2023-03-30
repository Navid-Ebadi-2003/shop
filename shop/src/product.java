public class product {

    private String sellerName;
    private String name;
    private  String categoty;
    private double price;
    private int quantity;

    public product(String name, String categoty, double price, int quantity , String sellerName) {
        this.name = name;
        this.categoty = categoty;
        this.price = price;
        this.quantity = quantity;
        this.sellerName=sellerName;
        //sellerName.add_product(name);
    }

    public String getName() {
        return name;
    }

    public String getCategoty() {
        return categoty;
    }

    public double getPrice() {
        return price;
    }

    public String getSellerName() {
        return sellerName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void show(){
        System.out.println("name: " + name + "  price: " + price + "  quantity: " + quantity );
    }

}
