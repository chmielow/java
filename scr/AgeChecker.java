import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Przed zakupem alkoholu podaj swój wiek ");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("dziękujemy za zakupy");
        } else if (age < 0){
            System.out.println("podaj poprawną wartość");
        }
        else {
            System.out.println("niestety nieletnim alkoholu nie sprzedajmy");
        }
    }
}
