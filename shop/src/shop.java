import java.util.ArrayList;

public class shop {
    static void runMenu(){

        ArrayList<user> users= new ArrayList<user>();
        ArrayList<seller> sellers= new ArrayList<seller>();
        ArrayList<admin> admins = new ArrayList<admin>();

        ArrayList<product> products = new ArrayList<product>();

        admins.add(new admin("navid" , "1308" , "naghost7@gmail.com"));

        sellers.add(new seller("adidas", "7878" , "adidas@gmail.com"));
        sellers.add(new seller("apple", "4567" , "apple@gmail.com"));
        sellers.add(new seller("macrosaft", "3241" , "macrosaft@gmail.com"));

        users.add(new user("puria" , "puuu1392" , "moon@gmail.com" , "09126463222" , "tehran"));
        users.add(new user("nima" , "niii1390" , "nik@gmail.com" , "09386463101" , "tabriz"));

        products.add(new product("macbook m1" , "laptop" , 899.99 , 12 , "apple" ));
    }
}
