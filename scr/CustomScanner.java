import java.util.Scanner;

public class CustomScanner {

    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoje imie");
        String name = scanner.nextLine();
        System.out.println("Czesc " + name + " !");
    }*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbe");
        int firstNumber = scanner.nextInt();
        firstNumber *= firstNumber;
        System.out.println("Kwadrat tej liczby " + firstNumber + " !");
    }
}
