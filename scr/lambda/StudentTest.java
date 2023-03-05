package lambda;

public class StudentTest {
    public static void main(String[] args) {
        Student it = new ItStudent();
        sayHello("John",it);

        Student med = new Student() {
            @Override
            public void sayHello(String name) {
                System.out.println("I will be a doctor");
                System.out.println(name);

            }
        };
        sayHello("Kate",med);
        //lambda expression
        Student noStudent = (name -> System.out.println("I am not a student, My name is " +  name));

    }
    public static void sayHello(String name, Student student){

    }
}
