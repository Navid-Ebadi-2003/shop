public class admin {
    private String name;
    private String pass;
    private String email;

    public admin(String name , String pass , String email) {
        this.name = name;
        this.pass = pass;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPass() {
        return pass;
    }
}
