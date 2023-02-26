import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Podaj pierwszą liczbę");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        int secondNumber = scanner.nextInt();
        System.out.println("podstawowe wyniki działań na dwóch podanych liczbych: ");
        System.out.println("dodawanie " + calculator.sum(firstNumber,secondNumber));
        System.out.println("odejmowanie " + calculator.subtraction(firstNumber,secondNumber));
        System.out.println("mnożenie " + calculator.multiplication(firstNumber,secondNumber) );
        System.out.println("dzielenie " + calculator.division(firstNumber,secondNumber));
        System.out.println("reszta  dzielenia " + calculator.mod(firstNumber,secondNumber));
    }
}
