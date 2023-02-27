public class User {

    public String username;
    public String password;
    public User(String username, String password){
        System.out.println("hello z konstruktora");
        this.username = username;
        this.password = password;
    }
    public void sayHello(){
        System.out.println("Hello m name is " + username);
    }
}
