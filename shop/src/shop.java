import java.util.ArrayList;
import java.util.Scanner;

public class shop {
    static void runMenu(){

        ArrayList<user> users= new ArrayList<user>();
        ArrayList<seller> sellers= new ArrayList<seller>();
        ArrayList<admin> admins = new ArrayList<admin>();

        ArrayList<product> products = new ArrayList<product>();

        admins.add(new admin("navid" , "1308" , "naghost7@gmail.com"));

        sellers.add(new seller("adidas", "7878" , "adidas@gmail.com"));
        sellers.add(new seller("apple", "4567" , "apple@gmail.com"));
        sellers.add(new seller("samsung", "3241" , "macrosaft@gmail.com"));

        users.add(new user("puria" , "puuu1392" , "moon@gmail.com" , "09126463222" , "tehran"));
        users.add(new user("nima" , "niii1390" , "nik@gmail.com" , "09386463101" , "tabriz"));

        products.add(new product("macbook m1" , "laptop" , 899.99 , 12 , "apple"));
        products.add(new product("macbook m2" , "laptop" , 1099.99 , 8 , "apple"));
        products.add(new product("galaxy book 2023" , "laptop" , 1049.99 , 15 , "samsung"));
        products.add(new product("A74" , "phone" , 549.99 , 23 , "samsung"));
        products.add(new product("s23" , "phone" , 700.00 , 18 , "samsung"));
        products.add(new product("iphone 14" , "phone" , 799.49 , 23 , "apple"));
        products.add(new product("samsung neo 4k" , "tv" , 1300.00 , 4 , "samsung"));
        products.add(new product("apple tv 2023" , "tv" , 1400.00 , 11 , "apple"));
        products.add(new product("roky2099" , "shoes" , 499.00 , 32 , "adidas"));
        products.add(new product("mars11" , "shoes" , 599.00 , 43 , "adidas"));
        products.add(new product("zuz" , "shirt" , 150.00 , 120 , "adidas"));
        products.add(new product("rrr" , "shirt" , 99.00 , 87 , "adidas"));

        Scanner in = new Scanner(System.in);
        boolean onOff = true;

        while (onOff){

            System.out.println("1.sign in as user");
            System.out.println("2.sign up as user");
            System.out.println("3.sign up as seller");
            System.out.println("4.sign up as admin");

            int command = in.nextInt();
            in.nextLine();

            if(command==1){

                System.out.println("name: ");
                String name = in.nextLine();
                System.out.println("password: ");
                String pass = in.nextLine();
                System.out.println("email: ");
                String email = in.nextLine();
                System.out.println("phone: ");
                String phone = in.nextLine();
                System.out.println("address: ");
                String address = in.nextLine();

                users.add(new user(name , pass , email ,phone , address));

            } //********************************************************************************************************
            else if (command==2){

                System.out.println("name: ");
                String name = in.nextLine();
                System.out.println("password: ");
                String pass = in.nextLine();

                user User = new user( "","","","","");
                for( user i : users){
                    if (i.getName().equals(name)){
                        User = i;
                    }
                }

                if (User.getPass().equals(pass)){

                    boolean repeat = true;
                    while (repeat){

                        System.out.println("1.view products");
                        System.out.println("2.my shopping cart");
                        System.out.println("3.my Purchase history");
                        System.out.println("4.my wallet");
                        System.out.println("5.exit");


                        int command1 = in.nextInt();
                        in.nextLine();

                        if (command1==1){

                            boolean repeat1=true;
                            while (repeat1){

                                System.out.println("1.laptop");
                                System.out.println("2.phone");
                                System.out.println("3.tv");
                                System.out.println("4.shoes");
                                System.out.println("5.shirt");
                                System.out.println("0.back");

                                int command2= in.nextInt();
                                in.nextLine();
                                String cat = "";

                                if (command2==1){
                                    cat = "laptop";
                                }
                                else if (command2==2){
                                    cat = "phone";
                                }
                                else if (command2==3){
                                    cat = "tv";
                                }
                                else if (command2==4){
                                    cat = "shoes";
                                }
                                else if (command2==5){
                                    cat = "shirt";
                                }
                                else{
                                    System.out.println("go to the shopping cart to finalize or change the purchase");
                                    break;
                                }


                                ArrayList <product>ram = new ArrayList<product>();
                                int g =0;
                                for(product i : products){
                                    if(i.getCategoty().equals(cat)){
                                        g++;
                                        System.out.print(g + ".");
                                        i.show();
                                        ram.add(i);
                                    }
                                }
                                System.out.println((g+1) + ".back");

                                int order = in.nextInt();
                                in.nextLine();
                                order-=1;

                                if(order<g && order>=0){
                                    System.out.println("number: ");
                                    int number = in.nextInt();
                                    in.nextLine();
                                    if(number<=ram.get(order).getQuantity()){

                                        if (number*ram.get(order).getPrice()<=User.getWallet()){

                                            User.add_product(ram.get(order).getName() , number);
                                            User.setWallet(User.getWallet()-(number*ram.get(order).getPrice()));
                                            ram.get(order).setQuantity(ram.get(order).getQuantity()-number);
                                            System.out.println("done");

                                        }
                                        else{
                                            System.out.println("There is not enough money in the wallet");
                                        }
                                    }
                                    else {
                                        System.out.println("out of stock");
                                    }
                                }
                                ram.clear();
                            }



                        } //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
                        else if (command1==2){

                        } //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
                        else if (command1==3){

                        } //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
                        else if (command1==4){

                        } //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
                        else {
                            repeat=false;
                        }
                    }
                }
                else {
                    System.err.println("name or password was wrong ");
                }

            } //********************************************************************************************************
            else if (command==3){

            } //********************************************************************************************************
            else if(command==4){

            } //********************************************************************************************************
            else{
                System.err.println("wrong answer");
            }
        }
    }
}
