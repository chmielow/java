public class Student {
    public String name;
    public String lastName;
    public String nick;
    public String email;
    public int index;

    public void introduce(){
        System.out.println("Nazywam się:" + name + lastName);
    }
    public void logIn(){
        System.out.println("Loguje sie za pomoca:" + nick);
    }
    public void myIndexNumber(){
        System.out.println("Moj numer indeksu to:"+ index);
    }
    public void myEmail(){
        System.out.println("Moj email to:" + email);
    }
}
