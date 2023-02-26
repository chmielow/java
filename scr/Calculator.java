import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        float firstNumber = scanner.nextFloat();
        System.out.println("Podaj drugą liczbę");
        float secondNumber = scanner.nextFloat();
        float division;
        division = firstNumber / secondNumber;
        float mod = firstNumber%secondNumber;
        System.out.println("podstawowe wyniki działań na dwóch podanych liczbych: ");
        System.out.println("dodawanie " + (firstNumber + secondNumber));
        System.out.println("odejmowanie " + (firstNumber - secondNumber));
        System.out.println("mnożenie " + (firstNumber * secondNumber));
        System.out.println("dzielenie " + division);
        System.out.println("reszta  dzielenia " + mod);
    }
}
