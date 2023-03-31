public class product {

    private String sellerName;
    private String name;
    private  String category;
    private double price;
    private int quantity;

    public product(String name, String category, double price, int quantity , String sellerName) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
        this.sellerName=sellerName;
        //sellerName.add_product(name);
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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
