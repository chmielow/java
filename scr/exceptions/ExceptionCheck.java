package exceptions;

import java.util.Scanner;

public class ExceptionCheck {
    public static void main(String[] args) throws InvalidAgeException {
        int age;
        System.out.println("podaj swoj wiek");
        Scanner scanner = new Scanner(System.in);
        age = scanner.nextInt();
        if (age < 0){
            throw new InvalidAgeException("Your age is not valid");
        }
        if((age >= 18) & (age < 100)) {
            System.out.println("jestes pelnoletni");
        } else {
            System.out.println("nie jestes pelnoletni");
        }

    }
}
